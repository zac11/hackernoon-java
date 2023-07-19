package outputs;

import com.fasterxml.jackson.databind.ser.Serializers;

class BaseClass{
    int x;
    BaseClass(){
        x=5;
    }

    void disp(){
        System.out.println("Class BaseClass: " + x);
    }
}


class ExtendedB extends BaseClass{
    int y = 10;
    ExtendedB(){
        y = 10;
    }

    void disp() {
        System.out.println("Class B: " + y);
    }
}
public class problem9 {

    BaseClass obj = new ExtendedB();
    obj.display();
}
}
