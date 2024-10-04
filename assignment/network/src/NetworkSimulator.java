import model.BluetoothConnector;
import model.Connector;
import model.DirectConnector;
import model.WifiConnector;

/**
 * 과목: 디자인패턴 (2분반)
 * 과제: 네트워크 프로그램 만들기
 * 학과: 소프트웨어학과
 * 학번: 32204027
 * 이름: 정규원
 */

public class NetworkSimulator {
    public static void main(String[] args) {
        /* [1] Wifi connection */
        System.out.println("[1] Wifi Connection");

        // [1][1] 신호 강도 오름차순 정렬된 경우
        System.out.println("[1][1] 신호 강도 오름차순 정렬된 경우");

        int[] orderedSignalStrengths = new int[]{10, 30, 50, 70, 90};
        Connector wifiConnector = new WifiConnector(orderedSignalStrengths);
        wifiConnector.display();
        wifiConnector.connect();
        wifiConnector.disconnect();
        separatingLine();

        // [1][2] 신호 강도 정렬 되지 않은 경우
        System.out.println("[1][2] 신호 강도 정렬 되지 않은 경우");

        int[] unorderedSignalStrengths = new int[]{80, 40, 100, 20, 60};
        wifiConnector = new WifiConnector(unorderedSignalStrengths);
        wifiConnector.display();
        wifiConnector.connect();
        wifiConnector.disconnect();
        separatingLine();

        /* [2] Bluetooth connection */
        System.out.println("[2] Bluetooth connection");

        Connector bluetoothConnector = new BluetoothConnector();
        bluetoothConnector.display();
        bluetoothConnector.connect();
        bluetoothConnector.disconnect();
        separatingLine();

        /* [3] Direct connection */
        System.out.println("[3] Direct connection");

        // [3][1] 작동 여부
        // Cable 1: O
        // Cable 2: O
        boolean[] allCableAvailableStatus = new boolean[]{true, true};
        System.out.println("[3][1] 작동 여부");
        System.out.println("Cable 1: O");
        System.out.println("Cable 2: O");

        Connector directConnector = new DirectConnector(allCableAvailableStatus);
        directConnector.display();
        directConnector.connect();
        directConnector.disconnect();
        separatingLine();

        // [3][2] 작동 여부
        // Cable 1 : O
        // Cable 2 : X
        boolean[] onlyFirstCableAvailableStatus = new boolean[]{true, false};
        System.out.println("[3][2] 작동 여부");
        System.out.println("Cable 1: O");
        System.out.println("Cable 2: X");

        directConnector = new DirectConnector(onlyFirstCableAvailableStatus);
        directConnector.display();
        directConnector.connect();
        directConnector.disconnect();
        separatingLine();

        // [3][3] 작동 여부
        // Cable 1 : X
        // Cable 2 : O
        boolean[] onlySecondCableAvailableStatus = new boolean[]{false, true};
        System.out.println("[3][3] 작동 여부");
        System.out.println("Cable 1: X");
        System.out.println("Cable 2: O");

        directConnector = new DirectConnector(onlySecondCableAvailableStatus);
        directConnector.display();
        directConnector.connect();
        directConnector.disconnect();
        separatingLine();

        // [3][4] 작동 여부
        // Cable 1 : X
        // Cable 2 : X
        boolean[] allCableUnavailableStatus = new boolean[]{false, false};
        System.out.println("[3][4] 작동 여부");
        System.out.println("Cable 1: X");
        System.out.println("Cable 2: X");

        directConnector = new DirectConnector(allCableUnavailableStatus);
        directConnector.display();
        directConnector.connect();
        directConnector.disconnect();
        separatingLine();
    }

    private static void separatingLine() {
        System.out.println("---------------------------------------------------------------------\n");
    }
}
