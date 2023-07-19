package outputs;

class Abase{
    int x=5;

}

class Bbase extends Abase{
    int x = 10;
}
public class problem2 {
    public static void main(String [] args){
        Abase obj1 = new Abase();
        Abase obj2 = new Bbase();

        System.out.println(obj1.x + " " + obj2.x);
    }
}
