package patterns.creational.abstractfactory.db.factory;

import patterns.creational.abstractfactory.db.objects.Connection;
import patterns.creational.abstractfactory.db.objects.QueryExecutor;
import patterns.creational.abstractfactory.db.postgres.PostgresConnection;
import patterns.creational.abstractfactory.db.postgres.PostgresQueryExecutor;

public class PostgresFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new PostgresConnection();
    }

    @Override
    public QueryExecutor createQueryExecutor() {
        return new PostgresQueryExecutor();
    }
}
