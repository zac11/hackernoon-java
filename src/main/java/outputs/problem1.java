package outputs;

class A{
    int x=5;
    void display(){
        System.out.println("Class A -->"+x);
    }
}

class B extends A{
    int x = 10;
    void display() {
        System.out.println("Class B: " + x);
    }
}


public class problem1 {
    /**
     * Given this code, what will be the output
     */
    public static void main(String [] args){
        A obj = new B();
        obj.display();
    }

}
