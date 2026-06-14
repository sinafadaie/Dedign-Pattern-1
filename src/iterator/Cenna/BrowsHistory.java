package iterator.Cenna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//exactly what we're done in
//Java advance collection.3
//-------------------
//we use preUrls for list ()
//we use urls for Array

public class BrowsHistory implements Iterable {

    private List<String> preUrls = new ArrayList<>();  //to store history
    private final String[] urls = new String[10];

    public void push(String url){
        preUrls.add(url);

        for (int i=9; i >0 ; i--){
            urls[i] = urls[i-1];
        }
        urls[0] = url;
    }

    public String pop(){
        int lastIndex = preUrls.size() - 1;
        var lastUrl = preUrls.get(lastIndex);
        preUrls.remove(lastUrl);

        //-----------
        for (int i=0; i < urls.length; i++){
            urls[i] = urls[i+1];
        }
        urls[urls.length] = null;

        //return lastUrl;
        return urls[0];
    }

    public List<String> getPreUrls() {
        return preUrls;
    }

    public String[]getUrls() {
        return urls;
    }

    @Override
    public Iterator<?> iterator() {
        //return new ListIterator(this);
        return new ArrayIterator(this);
    }

    //---------------------------List
    private class ListIterator implements Iterator<String>{
        private int index ;
        private final BrowsHistory browsHistory;

        public ListIterator(BrowsHistory browsHistory) {
            this.browsHistory = browsHistory;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index<browsHistory.preUrls.size();
        }

        @Override
        public String next() {
            return preUrls.get(index++);
        }
    }

    //---------------------------Array
    private class ArrayIterator implements Iterator<String>{
        private int index ;
        private final BrowsHistory browsHistory;

        public ArrayIterator(BrowsHistory browsHistory) {
            this.browsHistory = browsHistory;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            if(browsHistory.urls[index] == null){
                return false;
            } else {
              return index<9;
            }
        }

        @Override
        public String next() {
          index++;
          return browsHistory.urls[index-1];
        }
    }
}
