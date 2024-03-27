package Labs49;


import java.util.*;

/**
 * class Employee{
 *     public String name;
 *     public String Salary;
 *     public String Department;
 *     public String Email;
 *     public String account;
 * }
 *
 * Consider an API that returns employee data. WAP to retrieve numbers of employees
 * without showing the account number of employees where salary and department is same
 */

public class employeeClassProblem {
    public static void main(String [] args){
        // first simulate an API with a list of hashmaps
        List<HashMap<String, String>> apiresp = new ArrayList<>();

        // add some example data to this response
        apiresp.add(new HashMap<>(){{
            put("Name", "John Doe");
            put("Salary", "50000");
            put("Department", "IT");
            put("Email", "johndoe@example.com");
            put("Account_number", "123456");
        }});

        apiresp.add(new HashMap<>(){{
            put("Name", "Jane Smith");
            put("Salary", "50000");
            put("Department", "IT");
            put("Email", "janesmith@example.com");
            put("Account_number", "789012");

        }});

        apiresp.add(new HashMap<>(){{
            put("Name", "Jordan Smith");
            put("Salary", "80000");
            put("Department", "HR");
            put("Email", "jordansmith@example.com");
            put("Account_number", "889912");

        }});

        // now process the data
        List<HashMap<String,String>> processedData = processData(apiresp);

        processedData.forEach(System.out::println);
    }
    public static List<HashMap<String,String>> processData(List<HashMap<String,String>> apiResponse){

        List<HashMap<String, String>> processedData = new ArrayList<>();
        Map<String, Integer> counts = new HashMap<>();

        for (HashMap<String, String> employee : apiResponse) {
            HashMap<String, String> temp = new HashMap<>(employee);
            temp.remove("Account_number");

            String key = temp.get("Salary") + "-" + temp.get("Department"); // Create a composite key
            counts.put(key, counts.getOrDefault(key, 0) + 1);
        }

        // Generate the final output
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            HashMap<String, String> result = new HashMap<>();
            String[] keyParts = entry.getKey().split("-");
            result.put("Salary", keyParts[0]);
            result.put("Department", keyParts[1]);
            result.put("Count", String.valueOf(entry.getValue()));
            processedData.add(result);
        }

        return processedData;

    }
}
