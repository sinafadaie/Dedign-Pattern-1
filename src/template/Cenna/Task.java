package template.Cenna;
import template.AuditTrail;

public abstract class Task {

    void record(){
        AuditTrail auditTrail = new AuditTrail();
        auditTrail.record();
        System.out.println("logged successfully");  //we have implementation here!
    }
}
