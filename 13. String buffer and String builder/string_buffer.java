

public class string_buffer {
    public static void main(String[] args) {
        // string buffer is mutable that can change 

        StringBuffer sb = new StringBuffer("Arpan ");
        sb.append("Baban");

        System.out.println(sb);

        sb.insert(6, "Hii ");
        System.out.println(sb.length());
        sb.setLength(30);
        System.out.println(sb);
    }
}
