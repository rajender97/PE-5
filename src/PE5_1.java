import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PE5_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();

        Scanner sc = new Scanner(System.in);
        String j;
        ArrayList l = new ArrayList();
        for (int i = 0; i < num; i++) {
            j = sc.nextLine();
            l.add(j);
        }
        System.out.println(l);



        System.out.print("Enter any index: ");
        int i = scan.nextInt();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your replace: ");
        String sub = in.nextLine();





        l.set(i, sub);

        System.out.println(l);

        l.clear();
        System.out.println(l);


    }
}
