package gemini;

public class removeDupes {

    public static String removeDupesWoMap(String str){
        // create  new strinbuilder object
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(sb.indexOf(String.valueOf(c))==-1){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String [] args){
        String str = "my name is rahul yadav";
        String withoutrepeated = removeDupesWoMap(str);
        System.out.println("Without repeated---->"+withoutrepeated);
    }
}
