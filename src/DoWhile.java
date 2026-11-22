import java.util.Scanner;
public class DoWhile {
    static void main() {
        Scanner scanner= new Scanner(System.in);
        int gay;
        System.out.print("Enter a Number: ");
        gay = scanner.nextInt();

        do {
            System.out.println(gay);
            gay++;
        } while (gay<=10);

        Switches();
    }
    static void Switches() {
        Scanner scanner=new Scanner(System.in);
        int flavor;

        System.out.print("Enter a number twin: ");
        flavor=scanner.nextInt();

        switch (flavor) {
            case 1:
                System.out.print("Chocolate");
                break;
            case 2:
                System.out.print("Strawberry");
                break;
            case 3:
                System.out.print("Mocha");
                break;
            default:
                System.out.print("Vanilla, You basic bitch.");
        }
    }
}
