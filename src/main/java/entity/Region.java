package entity;

import java.util.ArrayList;

public class Region {

    private ArrayList<District> districts;
    private int square;

    public Region() {
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
}
