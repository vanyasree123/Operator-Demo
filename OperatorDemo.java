public class OperatorDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        int num1 = 10;
        int num2 = 3;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("Equal to: " + (num1 == num2));
        System.out.println("Not Equal to: " + (num1 != num2));
        System.out.println("Greater than: " + (num1 > num2));
        System.out.println("Less than: " + (num1 < num2));
        System.out.println("Greater than or equal to: " + (num1 >= num2));
        System.out.println("Less than or equal to: " + (num1 <= num2));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("Logical AND: " + (bool1 && bool2));
        System.out.println("Logical OR: " + (bool1 || bool2));
        System.out.println("Logical NOT: " + (!bool1));

        // Combining Relational and Logical Operators
        System.out.println("\nCombining Relational and Logical Operators:");
        System.out.println("Is num1 greater than num2 and bool1 is true? " + ((num1 > num2) && bool1));
        System.out.println("Is num1 less than num2 or bool2 is true? " + ((num1 < num2) || bool2));
    }
}
