package patterns.creational.abstractfactory.example1.postgres;

import patterns.creational.abstractfactory.example1.objects.Connection;

public class PostgresConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Postgres database...");
    }
}
