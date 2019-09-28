import java.util.*;
public class PE5_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter the number of strings you want :");
        //int num = scan.nextInt();
        //System.out.println("you entered number is : ");

        System.out.println("Enter the string : ");
        String str = scan.nextLine();
        System.out.println("you entered string is : " + str);

        String[] Array = str.split("\\s+");
        Arrays.sort(Array);
        List<String> list = new ArrayList<>();
        for (String a : Array) {
            System.out.printf(a + " ");
            list.add(a);

        }
        System.out.println(list);
    }
}
