import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        int custdeposits;
        float rate;
        Scanner tahia = new Scanner(System.in);
        //scanner class
        System.out.println(" please enter the customer deposit");
        custdeposits = tahia.nextInt();
        System.out.println(" enter the rate ");
        rate = tahia.nextFloat();
//implicit conversion
        double interest = custdeposits *( rate / 100);
        String interestasastring = Double.toString(interest);
        System.out.println("interestasastring = " + interestasastring);
//Explicit conversion
        int roundedinterest = (int) interest;
        System.out.println("roundedinterest = " + roundedinterest);
    }

}
