package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("" , "", "");

        Statement statement = connection.createStatement();

//        String insert = "insert into employee(id,name,address) values(2,'Rahul' , ' Mumbai') ";
        String update = "update employee set name = 'Ramesh' where id = 2";
        String delete = "delete from employee where id =2";

//        int count = statement.executeUpdate(insert);
        int count = statement.executeUpdate(update);
//        int count = statement.executeUpdate(dalete);


//        System.out.println(count + " row inserted");
        System.out.println(count + " row updated");
        System.out.println(count + " row Deleted");


    }
}
/*
DDL - Create , Alter , Drop
DML - insert , Update , Delete
DQL - Select
*/
