// The Main class - note that the class name is identical to the file name
public class Main{
    // The Main method - where execution starts. Always be identical to this.
    public static void main(String[] args){
        //Printing a String to console with a new line at the end
        System.out.println("Hello World!");

        // Printing a String to console without a new line at the end
        System.out.print("Hello World!");

        // Declaring Variables
        int numMotors;
        boolean isSpinning;
        String motorName;
        double motorPosition;

        // Assigning values to variables that are already declared
        numMotors = 5;
        isSpinning = false;
        motorName = "leftFront";
        motorPosition = 59.64;

        // Initializing Variables
        int numMotors2 = 5;
        boolean isSpinning2 = false;
        String motorName2 = "leftFront";
        double motorPosition2 = 59.64;

        // Printing variables with a new line at the end
        System.out.println(numMotors);
        System.out.println(isSpinning);
        System.out.println(motorName);
        System.out.println(motorPosition);

        // Printing variables without a new line at the end
        System.out.print(numMotors2);
        System.out.print(isSpinning2);
        System.out.print(motorName2);
        System.out.print(motorPosition2);

    }
}