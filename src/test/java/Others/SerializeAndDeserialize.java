package Others;

import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class SerializeAndDeserialize {
    /* Data Members of the POJO class*/

    private String badmintonBrand;
    private String racketName;

    /* Getter methods*/
    public String getBadmintonBrand(){
        return badmintonBrand;
    }

    public String getRacketName(){
        return racketName;
    }

    /* Setter Methods*/
    public void setBadmintonBrand(String badmintonBrand){
        this.badmintonBrand = badmintonBrand;
    }

    public void setRacketName(String racketName){
        this.racketName = racketName;
    }

    @Test
    public void Serialize_Deserialize() throws JsonProcessingException{
        /* Create object of the class*/
        SerializeAndDeserialize pojo = new SerializeAndDeserialize();

        /* Set the values using the setter methods */
        pojo.setBadmintonBrand("YONEX");
        pojo.setRacketName("VOLTRIC Z-FORCE II");

        //System.out.println("Serialized data -----> ");
        ObjectMapper objMap = new ObjectMapper();

        String pojoString  = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
/*
        System.out.println(pojoString);
*/

        System.out.println("De-Serialized data -----> ");

        SerializeAndDeserialize deserial = objMap.readValue(pojoString, SerializeAndDeserialize.class);
        System.out.println("Badminton Brand -----> "+deserial.getBadmintonBrand());
        System.out.println("Racket name ------> "+deserial.getRacketName());




    }
}
