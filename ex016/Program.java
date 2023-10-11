package ex016;

import java.util.Date;

import javax.xml.crypto.Data;

import ex016.Models.TableModel;
import ex016.Presenters.MainPreseter;
import ex016.Presenters.Model;
import ex016.Presenters.View;
import ex016.View.BookingView;


public class Program
{
    public static void main(String[] args) {
        
        View view = new BookingView();
        Model model = new TableModel();

        MainPreseter preseter = new MainPreseter(model,view);

        preseter.UIshowTables();

        view.reservationTable(new Data(){},3,"Danil");

        preseter.onChangeReservation(1,new Data() {});
    }
}