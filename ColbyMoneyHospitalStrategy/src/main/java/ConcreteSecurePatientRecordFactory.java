public class ConcreteSecurePatientRecordFactory extends AbstractSecureStrategyFactory {
    @Override
    public PatientRecordStrategy getStrategy(SecurityCredentials givenCredentials) {
        if (givenCredentials.getText().equals("Patient"))
            return new PatientRecordStrategyPatient();
        else if (givenCredentials.getText().equals("PrimaryCarePhysician"))
            return new PatientRecordStrategyPCP();
        else if (givenCredentials.getText().equals("ConsultingPhysician"))
            return new PatientRecordStrategyCP();
        else
            return new PatientRecordStrategyDefault();
    }
}
