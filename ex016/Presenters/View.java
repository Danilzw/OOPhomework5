package ex016.Presenters;

import java.util.Collection;

import javax.xml.crypto.Data;


import ex016.Models.Table;

public interface View {

    public void showTables(Collection<Table>tables);

    public void setObserver(Observer observer);

    public void showReservationResult(int tablenumber);

    public void reservationTable(Data orderData,int tablenumber,String name);
}
