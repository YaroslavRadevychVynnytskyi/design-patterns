package patterns.creational.abstractfactory.example1.factory;

import patterns.creational.abstractfactory.example1.objects.Connection;
import patterns.creational.abstractfactory.example1.objects.QueryExecutor;
import patterns.creational.abstractfactory.example1.postgres.PostgresConnection;
import patterns.creational.abstractfactory.example1.postgres.PostgresQueryExecutor;

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
