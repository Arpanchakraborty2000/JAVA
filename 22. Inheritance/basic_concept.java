
// INHERITANCE => LIKE FATHER PROPERTY IS YOU PROPERTY ( like you inheritance your father property)
// IS A RELATIONSHIP 
// LIKE YOU BORROW SOMETHIS FROM THE BASE CLASS OR SUPER CLASS 
// JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE 
class calculator { // This is base class or super class

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int minus(int n1, int n2) {
        return n1 - n2;
    }
}

class advcal extends calculator { // It inherite the feature from base class calculator

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

 class veryadvcal extends advcal{ // this is example of multi level inheritance 

    public double power(int n1 , int n2 ){
       return Math.pow(n1, n2);
    }
    
}


public class basic_concept {
    public static void main(String[] args) {

        calculator c = new calculator();
        System.out.println("The addotion of two number: " + c.add(5, 5));
        System.out.println("The subtraction of two number: " + c.minus(100, 10));

        System.out.println();
        System.out.println();
        advcal b = new advcal();
        System.out.println("The addotion of two number: " + b.add(5, 5));
        System.out.println("The subtraction of two number: " + b.minus(100, 10));
        System.out.println("The multiplication of two number: " + b.multi(5, 5));
        System.out.println("The division of two number: " + b.div(200, 10));

        System.out.println();
        System.out.println();
        veryadvcal v = new veryadvcal();
        System.out.println("The addotion of two number: " + v.add(5, 5));
        System.out.println("The subtraction of two number: " + v.minus(100, 10));
        System.out.println("The multiplication of two number: " + v.multi(5, 5));
        System.out.println("The division of two number: " + v.div(200, 10));
        System.out.println("The power of two number: " + v.power(4, 2));

    }
}
