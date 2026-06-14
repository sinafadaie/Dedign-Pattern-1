package memento.excersize;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<Memento> documentHistory = new ArrayList<>();

    public void push(Memento memento){
        documentHistory.add(memento);
    }

    public Memento pop(){
        Memento last = documentHistory.getLast();
        documentHistory.removeLast();
        return last;
    }
}
