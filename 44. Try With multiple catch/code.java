
public class code {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        String str = null;

        int nums[] = new int[5];

        try {
            j = 18 / i; // it will throw ArithmeticException
            System.out.println(nums[1]);
            System.out.println(nums[5]); // it will throw an ArrayIndexOutOfBoundsException exception
            System.out.println(str.length()); // it will throw normal Exception
        } catch (ArithmeticException e) {
            System.out.println("can not divident by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Be your limit");
        } catch (Exception e) { // this will handel all type of exception
            System.out.println("something went to wrong ");
        }
    }
}
