package model;

import model.attributes.connection.SimpleConnection;

public class BluetoothConnector extends Connector {
    public BluetoothConnector() {
        super.connectionAttribute = new SimpleConnection();
    }

    @Override
    public void display() {
        System.out.println("This is a bluetooth connector.");
    }
}
