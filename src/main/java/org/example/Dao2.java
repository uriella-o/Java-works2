package org.example;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

    public class Dao2 {
        public void saveTeacher(Teacher teacher) throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mySql://localhost:3306/school", "root", "admin");

            PreparedStatement statement = connection.prepareStatement("insert into students(name,course,age)" +
                    "values(?,?,?)");
            statement.setString(1,teacher.getName());
            statement.setString(2,teacher.getCourseteaching());
            statement.setInt(3, teacher.getAge());

            statement.execute();
}
    }
