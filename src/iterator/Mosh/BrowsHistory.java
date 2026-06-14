package iterator.Mosh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//we use preUrls for list ()
//we use urls for Array
//---------------
//Mosh use count field to
//remove our for loop!
//---------------
//Mosh solution is wrong!
//he didn't limited count!
//we just have an Array with 10 length!
//we will get exception!

public class BrowsHistory implements Iterable {     //so we say this obj is iterable!

    private List<String> preUrls = new ArrayList<>();
    private final String[] urls = new String[10];
    private int count;  //initially count will set to zero

    public void push(String url){
        preUrls.add(url);

        //--------------
        urls[count++] = url;

    }

    public String pop(){
        int lastIndex = preUrls.size() - 1;
        var lastUrl = preUrls.get(lastIndex);
        preUrls.remove(lastUrl);

        //-----------
        return urls[--count];   //first decrease count!
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
        private int index ; //initially will zero
        private final BrowsHistory browsHistory;

        public ArrayIterator(BrowsHistory browsHistory) {
            this.browsHistory = browsHistory;
        }

        @Override
        public boolean hasNext() {
            return (index < browsHistory.count);
        }

        @Override
        public String next() {
          index++;
          return browsHistory.urls[index-1];
        }
    }
}
