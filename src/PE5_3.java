import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PE5_3{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scan.nextLine();
        System.out.println("you entered string is : " +str);
                List<String> stringList= Arrays.asList(str.split("[\\W_]+"));
                Map<String,Integer> map=new HashMap<>();
                for(String each:stringList){
                    if(map.containsKey(each)){
                        map.replace(each,map.get(each)+1);
                    }else{
                        map.put(each,1);
                    }
                }

                Map<String,Boolean> booleanMap=new HashMap<>();
                for(String each:map.keySet()){
                    if(map.get(each)>=2){
                        booleanMap.put(each,true);
                    }else {
                        booleanMap.put(each,false);
                    }
                }
                System.out.println( booleanMap.toString());
            }
        }

