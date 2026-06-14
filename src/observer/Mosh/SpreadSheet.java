package observer.Mosh;


public class SpreadSheet implements Observer{


    /*@Override           //push style
    public void update(int value) {
        System.out.println("Spreadsheet got notified: " + value);
    }*/

    //---------------pull style:
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;

    }

    @Override
    public void update() {
        System.out.println("Spreadsheet got notified: " + dataSource.getValue());
    }
}

