package ex016.Models;


import javax.xml.crypto.Data;


public class Reservation {
    
    private final int id;
    private static int counter;

    private Data data;
    public void setData(Data data) {
        this.data = data;
    }

    private String name;

    {
        id = ++counter;
    }


    public Data getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Reservation(Data data,String name)
    {
        this.data = data;
        this.name = name;
    }


}
