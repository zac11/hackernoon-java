package outputs;

class Aclass3 {
    Aclass3() {
        System.out.println("Class A Constructor");
    }
}

class Bclass3 extends Aclass3 {
    Bclass3() {
        System.out.println("Class B Constructor");
         //super();
    }
}

public class problem8 {

    public static void main(String[] args) {
        Bclass3 obj = new Bclass3();
    }
}
