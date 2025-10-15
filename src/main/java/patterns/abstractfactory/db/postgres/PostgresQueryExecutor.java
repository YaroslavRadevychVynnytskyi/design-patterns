package patterns.abstractfactory.db.postgres;

import patterns.abstractfactory.db.objects.QueryExecutor;

public class PostgresQueryExecutor implements QueryExecutor {

    @Override
    public void execute(String query) {
        System.out.println("Executing Postgres query: " + query);
    }
}
