package patterns.abstractfactory.db;

import patterns.abstractfactory.db.factory.MySQLFactory;
import patterns.abstractfactory.db.factory.PostgresFactory;
import patterns.abstractfactory.db.objects.Connection;
import patterns.abstractfactory.db.objects.QueryExecutor;

public class Application {
    public static void main(String[] args) {
        String dbType = "mysql";

        DBFactory dbFactory = switch (dbType) {
            case "mysql" -> new MySQLFactory();
            case "postgres" -> new PostgresFactory();
            default -> throw new IllegalArgumentException("Unknown database type: " + dbType);
        };

        Connection connection = dbFactory.createConnection();
        QueryExecutor queryExecutor = dbFactory.createQueryExecutor();

        connection.connect();
        queryExecutor.execute("SELECT * FROM users;");
    }
}
