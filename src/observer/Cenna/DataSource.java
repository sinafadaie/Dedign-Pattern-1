package observer.Cenna;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private int value;
    private List<DataSource> allObj = new ArrayList<>();

    public DataSource(int value
    ) {
        this.value = value;
    }

    public DataSource(
    ) {
    }

    public void setValue(int value) {
        this.value = value;
        for (DataSource item : allObj) {
            item.setValue(value);
        }
    }

    public int getValue() {
        return value;
    }

    public List<DataSource> getAllObj() {
        return allObj;
    }
    public void addObj(DataSource obj){
        allObj.add(obj);

    }

}
