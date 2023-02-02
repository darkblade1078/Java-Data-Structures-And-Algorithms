package classes;

public class person {
    private String name;
    private int age;
    private boolean alive;

    public person(String name, int age, boolean alive) {

        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public String get_name() {

        return this.name;
    }

    public int get_age() {

        return this.age;
    }

    public boolean get_alive() {

        return this.alive;
    }

    public void set_name(String name) {

        this.name = name;
        return;
    }

    public void set_age(int age) {

        this.age = age;
        return;
    }

    public void set_alive(boolean alive) {

        this.alive = alive;
        return;
    }
}
