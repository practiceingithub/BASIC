package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("" , "", "");

        String insert = " insert into employee (id, name, address) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
for(int i=0; i<10;i++){
    String name = null;
    ((PreparedStatement) preparedStatement).setString(2,name);
    String address = null;
    ((PreparedStatement) preparedStatement).setString(3,address);
    int id = 0;
    ((PreparedStatement) preparedStatement).setInt(1,id);

    preparedStatement.addBatch();
    }
int[] count = preparedStatement.executeBatch();
        System.out.println(count.length);

    }
}
