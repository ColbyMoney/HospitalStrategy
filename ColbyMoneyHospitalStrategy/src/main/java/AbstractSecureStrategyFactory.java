public abstract class AbstractSecureStrategyFactory {

    private static AbstractSecureStrategyFactory defaultInstance = new ConcreteSecurePatientBillFactory();

    public static AbstractSecureStrategyFactory getInstance() {
        return defaultInstance;
    }

    public static void setInstance(AbstractSecureStrategyFactory newInstance) {
        defaultInstance = newInstance;
    }

    public abstract Strategy getStrategy(SecurityCredentials givenCredentials);
}
