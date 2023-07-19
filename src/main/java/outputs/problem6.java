package outputs;

class AClass {
    void display() {
        System.out.println("Class A");
    }
}

class BClass extends AClass {
    void display() {
        System.out.println("Class B");
    }
}

class CClass extends BClass {
    void display() {
        System.out.println("Class C");
    }
}

public class problem6 {

    public static void main(String [] args){
        AClass obj = new CClass();
        obj.display();
    }
}
