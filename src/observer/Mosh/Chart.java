package observer.Mosh;


public class Chart implements Observer{



    /*@Override                           //push style
    public void update(int value) {
        System.out.println("chart got updated: " + value);
    }*/

    //------------pull style:
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("chart got updated: " + dataSource.getValue());
    }
}
