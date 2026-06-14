package template.Mosh;

import template.AuditTrail;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    }   //when we are creating subclass obj
                                                            //JVM will call this default constructor

    public Task(AuditTrail auditTrail){
        this.auditTrail = auditTrail;
    }


    public void execute(){
        auditTrail.record();    //let the parent class do this!
        doExecute();
    }

    //public abstract void doExecute();
    protected abstract void doExecute();
}
