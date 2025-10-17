package patterns.creational.abstractfactory.example1.factory;

import patterns.creational.abstractfactory.example1.objects.Connection;
import patterns.creational.abstractfactory.example1.objects.QueryExecutor;

public interface DBFactory {
    Connection createConnection();
    QueryExecutor createQueryExecutor();
}
