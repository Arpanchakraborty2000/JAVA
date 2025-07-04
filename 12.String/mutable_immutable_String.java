
public class mutable_immutable_String {
    public static void main(String[] args) {
        // string is immutable like once create that are no change .....

        String name = "Arpan";
        name = name + " Chakraborty";
        System.out.println(name);

        String s1 = "Arpan";
        String s2 = "Arpan";

        System.out.println(s1==s2);

        // string is create is heap memory when we create a string thet store the value and when we next try to create another string that time just cheek the value if vale is unique its create new objct otherwise if it  will same it create the indexvalue of onther string that are match value as same...
        
    }
}
