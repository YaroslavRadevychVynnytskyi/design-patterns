package patterns.abstractfactory.db.postgres;

import patterns.abstractfactory.db.objects.Connection;

public class PostgresConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Postgres database...");
    }
}
