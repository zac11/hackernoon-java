package outputs;

class Aclass2 {
    void display() {
        System.out.println("Class A");
    }
}

class Bclass2 extends A {
    void display() {
        System.out.println("Class B");
    }
}

public class problem7 {
    public static void main(String[] args) {
        Bclass2 obj = new Bclass2();
        //((Aclass2)obj).display();
    }
}
