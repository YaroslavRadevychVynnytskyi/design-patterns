package patterns.abstractfactory.db.factory;

import patterns.abstractfactory.db.objects.Connection;
import patterns.abstractfactory.db.DBFactory;
import patterns.abstractfactory.db.objects.QueryExecutor;
import patterns.abstractfactory.db.postgres.PostgresConnection;
import patterns.abstractfactory.db.postgres.PostgresQueryExecutor;

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
