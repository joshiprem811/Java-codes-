import java.util.*;
class Vehical1 {
    void speed() {
        System.out.println("Speed of the vehicle");
    }
}
class Car extends Vehical1 {
    void speed(int a) {
        System.out.println("Speed of the car : " + a);
    }
}
class Cycle extends Vehical1 {
    void speed(int b) {
        System.out.println("Speed of the cycle : " + b);
    }
}
class Vehical {
    public static void main(String[] args) {
        Vehical1 v = new Vehical1();
        v.speed();
        Cycle c = new Cycle();
        c.speed(10);
        Car car = new Car();
        car.speed(60);
    }
}
