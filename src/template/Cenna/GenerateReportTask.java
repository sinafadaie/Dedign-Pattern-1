package template.Cenna;

public class GenerateReportTask extends Task{

    public void execute(){
        record();
        System.out.println("report is generating");
    }
}
