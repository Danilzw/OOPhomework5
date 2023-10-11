package ex016.Presenters;

import java.util.Collection;

import javax.xml.crypto.Data;

import ex016.Models.Table;

public class MainPreseter implements Observer {
    
    private final Model model;
    private final View view;

    public MainPreseter(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setObserver(this);
    }

    private Collection<Table> loadTables()
    {
        return model.loadTables();
    }

    public void UIshowTables()
    {
        view.showTables(loadTables());
    }


    private void showReservation(int tablenumber)
    {
        view.showReservationResult(tablenumber);
    }

    public void onReservationTable(Data orderData,int tablenumber,String name)
    {

        try
        {
            int reservationRes =  model.reservationTable(orderData, tablenumber,name);
            showReservation(reservationRes);
        }
        catch(RuntimeException e)
        {
            showReservation(-1);
        }
       
    }

    public int onChangeReservation(int reservationId, Data newData) {
        try {
            int updatedReservationId = model.changeReservation(reservationId, newData);
            showReservation(updatedReservationId);
            return updatedReservationId;
        } catch (RuntimeException e) {
            showReservation(-1);
            return -1;
        }
    }

}
