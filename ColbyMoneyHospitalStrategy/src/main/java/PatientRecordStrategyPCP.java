public class PatientRecordStrategyPCP extends PatientRecordStrategy {
    public String getPatientRecord() {
        return "A-OK"; //returns patient record per Primary Care Physician trust level permissions
    }
}
