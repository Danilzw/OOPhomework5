package ex016.Models;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.crypto.Data;

import ex016.Presenters.Model;


public class TableModel implements Model {

    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTables() {
        if(tables == null)
        {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    @Override
    public int reservationTable(Data data, int tablenumber, String name) {
        for(Table table:loadTables())
        {
            if(table.getNumber() == tablenumber)
            {
                Reservation reservation = new Reservation(data,name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }

        }
        return 0;
    }

    public int changeReservation(int reservationId, Data newData)
    {
        for(Table table:tables)
        {
            for(Reservation reservation : table.getReservations())
            {
                if(table.getNumber() == reservationId)
                {
                    reservation.setData(newData);
                    return reservation.getId();
                }
            }
        }
        return 0;
    }
    
}
