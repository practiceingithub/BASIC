package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("" , "", "");
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        String address;

        System.out.println("enter id , name and address");
        id = scanner.nextInt();
        name = scanner.next();
        address = scanner.next();

//        String insert = " insert into employee (id, name, address) values(?,?,?)";

        String insert ="update employess set name=? , address=? where id= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);

//        ((PreparedStatement) preparedStatement).setInt(1,id);
//        ((PreparedStatement) preparedStatement).setString(2,name);
//        ((PreparedStatement) preparedStatement).setString(2,address);

        ((PreparedStatement) preparedStatement).setString(1,name);
        ((PreparedStatement) preparedStatement).setString(2,address);
        ((PreparedStatement) preparedStatement).setInt(2,id);

        int count = preparedStatement.executeUpdate();
//        System.out.println(count + "row inserted");
        System.out.println(count + "row updated");




    }
}
