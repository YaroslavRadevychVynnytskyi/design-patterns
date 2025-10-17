package patterns.creational.abstractfactory.example1.mysql;

import patterns.creational.abstractfactory.example1.objects.Connection;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}
