package entity;

import java.util.ArrayList;

public class Region {

    private ArrayList<District> districts;
    private int square;

    public Region() {

    }

    public Region(ArrayList<District> districts, int square) {
        this.districts = districts;
        this.square = square;
    }
}
