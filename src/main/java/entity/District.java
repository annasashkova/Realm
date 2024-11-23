package entity;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class District {
    private ArrayList<City> cities;
    private int square;
    private City regionalCenter;

    public District(){
        int counter = (int)(2+ Math.random()*4);
        for(int i = 0; i<=counter; i++) {
            cities.set(i, new City());
        }

        for(City city : cities){
            this.square = this.square + city.getSquare();
        }

        Random random = new SecureRandom();
        this.regionalCenter = cities.get(random.nextInt(cities.size()));
    }

    public ArrayList<City> getCities(){
        return cities;
    }

    public void setCities(ArrayList<City>cities){
        this.cities = cities;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }
}
