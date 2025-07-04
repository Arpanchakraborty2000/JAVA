public class String_method {
    public static void main(String[] args) {
        String name = "Arpan";

        int value = name.length();
        System.out.println("Print the value of total string : "+value);

        String lower = name.toLowerCase();
        System.out.println("Convert the character in lower case : "+lower);

        String upper = name.toUpperCase();
        System.out.println("Convert the character in upper case : "+upper);

        String nontreamString = "   Arpan   ";
        //String trimstring = nontreamString.trim();
        System.out.println("Remove the space in this sting : "+nontreamString.trim());

        System.out.println("Print start the number with the value : "+name.substring(2));

        System.out.println("Print start the number with the value and also put the end value : "+name.substring(1,4));

        System.out.println("Replace the lettert with the new : "+name.replace('r','y'));

        System.out.println("Print true or false : "+name.startsWith("Arp"));

        System.out.println("Print true or false : "+name.endsWith("Arp"));
    }
}

