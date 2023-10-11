package ex016.Presenters;

import java.util.Collection;

import javax.xml.crypto.Data;


import ex016.Models.Table;

public interface Model {
    

    Collection<Table> loadTables();

    int reservationTable(Data data,int tablenumber,String name);
    int changeReservation(int reservationId, Data newData);
}
