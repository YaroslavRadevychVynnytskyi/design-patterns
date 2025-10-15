package patterns.abstractfactory.db.factory;

import patterns.abstractfactory.db.objects.Connection;
import patterns.abstractfactory.db.DBFactory;
import patterns.abstractfactory.db.objects.QueryExecutor;
import patterns.abstractfactory.db.mysql.MySQLConnection;
import patterns.abstractfactory.db.mysql.MySQLQueryExecutor;

public class MySQLFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public QueryExecutor createQueryExecutor() {
        return new MySQLQueryExecutor();
    }
}
