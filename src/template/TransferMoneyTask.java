package template;

public class TransferMoneyTask {
    private AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();    //it's log
        System.out.println("transfer money");
    }
}
