package patterns.creational.abstractfactory.db.mysql;

import patterns.creational.abstractfactory.db.objects.QueryExecutor;

public class MySQLQueryExecutor implements QueryExecutor {
    @Override
    public void execute(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}
