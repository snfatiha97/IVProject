// Variable “mapC” & “mapD” are both separate Map[String, String] objects of employee IDs and employee names, where:import java.util.HashMap;
import java.util.LinkedHashMap; // ordered based on type
import java.util.HashMap;

public class q1b{
    public static void main(String[] args) {

        // mapC → ["123": "Justin",  "456": "Owen", "789": "Hugo"]
        LinkedHashMap<Integer, String> mapC = new LinkedHashMap<Integer, String>();
        mapC.put(123, "Justin");
        mapC.put(456, "Owen");
        mapC.put(789, "Hugo");
        //insert new map entries

        // mapD → ["123": "George", "555":"Jack", "888": "Julian"]
        LinkedHashMap<Integer, String> mapD = new LinkedHashMap<Integer, String>();
        mapD.put(123, "George");
        mapD.put(555,"Jack");
        mapD.put(888, "Julian");

    // Combine them both into the variable “mapC” and print it out.
        // Insert mapC into mapE
        HashMap<Integer, String> mapE = new HashMap<>(mapD);
        // Insert mapD to mapC
        // Combine both mapC and mapD into mapE
        mapC.forEach((key, value) -> mapE.merge(key,value,(value1, value2) -> value1));

        // print results
        System.out.println("Map C: " + mapC);
        System.out.println("Map D: " + mapD);
        System.out.println("Combine Map C and Map D: " + mapE);
    // Print out the reason why the result no longer has the value "Justin"?
        System.out.println("The reason that Justin is no longer in the value is because the key=123 appear in mapC and mapD");
        System.out.println("Since the mapD value is George at key = 123 thus it has been replaced");

    // Return values in “mapC” where key contains "5"
        mapC.containsKey(5);
        System.out.println("Value key(5) : " + mapC.get(5));

    // Remove map entries where the value contains the "o" character in “mapC”. (ignore case)
        //insert map entries
        mapC.put(124,"o");
        System.out.println("New Map C: " + mapC);
        mapC.remove(124,"o");
        System.out.println("Updated Map C: " + mapC);

    }
}

