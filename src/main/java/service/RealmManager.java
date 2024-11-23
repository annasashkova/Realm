package service;

import entity.District;
import entity.Realm;
import entity.Region;

import java.util.ArrayList;

public class RealmManager {

    public static void displaysCapital(){
        System.out.println("Столица Государства: "+ "\n" + Realm.getInstance().getCapital().toString());
    }

    public static void districtsNumber(){
        ArrayList <Region> regions = Realm.getInstance().getRegions();
        ArrayList <District> districts = new ArrayList<>();
        for(Region region: regions){
            districts.addAll(region.getDistricts());
        }
        System.out.println("Количество областей в Государстве: " + districts.size());
    }


}
