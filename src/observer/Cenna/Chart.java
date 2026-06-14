package observer.Cenna;

public class Chart extends DataSource{

    private int chartValue;

    public Chart(DataSource dataSource) {
        this.chartValue = dataSource.getValue();
        dataSource.addObj(this);
    }
}
