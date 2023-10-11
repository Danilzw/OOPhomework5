package ex016.Models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private final int number;

    private static int counter;

     // Коллекция которая хранит столики
    private final Collection<Reservation> reservations = new ArrayList<>();

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    {
        number = ++counter;
    }

    public int getNumber() {
        return number;
    }

    public String toString()
    {
        return String.format("Столик:#%d",number);
    }
    
}
