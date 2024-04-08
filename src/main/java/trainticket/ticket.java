package trainticket;

import java.sql.*;

public class ticket {
    public passengers showpassenger() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainticket", "root", "lolirock");
        PreparedStatement statement = connect.prepareStatement("select*from ticket");

        statement.execute();
        ResultSet result = statement.getResultSet();
        while (result.next()) {
            int id = result.getInt("id");
            String name1 = result.getString("name");
            int price = result.getInt("price");
            return new passengers(id,name1, price);

        }
        return null;
    }
    public void gettable(passengers ticket) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainticket", "root", "lolirock");
        PreparedStatement statement = connect.prepareStatement(" insert into ticket(id,name,price)" + "values(?, ?, ?)");
        statement.setInt(1, ticket.getId());
        statement.setString(2, ticket.getName());
        statement.setInt(3, ticket.getPrice());
        statement.execute();

    }

    public passengers getpassenger(String name) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainticket", "root", "lolirock");
        PreparedStatement statement = connect.prepareStatement("select* from ticket where name = ?");
        statement.setString(1, name);
        statement.execute();
        ResultSet result = statement.getResultSet();
        while (result.next()) {
            int id = result.getInt("id");
            String name1 = result.getString("name");
            int price = result.getInt("price");
            return new passengers(id,name1, price);

        }
        return null;

    }
    public void deletepassengers(String name) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainticket", "root", "lolirock");
        PreparedStatement statement = connect.prepareStatement("delete from ticket where name = ?");
        statement.setString(1, name);
    }

    public void updatepassenger(passengers passengers ,int id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainticket", "root", "lolirock");
        PreparedStatement statement = connect.prepareStatement("update ticket set name = ?, price = ? where id = ?;");
        statement.setString(1, passengers.getName());
        statement.setInt(2,  passengers.getPrice());
        statement.setInt(3, id);
        statement.execute();


    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ticket user = new ticket();
//        System.out.println("Id: "+ user.getpassenger("name").getId());
//        System.out.println("Name: "+ user.getpassenger("name").getName());
//        System.out.println("Price: "+ user.getpassenger("name").getPrice());
//
//
//        user.deletepassengers("rat");
//        System.out.println(user.showpassenger().getId());
//        System.out.println(user.showpassenger().getName());
//        System.out.println(user.showpassenger().getPrice());

        passengers update = new passengers(5,"Tamara",1000);
        user.updatepassenger(update, 5);

    }
}

