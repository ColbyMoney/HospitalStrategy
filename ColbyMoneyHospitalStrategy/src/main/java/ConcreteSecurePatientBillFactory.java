public class ConcreteSecurePatientBillFactory extends AbstractSecureStrategyFactory {
    @Override
    public PatientBillStrategy getStrategy(SecurityCredentials givenCredentials) {
        if (givenCredentials.getText().equals("Patient"))
            return new PatientBillStrategyPatient();
        else if (givenCredentials.getText().equals("MedicalStaff"))
            return new PatientBillStrategyStaff();
        else
            return new PatientBillStrategyDefault();
    }
}
