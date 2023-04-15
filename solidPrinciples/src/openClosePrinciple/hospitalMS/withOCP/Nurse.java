package openClosePrinciple.hospitalMS.withOCP;



public class Nurse extends Employee {
    public Nurse(long id, String name, String department, boolean work) {
        super(id, name, department, work);
    }
    //Nurses
    private void checkVitalSigns (){
        System.out.println("Checking Vitals");
    }
    private void drawBlood(){
        System.out.println("Drawing blood");
    }
    private void cleanPatientArea(){
        System.out.println("Cleaning Patient Area");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }
}
