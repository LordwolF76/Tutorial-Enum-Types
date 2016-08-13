/**
 * Created by LordwolF on 8/12/2016.
 */
public enum Animal {
    CAT("Felix"), DOG("Rufus"), MOUSE("Jerry");

    private String name;

    Animal(String name){
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This animal is called: " + name;

    }
}
