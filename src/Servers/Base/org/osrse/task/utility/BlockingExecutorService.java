/*
 * The MIT License
 *
 * Copyright 2012 Jonathan.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.osrse.task.utility;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * An <code>ExecutorService</code> that waits for all its events to finish
 * executing.
 *
 * @author Graham Edgecombe
 */
public class BlockingExecutorService implements ExecutorService {

    /**
     * The service backing this service.
     */
    private ExecutorService service;

    /**
     * A list of pending tasks.
     */
    private BlockingQueue<Future<?>> pendingTasks = new LinkedBlockingQueue<Future<?>>();

    /**
     * Creates the executor service.
     *
     * @param service The service backing this service.
     */
    public BlockingExecutorService(ExecutorService service) {
        this.service = service;
    }

    /**
     * Waits for pending tasks to complete.
     *
     * @throws java.util.concurrent.ExecutionException if an error in a task occurred.
     */
    public void waitForPendingTasks() throws ExecutionException {
        while (pendingTasks.size() > 0) {
            if (isShutdown()) {
                return;
            }
            try {
                pendingTasks.take().get();
            } catch (InterruptedException e) {
                continue;
            }
        }
    }

    /**
     * Gets the number of pending tasks.
     *
     * @return The number of pending tasks.
     */
    public int getPendingTaskAmount() {
        return pendingTasks.size();
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return service.awaitTermination(timeout, unit);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        List<Future<T>> futures = service.invokeAll(tasks);
        for (Future<?> future : futures) {
            pendingTasks.add(future);
        }
        return futures;
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        List<Future<T>> futures = service.invokeAll(tasks, timeout, unit);
        for (Future<?> future : futures) {
            pendingTasks.add(future);
        }
        return futures;
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return service.invokeAny(tasks);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return service.invokeAny(tasks, timeout, unit);
    }

    @Override
    public boolean isShutdown() {
        return service.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return service.isTerminated();
    }

    @Override
    public void shutdown() {
        service.shutdown();
    }

    @Override
    public List<Runnable> shutdownNow() {
        return service.shutdownNow();
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        Future<T> future = service.submit(task);
        pendingTasks.add(future);
        return future;
    }

    @Override
    public Future<?> submit(Runnable task) {
        Future<?> future = service.submit(task);
        pendingTasks.add(future);
        return future;
    }

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        Future<T> future = service.submit(task, result);
        pendingTasks.add(future);
        return future;
    }

    @Override
    public void execute(Runnable command) {
        service.execute(command);
    }

}


