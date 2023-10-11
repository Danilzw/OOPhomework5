package ex016.View;

import java.util.Collection;

import javax.xml.crypto.Data;


import ex016.Models.Table;
import ex016.Presenters.Observer;
import ex016.Presenters.View;



public class BookingView  implements View{

    private Observer observer;

    public void setObserver(Observer observer) {
        this.observer = observer;
    }


    // Для отображения столиков
    public void showTables(Collection<Table>tables)
    {
        for(Table table: tables)
        {
            System.out.println(table);
        }
    }


    public void reservationTable(Data orderData,int tablenumber,String name)
    {
        if(observer != null)
        {
            observer.onReservationTable(orderData, tablenumber, name);
        }

    }

    public void showReservationResult(int tablenumber)
    {
        if(tablenumber > 0)
        {
            System.out.println(tablenumber + " Зарезервирован");
        }
        else
        {
            System.out.println("Какая то ошибка");
        }
    }

    public void changeReservation(int reservationId, Data newData) {
        if (observer != null) {
            int result = observer.onChangeReservation(reservationId, newData);
            if (result > 0) {
                System.out.println("Резервация #" + result + " успешно изменена");
            } else {
                System.out.println("Резервация не найдена");
            }
        }
    }
    


}
