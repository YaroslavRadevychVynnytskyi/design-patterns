package patterns.creational.abstractfactory.db.postgres;

import patterns.creational.abstractfactory.db.objects.Connection;

public class PostgresConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Postgres database...");
    }
}
