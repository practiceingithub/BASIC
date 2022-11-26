package jdbc;

import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("" , "", "");

            Statement statement = connection.createStatement();
            String select = "select * from employee";
            ResultSet resultSet = ((Statement) statement).executeQuery(select);

            while(resultSet.next()){
                System.out.println(resultSet.getInt((1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)));
            }

        }catch(ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }
    }

}
