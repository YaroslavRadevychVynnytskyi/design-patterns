package patterns.abstractfactory.db.mysql;

import patterns.abstractfactory.db.objects.QueryExecutor;

public class MySQLQueryExecutor implements QueryExecutor {
    @Override
    public void execute(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}
