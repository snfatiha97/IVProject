import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
//Variable “arrayA” is a string array of car brands: ["Honda", "Toyota", "Proton"]
public class q1 {
    public static void main(String[] args) {
        // define initial array
        String arrayA[] = {"Honda", "Toyota", "Proton"};

        System.out.println("Array A: " + Arrays.toString(arrayA));
//Add "Nissan" to it. Print it out.
        // new element to be added
        String value = "Nissan";

        // convert the array to arrayList
        List<String> newArrayA = new ArrayList<String>(Arrays.asList(arrayA));
        // Add the new element to the arrayList
        newArrayA.add(value);
        // Convert the Arraylist back to array
        arrayA = newArrayA.toArray(arrayA);
    // print the changed array
        System.out.println("New Array A: " + Arrays.toString(arrayA));

//Add "Mazda" as the first element within the string array. Print it out.
        newArrayA.add(0, "Mazda");
        arrayA = newArrayA.toArray(new String[newArrayA.size()]);
        System.out.println("Updated Array A: " + Arrays.toString(arrayA));

//Now make a new variable “arrayB” which is a string array of animals. Combine both arrays into variable “arrayA”. Print it out.
    //destination array
    String[] arrayB = {"Cat","Dog","Elephant","Tiger"};
    System.out.println("Array B: " + Arrays.toString(arrayB));
    //returns a list view of str2 and adds all elements of str2 into list
    newArrayA.addAll(Arrays.asList(arrayB));
    //converting list to array
    arrayA = newArrayA.toArray(arrayB);
    //prints the resultant array
    System.out.println("Array A + Array B: " + Arrays.toString(arrayA));
    }
}

