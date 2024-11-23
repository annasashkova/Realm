package entity;

import service.Randomazer;

public class Citizen {
    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private final Realm realm;

    private static Long idCounter = 1L;

    public Citizen(){
        this.id = idCounter++;
        this.name = Randomazer.randString();
        this.lastName = Randomazer.randString();
        this.age = Randomazer.randAge();
        this.realm = getRealm();
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Realm getRealm() {
        return Realm.getInstance();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Горожанин ").append(name).append(" ").append(lastName).append(" возрастом ")
                .append(age).append(" и id ").append(id);
        return sb.toString();
    }
}
