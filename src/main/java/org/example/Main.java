package org.example;

import java.sql.*;

public class Main {
    public  void getdata() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","lolirock");
        //        PreparedStatement statement = connect.prepareStatement(" Create table Students( name varchar (50), course varchar(100));");
        PreparedStatement statement = connect.prepareStatement(" insert into Student( name,email,age)" + "values('Clare', 'Computer science', 17)");
        statement.execute();
    }
    public void createtable() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","lolirock");
//        PreparedStatement statement = connect.prepareStatement(" Create table Students( name varchar (50), course varchar(100));");
//        PreparedStatement statement = connect.prepareStatement(" Create table Students( name,course,age)" + "values('Clare', 'Computer science', 17)");
//        statement.execute();

    }
    public  void main(String[] args) throws ClassNotFoundException, SQLException {
        getdata();
    }
}