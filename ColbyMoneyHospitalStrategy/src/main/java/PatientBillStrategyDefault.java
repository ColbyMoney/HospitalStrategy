public class PatientBillStrategyDefault extends PatientBillStrategy {
    public String getPatientBill() {
        return "Permission denied! You have been stopped."; //returns the bill per default trust level permissions (no trust!)
    }
}
