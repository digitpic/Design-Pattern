package model.attributes.connection;

public class SimpleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Trying to connect via simple-connection strategy.");
        System.out.println("Successfully connected with simple-connection strategy.");
    }
}
