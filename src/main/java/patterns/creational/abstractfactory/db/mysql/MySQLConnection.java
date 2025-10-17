package patterns.creational.abstractfactory.db.mysql;

import patterns.creational.abstractfactory.db.objects.Connection;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}
