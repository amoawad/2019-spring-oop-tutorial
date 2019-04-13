public class DatabaseConnection {

    private static DatabaseConnection connection;

    private DatabaseConnection() {

    }

    public static DatabaseConnection getConnection() {
        if(connection == null) {
            synchronized (DatabaseConnection.class) {
                if(connection == null) {
                    connection = new DatabaseConnection();
                }
            }
        }

        return connection;
    }

}
