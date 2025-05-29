import java.util.*;
class parent{
    void display(){
        System.out.println("parent class");
    }
}
class child1 extends parent{
    void show(){
        System.out.println("child1 class");
    }
}
class child2 extends parent{
    void print(){
        System.out.println("child2 class");
    }
}
class Main{
    public static void main(String[]args){
        child2 obj = new child2 ();
        child1 obj1 = new child1 ();
        obj.display();
        obj1.show();
        obj1.display();
        obj.print();
    }
}