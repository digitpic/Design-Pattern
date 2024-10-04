package model;

import model.attributes.connection.SignalStrengthConnection;

public class WifiConnector extends Connector {
    public WifiConnector(int[] signalStrengths) {
        super.connectionAttribute = new SignalStrengthConnection(signalStrengths);
    }

    @Override
    public void display() {
        System.out.println("This is a wifi connector.");
    }
}
