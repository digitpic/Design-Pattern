package model;

import model.attributes.connection.Connection;

public abstract class Connector {
    protected Connection connectionAttribute;

    public abstract void display();

    public void connect() {
        connectionAttribute.connect();
    }

    public void disconnect() {
        System.out.println("Connector disconnected.");
    }
}
