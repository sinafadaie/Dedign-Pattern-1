package iterator;

public class Main {
    public static void  main(String[] args){

        BrowsHistory history = new BrowsHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        for(int i=0; i < history.getUrls().size(); i++){
            String url = history.getUrls().get(i);
            System.out.println(url);
        }
    }
}
