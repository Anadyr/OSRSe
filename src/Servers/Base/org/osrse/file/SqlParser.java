package org.osrse.file;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Jonathan on 1/14/16.
 */
public interface SqlParser<T> extends DataParser<T, PreparedStatement, ResultSet> {

    public void append(T t, PreparedStatement statement);

    public void pack(T t, ResultSet set);
}
