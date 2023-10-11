package ex016.Presenters;

import javax.xml.crypto.Data;

public interface Observer {
    
    void onReservationTable(Data orderData,int tablenumber,String name);
    int onChangeReservation(int reservationId, Data newData);
}
