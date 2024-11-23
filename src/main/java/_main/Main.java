package _main;

import entity.Realm;
import service.RealmManager;

public class Main {
    public static void main(String[] args) {
        System.out.println(Realm.getInstance().toString());
        RealmManager.displaysCapital();
        RealmManager.displaysDistrictsNumber();
        RealmManager.displaysRealmSquare();
        RealmManager.displeysDistrictCenters();
    }
}
