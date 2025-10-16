package patterns.creational.abstractfactory.db;

import patterns.creational.abstractfactory.db.factory.DBFactory;
import patterns.creational.abstractfactory.db.factory.MySQLFactory;
import patterns.creational.abstractfactory.db.factory.PostgresFactory;
import patterns.creational.abstractfactory.db.objects.Connection;
import patterns.creational.abstractfactory.db.objects.QueryExecutor;

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
