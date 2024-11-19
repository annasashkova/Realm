package entity;

import java.util.ArrayList;

public class Realm {

    private ArrayList<Region> regions;
    private City capital;

    private static final Realm INSTANCE = new Realm();

    private Realm(){

    }

    public static Realm getInstance(){
        return INSTANCE;
    }


}
