


public class App {

    public static void main(String[] args) {

        Animal animal = Animal.CAT;

        switch (animal){
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
        }

        System.out.println(Animal.DOG);
        System.out.println("Enum name as a String: " + Animal.DOG.name());

        System.out.println(Animal.DOG.getClass());

        System.out.println(Animal.DOG instanceof Animal);

        System.out.println(Animal.MOUSE.getName());

        System.out.println();

        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);
    }
}
