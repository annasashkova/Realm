package service;

import entity.City;
import entity.District;
import entity.Realm;
import entity.Region;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class RealmManager {

    public static void displaysCapital(){
        System.out.println("Столица Государства: "+ "\n" + Realm.getInstance().getCapital().toStringWithSitizens());
    }

    public static void displaysDistrictsNumber(){
        ArrayList <Region> regions = Realm.getInstance().getRegions();
        ArrayList <District> districts = new ArrayList<>();
        for(Region region: regions){
            districts.addAll(region.getDistricts());
        }
        System.out.println("Количество областей в Государстве: " + districts.size());
    }

    public static void displaysRealmSquare(){
        System.out.println("Площадь Государства: " + Realm.getInstance().getSquare());
    }

    public static void displeysDistrictCenters(){
        ArrayList<Region> regions = Realm.getInstance().getRegions();
        ArrayList <District> districts = new ArrayList<>();
        for(Region region: regions){
            districts.addAll(region.getDistricts());
        }
        ArrayList<City> districtCenters = new ArrayList<>();
        for(District district : districts){
            districtCenters.add(district.getDistrictCenter());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Областные центры Государства: ").append("\n");
        for(City center : districtCenters){
            sb.append(center.toStringWithSitizens());
        }
        System.out.println(sb.toString());
    }
}
