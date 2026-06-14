package template.Mosh;

public class Main {
    public static void main(String[] args){
        TransferMoneyTask task = new TransferMoneyTask();
        //task.doExecute();         //if we access doExecute() here
                                    //we can do task without AuditTrial

        task.execute();

        task.doExecute();           //we still has access! (after make it protected)
                                    //it's because we remain in current package!
    }
}
