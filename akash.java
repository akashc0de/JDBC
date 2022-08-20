package MyFirstProject.com;

import java.sql.*;

public class akash {
    public static void main(String[] args) {
    try{
        Connection conn= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\asus\\Downloads\\sqlite-tools-win32-x86-3390200\\sqlite-tools-win32-x86-3390200\\tt.db");
        //conn.setAutoCommit(false);
        Statement statement= conn.createStatement();
        statement.execute("CREATE table IF NOT EXISTS contact"+"" +
                "(name TEXT,phoneNumber INTEGER, email TEXT)");
       // statement.execute("INSERT into contact(name,phoneNumber,email)"+
         //                 "VALUes('akash',7866598,'akash@gmail.com')");

      //  statement.execute("INSERT into contact(name,phoneNumber,email)"+
      //          "VALUes('akshaya',467543,'akshaya@gmail.com')");

       // statement.execute("INSERT into contact(name,phoneNumber,email)"+
       //         "VALUes('deepika',5853625,'deepika@gmail.com')");

     //   statement.execute("UPDATE contact SET phoneNumber=576380 WHERE name='akash'");
      //  statement.execute("DELETE FROM contact WHERE name='akash'");

        //statement.execute("INSERT into contact (name,phoneNumber,email)"+
         //                "VALUES('akash',756445667,'ak@gmail.com')");

        statement.execute("SELECT * from contact");
        ResultSet result= statement.getResultSet();
        while(result.next()){
            System.out.println(result.getString("name") +" "+
                               result.getInt("phoneNumber")+" "+
                               result.getString("email"));
        }
        result.close();

        statement.close();
        conn.close();
    }catch (SQLException e){
        System.out.println("Something wrong"+e.getMessage());
    }
    }
}
