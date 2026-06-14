package memento.Mosh;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();   //we just need functionality of List
                                                            //we don't need specific functionality of ArrayList

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        var lastIndex = states.size()-1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);                   //it's EditorState obj
                                                    //so it's a reference
        return lastState;
    }
}
