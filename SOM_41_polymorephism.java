class Animal {
    void animalsound() {
        System.out.println("The animal make a sound");
    }
}

class cat extends Animal {
    void animalsound() {
        System.out.println("The cat sount is :muw muw");
    }
}

class Dog extends Animal {
    void animalsound() {
        System.out.println("The Dog sount is :bo bo bo bo");
    }
}

public class SOM_41_polymorephism {

    public static void main(String[] args) {
        Animal a = new Animal();
        cat c = new cat();
        Dog d = new Dog();
        a.animalsound();
        c.animalsound();
        d.animalsound();
    }
}
