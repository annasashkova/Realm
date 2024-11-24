package entity;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class Realm {
    private ArrayList<Region> regions = new ArrayList<>();
    private City capital;
    private int square;
    private String name;
    private static final Realm INSTANCE = new Realm("Великое");

    private Realm(String name) {
        this.name = name;
        int counter = (int) (2 + Math.random() * 3);
        for (int i = 0; i < counter; i++) {
            regions.add(new Region());
        }
        for (Region region : regions) {
            this.square = this.square + region.getSquare();
        }
        Random random = new SecureRandom();
        ArrayList<District> districts = regions.get(random.nextInt(regions.size())).getDistricts();
        ArrayList<City> cities = districts.get(random.nextInt(districts.size())).getCities();
        this.capital = cities.get(random.nextInt(cities.size()));
    }

    public static Realm getInstance() {
        return INSTANCE;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Государство ").append(name).append(" площадью ").append(square).append(". Столица: ")
                .append(capital.toString()).append("\n")
                .append("Содержит регионы: ");

        for (Region region : regions) {
            sb.append(region.toString()).append("\n");
        }
        return sb.toString();
    }
}
