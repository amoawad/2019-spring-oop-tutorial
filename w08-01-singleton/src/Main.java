public class Main {

    public static void main(String[] args) {

        DatabaseConnection dbConnection = DatabaseConnection.getConnection();
        DatabaseConnection dbConnection1 = DatabaseConnection.getConnection();
        DatabaseConnection dbConnection2 = DatabaseConnection.getConnection();
        DatabaseConnection dbConnection3 = DatabaseConnection.getConnection();
        DatabaseConnection dbConnection4 = DatabaseConnection.getConnection();

        System.out.println(dbConnection);
        System.out.println(dbConnection1);
        System.out.println(dbConnection2);
        System.out.println(dbConnection3);
        System.out.println(dbConnection4);

    }

}
