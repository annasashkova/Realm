package service;

public class Randomazer {

    public static String randString() {
        int counter = (int) (5 + Math.random() * 6);
        char[] string = new char[counter];
        for (int i = 0; i < counter; i++) {
            string[i] = (char) (97 + (Math.random() * 26));
        }
        return new String(string);
    }

    public static Integer randAge() {
        return (int) (Math.random() * 90);
    }

    public static Integer randSquare() {
        return (int) (20 + Math.random() * 440);
    }
}
