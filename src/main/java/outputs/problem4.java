package outputs;
class Abase2 {
    int x = 5;
}

class Bbase2 extends Abase2 {
    int y = 10;
}
public class problem4 {

    public static void main(String [] args){
        Abase2 obj1 = new Abase2();
        Bbase2 obj2 = new Bbase2();
        System.out.println(obj1.x + " " + obj2.x + " " + obj2.y);
    }
}
