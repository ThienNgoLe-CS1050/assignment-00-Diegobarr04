import javax.swing.JOptionPane;

public class Diego_Barrett_Assignment02 {
    public static void main(String[] args) {
        // 1. Variable declaration
        String firstName;
        char middleInitial;
        String lastName;
        int age;
        double grossAnnualPay;
        double taxRate;
        double netAnnualPay;

        // 2. Reading input using input dialog boxes
        firstName = JOptionPane.showInputDialog("Enter your first name:");
        String middleInitialString = JOptionPane.showInputDialog("Enter your middle initial:");
        middleInitial = middleInitialString.charAt(0); // Get the first character as the middle initial
        lastName = JOptionPane.showInputDialog("Enter your last name:");
        
        // Reading integer value for age
        String ageString = JOptionPane.showInputDialog("Enter your age:");
        age = Integer.parseInt(ageString);

        // Reading double values for grossAnnualPay and taxRate
        String grossPayString = JOptionPane.showInputDialog("Enter your gross annual pay:");
        grossAnnualPay = Double.parseDouble(grossPayString);

        String taxRateString = JOptionPane.showInputDialog("Enter your tax rate (e.g., 0.30 for 30%):");
        taxRate = Double.parseDouble(taxRateString);

        // 3. Processing data: Calculating netAnnualPay
        netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);

        // 4. Displaying the output in the console
        System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ",");
        System.out.println("You are " + age + " years old now.");
        System.out.printf("It is amazing that you made $%.2f this year. With the tax rate of %.2f, ", grossAnnualPay, taxRate);
        System.out.printf("you can take home $%.2f.%n", netAnnualPay);
    }
}