package model;

import model.attributes.connection.TwoCableConnection;

public class DirectConnector extends Connector {
    public DirectConnector(boolean[] cableStatuses) {
        super.connectionAttribute = new TwoCableConnection(cableStatuses[0], cableStatuses[1]);
    }

    @Override
    public void display() {
        System.out.println("This is a direct-connector.");
    }
}
