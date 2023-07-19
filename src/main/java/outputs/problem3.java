package outputs;

class Abase1{
    void display(){
        System.out.println("Class A");
    }
}

class Bbase1 extends Abase1{
    @Override
    void display() {
        System.out.println("Class A");
    }
}
public class problem3 {

    public static void main(String [] args){
        Abase1 obj1 = new Abase1();
        Abase1 obj2 = new Bbase1();
        obj1.display();
        obj2.display();
    }
}
