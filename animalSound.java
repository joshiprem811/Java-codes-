import java.util.*;
class Animal1 {
    void sound() {
        System.out.println("Animal roars");
    }
}
class Cat extends Animal1 {
    void sound() {
        System.out.println("Cat Meows");
    }
}
class bird extends Animal1 {
    void sound() {
        System.out.println("Bird chirps");
    }
}
class animalSound {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.sound();
        bird b = new bird();
        b.sound();
        Cat c = new Cat();
        c.sound();
    }
}
