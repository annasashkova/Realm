package entity;

import service.Randomazer;

import java.security.Provider;
import java.util.ArrayList;

public class City {

    private ArrayList<Citizen> citizens;
    private int square;
    private String name;

    public City() {
        this.name = Randomazer.randString();
        this.square = Randomazer.randSquare();
        int counter = (int)(100+ Math.random()*900);
        for(int i = 0; i<=counter; i++){
            citizens.set(i, new Citizen());
        }
    }

    public ArrayList<Citizen> getCitizens() {
        return citizens;
    }

    public void setCitizens(ArrayList<Citizen> citizens) {
        this.citizens = citizens;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
