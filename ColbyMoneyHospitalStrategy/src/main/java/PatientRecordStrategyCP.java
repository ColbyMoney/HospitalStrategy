public class PatientRecordStrategyCP extends PatientRecordStrategy{
    public String getPatientRecord() {
        return "A-OK"; //returns patient record per Consulting Physician trust level permissions
    }
}
