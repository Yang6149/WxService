package com.ming.dbc;

import java.sql.Connection;
import java.sql.SQLException;

public interface DataBaseConnection {
    public Connection getConnection();
    public void close() throws SQLException, Exception;
}
