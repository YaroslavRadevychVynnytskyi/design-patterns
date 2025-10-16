package patterns.creational.abstractfactory.db.factory;

import patterns.creational.abstractfactory.db.objects.Connection;
import patterns.creational.abstractfactory.db.objects.QueryExecutor;
import patterns.creational.abstractfactory.db.mysql.MySQLConnection;
import patterns.creational.abstractfactory.db.mysql.MySQLQueryExecutor;

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
