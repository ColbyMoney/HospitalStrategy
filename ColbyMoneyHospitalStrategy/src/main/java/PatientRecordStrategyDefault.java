public class PatientRecordStrategyDefault extends PatientRecordStrategy{
    public String getPatientRecord() {
        return "Permission denied! You have been stopped."; //returns the bill per default trust level permissions (no trust!)
    }
}
