import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        List linkedList = new LinkedList();
        linkedList.add("x");
        linkedList.add("y");
        linkedList.add("z");

        processList(list);
        processList(linkedList);
    }

    private static void processList(List list) {

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            String s = (String) iterator.next();
        }

        for(Object o : list) {
            String s = (String) o;
        }

        for(int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
        }

    }

}
