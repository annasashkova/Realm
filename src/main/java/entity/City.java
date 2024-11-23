package entity;

import service.Randomazer;

import java.util.ArrayList;

public class City {

    private ArrayList<Citizen> citizens;
    private int square;

    public City() {
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
}
