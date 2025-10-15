package patterns.abstractfactory.db;

import patterns.abstractfactory.db.objects.Connection;
import patterns.abstractfactory.db.objects.QueryExecutor;

public interface DBFactory {
    Connection createConnection();
    QueryExecutor createQueryExecutor();
}
