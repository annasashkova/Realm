package entity;

import service.Randomazer;

import java.util.ArrayList;

public class Region {

    private ArrayList<District> districts;
    private int square;
    private String name;

    public Region() {
        this.name = Randomazer.randString();
        int counter = (int)(1+ Math.random()*2);
        for(int i = 0; i<=counter; i++) {
            districts.set(i, new District());
        }

        for(District district : districts){
            this.square = this.square + district.getSquare();
        }
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
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
