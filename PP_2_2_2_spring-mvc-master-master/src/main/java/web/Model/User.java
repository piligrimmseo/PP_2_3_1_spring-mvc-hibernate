package web.Model;

public class User {

    private int id;
    private String surname;
    private String name;

    private int age;

    public User() {

    }

    public User(int id, String surname, String name, int age) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
