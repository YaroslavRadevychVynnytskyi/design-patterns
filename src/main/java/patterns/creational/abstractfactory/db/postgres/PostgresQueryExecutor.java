package patterns.creational.abstractfactory.db.postgres;

import patterns.creational.abstractfactory.db.objects.QueryExecutor;

public class PostgresQueryExecutor implements QueryExecutor {

    @Override
    public void execute(String query) {
        System.out.println("Executing Postgres query: " + query);
    }
}
