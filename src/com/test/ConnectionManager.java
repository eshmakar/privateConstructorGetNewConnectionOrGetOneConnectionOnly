package com.test;

public class ConnectionManager {
    public static void main(String[] args) {
        System.out.println(Connection.getOneConnectionOnly());
        System.out.println(Connection.getOneConnectionOnly());
        System.out.println(Connection.getOneConnectionOnly());
        System.out.println(Connection.getNewConnection());
        System.out.println(Connection.getNewConnection());
        System.out.println(Connection.getNewConnection());
    }
}
