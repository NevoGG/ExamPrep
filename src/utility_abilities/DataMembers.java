package utility_abilities;
import java.util.*;

// dont accept primitives.
public class DataMembers {

    public void newLinkedList(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add(2, "hi"); // add at index
        linkedList.remove(); // removes first
        linkedList.remove(5); // removes at index
        linkedList.remove("hi"); // removes value
        int size = linkedList.size();
    }
    public void newList(){ // an array with a modifiable size.
        ArrayList<String> list = new ArrayList<>();
        list.add("hi"); // adds at first location.
        list.add(1, "hello"); // adds at index
        String valueAtZero  = list.get(0); // by index
        list.remove(1);
        int listSize = list.size();

    }
    public void newHashSet(){
        HashSet<Integer> hashSet = new HashSet<>(); // doesnt accept primitives
        hashSet.add(5);
        hashSet.remove(5);
        int setSize = hashSet.size();
        boolean isFiveInSet = hashSet.contains(5);

    }

    public void newHashMap(){
        HashMap<String, Integer> hashMap = new HashMap<>(); // doesnt accept primitives
        hashMap.put("Nevo", 6);
        hashMap.get("Nevo");
        hashMap.remove("Nevo");
        boolean isNevoThere = hashMap.containsKey("Nevo");
        int mapSize = hashMap.size();
    }
}
