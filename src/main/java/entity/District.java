package entity;

import service.Randomazer;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class District {
    private ArrayList<City> cities = new ArrayList<>();
    private int square;
    private City districtCenter;
    private String name;

    public District() {
        this.name = Randomazer.randString();
        int counter = (int) (1 + Math.random() * 4);
        for (int i = 0; i < counter; i++) {
            cities.add(new City());
        }
        for (City city : cities) {
            this.square = this.square + city.getSquare();
        }
        Random random = new SecureRandom();
        this.districtCenter = cities.get(random.nextInt(cities.size()));
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Область ").append(name).append(" площадью ").append(square).append(". Список городов: ").append("\n");
        for (City city : cities) {
            sb.append(city.toString()).append("\n");
        }
        return sb.toString();
    }
}
