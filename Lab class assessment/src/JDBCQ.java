import java.sql.*;

public class JDBCQ {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

    static final String USER = "username";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            System.out.println("Creating table");
            stmt = conn.createStatement();
            String sql = "CREATE TABLE STATE " +
                    "(id INTEGER not NULL, " +
                    " statename VARCHAR(255), " +
                    " statecapital VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);

            System.out.println("Inserting records into the table...");
            sql = "INSERT INTO State " +
                    "VALUES (1, 'Assam', 'Dispur')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO State " +
                    "VALUES (3, 'Colrado', 'Denver')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO State " +
                    "VALUES (2, 'Nebraska', 'Lincoln')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO State " +
                    "VALUES (4, 'Ohio', 'Columbus')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
            System.out.println("\nDisplay the table...");

            sql = "SELECT * FROM State";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", State Name: " + rs.getString("statename"));
                System.out.println(", State Capital: " + rs.getString("statecapital"));
            }
            rs.close();

            sql = "UPDATE State " +
                    "SET id = 30 WHERE statename = 'Ohio'";
            stmt.executeUpdate(sql);

            sql = "SELECT * FROM State";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", State Name: " + rs.getString("statename"));
                System.out.println(", State Capital: " + rs.getString("statecapital"));
            }
            rs.close();


        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
}