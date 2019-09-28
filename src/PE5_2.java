import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class PE5_2 {
    public static void countFrequencies(String[] list){

                Set<String> str = new HashSet<String>(Arrays.asList(list));
                for (String s : str)
                    System.out.println(s + ": " + Collections.frequency(Arrays.asList(list), s));
            }

            public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your string : " );

                String name = sc.nextLine();
                String[] list = name.split("[\\s\\-\\.\\'\\?\\,\\_\\@\\*\\;]+");

                for(int i=0;i<list.length;i++) {
                    System.out.println("the split is " + list[i]);
                }

                countFrequencies(list);
            }
        }


