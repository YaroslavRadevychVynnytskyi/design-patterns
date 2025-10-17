package patterns.creational.abstractfactory.example1.mysql;

import patterns.creational.abstractfactory.example1.objects.QueryExecutor;

public class MySQLQueryExecutor implements QueryExecutor {
    @Override
    public void execute(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}
