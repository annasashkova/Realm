package entity;

public class Realm {

    private static final Realm INSTANCE = new Realm();

    private Realm(){

    }

    public static Realm getInstance(){
        return INSTANCE;
    }


}
