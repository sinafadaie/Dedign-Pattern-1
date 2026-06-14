package observer.Cenna;

public class Main {
    public static void main(String[] args){

        DataSource dataSource = new DataSource(5);
        Chart chart = new Chart(dataSource);
        SpreadSheet spreadSheet = new SpreadSheet(dataSource);

        dataSource.setValue(8);
        System.out.println(chart.getValue());
        System.out.println(spreadSheet.getValue());

        dataSource.setValue(9);
        System.out.println(chart.getValue());
        System.out.println(spreadSheet.getValue());

    }
}
