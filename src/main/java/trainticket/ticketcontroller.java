package trainticket;

import java.sql.SQLException;

public class ticketcontroller {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        passengers ticket1 = new passengers(1,"name",2);
        passengers ticket2 = new passengers(2,"name",2);
        passengers ticket3 = new passengers(3,"name",2);

        ticket dao = new ticket();
        dao.gettable(ticket1);
        dao.gettable(ticket2);
        dao.gettable(ticket3);
    }
}
