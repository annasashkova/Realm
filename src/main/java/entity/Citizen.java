package entity;

public class Citizen {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private Realm realm;

    public static int counter;

    public Citizen(){

    }

    public Citizen(int id, String name, String lastName, int age, Realm realm){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.realm = realm;
    }
}
