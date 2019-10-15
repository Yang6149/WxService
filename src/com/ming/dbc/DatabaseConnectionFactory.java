package com.ming.dbc;

import java.sql.Connection;

public class DatabaseConnectionFactory {
    public static DataBaseConnection getDataBaseConnection() throws Exception{
        MysqlDatabaseConnection conn = new MysqlDatabaseConnection();
        return conn;
    }


}
