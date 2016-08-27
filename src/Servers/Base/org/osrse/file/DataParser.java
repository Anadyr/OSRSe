package org.osrse.file;

/**
 * Created by Jonathan on 1/14/16.
 */
public interface DataParser<C, T, F>  {

    public void append(C c, T t);

    public void pack(C c, F f);
}
