package entity;

import service.Randomazer;

import java.util.ArrayList;

public class City {

    private ArrayList<Citizen> citizens = new ArrayList<>();
    private int square;
    private String name;

    public City() {
        name = Randomazer.randString();
        square = Randomazer.randSquare();
        int counter = (int) (5 + Math.random() * 25);
        for (int i = 0; i < counter; i++) {
            citizens.add(new Citizen());
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Город ").append(name).append(" площадью ").append(square).append(". Cписок жителей: ").append("\n");
        for (Citizen citizen : citizens) {
            sb.append(citizen.toString()).append("\n");
        }
        return sb.toString();
    }
}
