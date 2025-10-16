package patterns.creational.abstractfactory.db.factory;

import patterns.creational.abstractfactory.db.objects.Connection;
import patterns.creational.abstractfactory.db.objects.QueryExecutor;

public interface DBFactory {
    Connection createConnection();
    QueryExecutor createQueryExecutor();
}
