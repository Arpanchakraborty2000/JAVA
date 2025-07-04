public class new_switch_statement {
    public static void main(String[] args) {

        String day = "Saturday";
        String result = " ";

        // switch(day){

        // case "Saturday","Sunday" -> System.out.println("Wakeup 6 am");
        // case "MOnday" -> System.out.println("Wakeup 7 am");

        // default -> System.out.println("Wakeup 8 am");
        // }

        result = switch (day) {

            case "Saturday", "Sunday" -> "Wakeup 6 am";
            case "MOnday" -> "Wakeup 7 am ";

            default -> "Wakeup 8 am ";
        };
        System.out.println(result);
    }
}