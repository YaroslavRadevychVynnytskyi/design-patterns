package patterns.creational.abstractfactory.example1;

import patterns.creational.abstractfactory.example1.factory.DBFactory;
import patterns.creational.abstractfactory.example1.factory.MySQLFactory;
import patterns.creational.abstractfactory.example1.factory.PostgresFactory;
import patterns.creational.abstractfactory.example1.objects.Connection;
import patterns.creational.abstractfactory.example1.objects.QueryExecutor;

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
