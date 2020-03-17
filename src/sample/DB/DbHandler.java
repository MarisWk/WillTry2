package sample.DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DbHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql//" + dbHost + ":"
                + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString,
                dbUser,dbPass);
        return dbConnection;
    }
        public void addBookToDB(String bookName, String bookAuthor, String bookYear, String bookStatus){
            String insert = "INSERT INTO " + Const.BOOK_TABLE + "(" +
                    Const.BOOK_NAME + "," + Const.BOOK_AUTHOR + "," +
                    Const.BOOK_YEAR + "," + Const.BOOK_STATUS + ")" +
                    "VALUES(?,?,?,?)";

            try {

                PreparedStatement prSt = getDbConnection().prepareStatement(insert);
                prSt.setString(1,bookName);
                prSt.setString(2,bookAuthor);
                prSt.setString(3,bookYear);
                prSt.setString(4,bookStatus);

                prSt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
}
