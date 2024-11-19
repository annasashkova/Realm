package entity;

import java.util.ArrayList;

public class City {

    private ArrayList<Citizen> citizens;
    private int square;

    public City(){

    }

    public City(ArrayList<Citizen> citizens, int square){
        this.citizens = citizens;
        this.square = square;
    }

}
