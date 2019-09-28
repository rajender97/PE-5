import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class PE5_5 {
    public Map<String,String> exchangeValues(){
        Map<String,String> map = new HashMap<>();
        map.put("key1","java");
        map.put("key2","c++");
        Iterator<Map.Entry<String,String>> iterator =  map.entrySet().iterator();
        String temp  = null;
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            if(entry.getKey().equals("key1"))
                temp = entry.getValue();
            entry.setValue("");
            if(entry.getKey().equals("key2"))
                entry.setValue(temp);
        }
        System.out.println(map.toString());
        return map;
    }
    public static void main(String[] args) {
        PE5_5 keyValuePairs = new PE5_5();
        keyValuePairs.exchangeValues();
    }
}



