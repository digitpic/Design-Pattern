package model.attributes.connection;

public class SignalStrengthConnection implements Connection {
    private final int[] signalStrengths;

    public SignalStrengthConnection(int[] signalStrengths) {
        this.signalStrengths = signalStrengths;
    }

    @Override
    public void connect() {
        System.out.println("Trying to connect via signal-strength-connection strategy.");
        int strongestSignal = findStrongestSignal();
        System.out.println("Found the strongest signal: " + strongestSignal);
        System.out.println("Successfully connected with signal-strength-connection strategy.");
    }

    private int findStrongestSignal() {
        int maxSignal = 0;
        for (int signalStrength : signalStrengths) {
            if (maxSignal < signalStrength) {
                maxSignal = signalStrength;
            }
        }
        return maxSignal;
    }
}
