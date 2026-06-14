package iterator.Cenna;

import java.util.Iterator;

public class Main {
    public static void  main(String[] args){

        BrowsHistory history = new BrowsHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        var iterator = history.iterator();
        while (iterator.hasNext()){
            String current = (String) iterator.next();
            System.out.println(current);
        }

    }
}
