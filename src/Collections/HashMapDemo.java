package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap<>();
        hashMap.put("user1", "Java");
        hashMap.put("user2", "UI/UX");
        hashMap.put("user3", "C++");
        hashMap.put("user4","PHP");

        System.out.println(hashMap);
        System.out.println(hashMap.entrySet());

        Set set =hashMap.entrySet();
        for (Object element:set){
            Map.Entry mapEntry=((Map.Entry) element);
            System.out.println(mapEntry.getKey()+"-"+mapEntry.getValue());
        }
        String specialty=(String) hashMap.get("user1");
        specialty+=" channged developer";
        hashMap.put("user1", specialty);

        set =hashMap.entrySet();
        for (Object element:set){
            Map.Entry mapEntry=((Map.Entry) element);
            System.out.println(mapEntry.getKey()+"-"+mapEntry.getValue());
        }





    }
}
