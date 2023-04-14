package openClosePrinciple.withOCP;


public class Doctor extends Employee {
    public Doctor(long id, String name, String department, boolean work) {
        super(id, name, department, work);
    }
    //Doctors
    private void prescribeMedicine(){
        System.out.println("Prescribe Medicine");
    }
    private void diagnosePatients(){
        System.out.println("Diagnosing Patient");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatients();
    }
}
