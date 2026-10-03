9
import java.util.Scanner;
public class BloodBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] donors = {"YAMINI", "ADITI", "VAMYA", "SANTHI", "SUKRITI", "PRAGYA", "PRANATHI", "LUCKY"};
        String[] bloodgroups = {"O+","O-","A+","A-","AB+","AB-","B+","B-"};
        int[] stock = {2,1,3,0,4,2,1,0};

        System.out.println("BLOOD BANK MENU ");
        System.out.println("1.Show donors");
        System.out.println("2.Find a ma4cth");
        System.out.println("3.exit");
        System.out.print("enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();  

        String BloodGroup = "";
        if(choice == 2) {
            System.out.print("Enter blood group: ");
             BloodGroup = sc.nextLine();
        }

        switch(choice) {

	        case 1:
                System.out.println("DONOR NAMES AND BLOOD MENU");
                for(int i=0; i<donors.length; i++) {
                    System.out.println("Donor: " + donors[i]);
                    System.out.println(" Blood Group: " + bloodgroups[i]);
                    System.out.println("Units: " + stock[i]);
                }
                break;


                case 2:
                int count = 0;
                for(int i=0; i<donors.length; i++) {
                    if(bloodgroups[i].equals(BloodGroup)) {
                        System.out.println("Donor: " + donors[i]);
                        System.out.println(" Blood Group: " + bloodgroups[i]);
                        System.out.println("Units: " + stock[i]);

                        if(stock[i] > 0) {
                            System.out.println("available");
                        } else {
                            System.out.println("not available");
                        }
                        count++;
                    }
                }
                if(count == 0) {
                    System.out.println("no donor");
                }
                break;

                case 3:
                System.out.println("exit");
                break;

            default:
                System.out.println("invalid");
        }

        sc.close();
    }
}
