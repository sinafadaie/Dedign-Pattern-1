package memento.Cenna;

import java.util.LinkedList;
import java.util.List;

public class Editor {
    private String content ;
    private final List<String> contentHistory = new LinkedList<>();         //final here means the reference can’t be reassigned,
                                                                            //not that the list becomes immutable.
                                                                            //contentHistory will always point to the same list instance
                                                                            //But we can still modify the list’s contents
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.contentHistory.add(content);

    }

    public void undo(){
        if(!contentHistory.isEmpty()) {
            contentHistory.removeLast();
            this.content = contentHistory.getLast();
        }
    }
}
