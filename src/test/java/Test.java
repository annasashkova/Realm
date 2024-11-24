import entity.*;

import java.util.ArrayList;

@org.testng.annotations.Test
public class Test {

    Realm realm = Realm.getInstance();

    public static void displaysCapital() {
        System.out.println("Столица Государства: " + "\n" + Realm.getInstance().getCapital().toStringWithCitizens());
    }

    public static void displaysDistrictsNumber() {
        ArrayList<Region> regions = Realm.getInstance().getRegions();
        ArrayList<District> districts = new ArrayList<>();
        for (Region region : regions) {
            districts.addAll(region.getDistricts());
        }
        System.out.println("Количество областей в Государстве: " + districts.size());
    }

    public static void displaysRealmSquare() {
        System.out.println("Площадь Государства: " + Realm.getInstance().getSquare());
    }

    public static void displaysDistrictCenters() {
        ArrayList<Region> regions = Realm.getInstance().getRegions();
        ArrayList<District> districts = new ArrayList<>();
        for (Region region : regions) {
            districts.addAll(region.getDistricts());
        }
        ArrayList<City> districtCenters = new ArrayList<>();
        for (District district : districts) {
            districtCenters.add(district.getDistrictCenter());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Областные центры Государства: ").append("\n");
        for (City center : districtCenters) {
            sb.append(center.toStringWithCitizens());
        }
        System.out.println(sb.toString());
    }

    public static void displaysAverageAgeCitizens() {
        ArrayList<Region> regions = Realm.getInstance().getRegions();
        ArrayList<District> districts = new ArrayList<>();
        for (Region region : regions) {
            districts.addAll(region.getDistricts());
        }
        ArrayList<City> cities = new ArrayList<>();
        for (District district : districts) {
            cities.addAll(district.getCities());
        }
        ArrayList<Citizen> citizens = new ArrayList<>();
        for (City city : cities) {
            citizens.addAll(city.getCitizens());
        }
        int ageAll = 0;
        for (Citizen citizen : citizens) {
            ageAll = ageAll + citizen.getAge();
        }

        int averageAge = ageAll / citizens.size();
        System.out.println("Средний возраст жителей Государства = " + averageAge);
    }
}
