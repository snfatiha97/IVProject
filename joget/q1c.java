public class q1c {

    public static void main(String[] args) {

    // I have a string variable “str” of "111222888222555". Reverse this string and assign it back to variable “str”. Print it out.
        String str = "111222888222555";
        System.out.println("Original str: " + str);
        for (int i = 0; i < str.length(); i++) {
            str = str.substring(1, str.length() - i) + str.charAt(0) + str.substring(str.length() - i);
        }
        System.out.println("Reversed str: " + str);

    // Then, replace the last occurrence of "222" in variable “str”  with "aaa" and assign it back to variable “str”. Print it out.
        for (int i = 0; i < str.length(); i++){
            str = str.substring(0,9)+"aaa"+str.substring(12);
        }
        System.out.println("Replaced str (last 2 -> a): " + str);
    }
}
