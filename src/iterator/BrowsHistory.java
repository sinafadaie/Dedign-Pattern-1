package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowsHistory {
    private List<String> urls = new ArrayList<>();  //to store history

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        int lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }
}
