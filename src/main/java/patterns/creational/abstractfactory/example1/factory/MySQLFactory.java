package patterns.creational.abstractfactory.example1.factory;

import patterns.creational.abstractfactory.example1.objects.Connection;
import patterns.creational.abstractfactory.example1.objects.QueryExecutor;
import patterns.creational.abstractfactory.example1.mysql.MySQLConnection;
import patterns.creational.abstractfactory.example1.mysql.MySQLQueryExecutor;

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
