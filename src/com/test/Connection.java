package com.test;

public class Connection {
    private static final Connection con = new Connection();
    private Connection() {
    }

    public static Connection getOneConnectionOnly() {
        return con;
    }
    public static Connection getNewConnection(){
        return new Connection();
    }
}