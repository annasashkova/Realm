package entity;

import java.util.ArrayList;

public class District {
    private ArrayList<City> cities;
    private int square;
    private City regionalCenter;

    public District(){

    }

    public District(ArrayList<City> cities, int square,City regionalCenter){
        this.cities = cities;
        this.square = square;
        this.regionalCenter = regionalCenter;
    }

}
