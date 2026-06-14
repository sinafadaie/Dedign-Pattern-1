package observer.Cenna;

public class SpreadSheet extends DataSource{
    private int spreadSheetValue;

    public SpreadSheet(DataSource dataSource) {
        dataSource.addObj(this);
    }
}
