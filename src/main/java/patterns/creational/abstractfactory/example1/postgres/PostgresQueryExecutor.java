package patterns.creational.abstractfactory.example1.postgres;

import patterns.creational.abstractfactory.example1.objects.QueryExecutor;

public class PostgresQueryExecutor implements QueryExecutor {

    @Override
    public void execute(String query) {
        System.out.println("Executing Postgres query: " + query);
    }
}
