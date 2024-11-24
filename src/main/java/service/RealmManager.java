package service;

import entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class RealmManager {

    public static void selectAction() {
        Scanner sc = new Scanner(System.in);
        String  choice = "";
        do {
            System.out.println("Выберите операцию! Вывести на консоль: ");
            System.out.println("1.Столицу Государства");
            System.out.println("2.Количество областей в Государстве");
            System.out.println("3.Площадь Государства");
            System.out.println("4.Областные центры Государтсва");
            System.out.println("5.Средний возраст жителей Государства");
            System.out.println("6.Спиков жителей с именами на букву n");
            System.out.println("7.Спиок жителей с количество букв в имени равном n");
            System.out.println("Введите номер нужного действия и нажмите <ENTER>:\n" +
                    "(Для выхода из программы просто нажмите клавишу <ENTER>)");
            choice = sc.nextLine();
            switch (choice) {
                case "1": displaysCapital(); break;
                case "2": displaysDistrictsNumber(); break;
                case "3": displaysRealmSquare(); break;
                case "4": displeysDistrictCenters(); break;
                case "5": displaysAverageAgeCitizens(); break;
                case "6": displaysCitizensNamesStartLetter(); break;
                case "7": displaysCitizensNameLettersNumber(); break;
                default: System.out.println("Выберите один из пунктов меню, или нажмите <ENTER> " +
                        "для выхода из программы\n"); break;
            }
        } while(!choice.isEmpty());
    }

    public static void displaysCapital() {
        System.out.println("Столица Государства: " + "\n" + Realm.getInstance().getCapital().toStringWithSitizens());
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

    public static void displeysDistrictCenters() {
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
            sb.append(center.toStringWithSitizens());
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

    public static void displaysCitizensNamesStartLetter() {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву для выведения списка жителей, имена который на нее начинаются:  ");
        char firstLetter = (char) (sc.nextInt());
        ArrayList<Citizen> citizensNameLetter = new ArrayList<>();
        for (Citizen citizen : citizens) {
            if (firstLetter == citizen.getName().charAt(0)) {
                citizensNameLetter.add(citizen);
            }
        }
        System.out.println("Список жителей с именами на букву " + firstLetter + ":" + "\n");
        for (Citizen citizen : citizensNameLetter) {
            System.out.println(citizen.toString());
        }
    }

    public static void displaysCitizensNameLettersNumber() {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число - количество букв в имени жителя: ");
        int lettersNumber = sc.nextInt();
        ArrayList<Citizen> citizensNameNumberLetters = new ArrayList<>();
        for (Citizen citizen : citizens) {
            if (lettersNumber == citizen.getName().length()) {
                citizensNameNumberLetters.add(citizen);
            }
        }
        System.out.println("Список жителей с именами, количество букв в которых " + lettersNumber + ": \n");
        for (Citizen citizen : citizensNameNumberLetters) {
            System.out.println(citizen.toString());
        }
    }
}

