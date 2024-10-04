package model.attributes.connection;

public class TwoCableConnection implements Connection {
    private final boolean isFirstCableWorking;
    private final boolean isSecondCableWorking;

    public TwoCableConnection(boolean isFirstCableWorking, boolean isSecondCableWorking) {
        this.isFirstCableWorking = isFirstCableWorking;
        this.isSecondCableWorking = isSecondCableWorking;
    }

    @Override
    public void connect() {
        System.out.println("Trying to connect via two-cable-connection strategy.");
        if (isFirstCableWorking && !isSecondCableWorking) {
            System.out.println("Connected with the first cable because the second cable failed.");
        } else if (isFirstCableWorking) {
            System.out.println("Connected with the first cable.");
        } else if (isSecondCableWorking) {
            System.out.println("Connected with the second cable because the first cable failed.");
        } else {
            System.out.println("Connection failed because both cables are failed.");
            return;
        }
        System.out.println("Successfully connected via two-cable-connection strategy.");
    }
}
