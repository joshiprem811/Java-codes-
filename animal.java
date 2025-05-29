public class animal {
    public void move(){
        System.out.println("animal moves");
    }
}
class cheetah extends animal{
    public void move(){
    System.out.println("cheetah is running");
    }
}
class Main1{
    public static void main(String[] args) {
        animal anime=new animal();
        anime.move();
        cheetah Cheetah= new cheetah();
        Cheetah.move();
    }
}