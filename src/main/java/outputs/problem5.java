package outputs;
interface AInterface{
 void display();
}

class Bclass implements AInterface{

    @Override
    public void display() {
        System.out.println("In class Bclass ");
    }
}
public class problem5 {
    public static void main(String [] args){
        AInterface obj = new Bclass();
        obj.display();
    }
}
