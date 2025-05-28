package java0527;
interface USBDevice {
    void connect();
    boolean isWorking();
    void disconnect();
}
class Mouse implements USBDevice {
    // 宣告一個私有成員變數
    private boolean connected = false;

    @Override
    public void connect() {
        connected = true;
        System.out.println("滑鼠連線了");
    }

    @Override
    public boolean isWorking() {
        // 這裡單純示範：已連線代表運作正常
        return connected;
    }

    @Override
    public void disconnect() {
        connected = false;
        System.out.println("滑鼠斷線了");
    }
}
class Keyboard implements USBDevice {
    // 宣告一個私有成員變數
    private boolean connected = false;

    @Override
    public void connect() {
        connected = true;
        System.out.println("鍵盤連線了");
    }
    @Override
    public boolean isWorking() {
        // 這裡單純示範：已連線代表運作正常
        return connected;
    }

    @Override
    public void disconnect() {
        connected = false;
        System.out.println("鍵盤斷線了");
    }
}

public class TestUSBDevice {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();

        mouse.connect();
        System.out.println("滑鼠運作中嗎？ " + mouse.isWorking());
        mouse.disconnect();
        System.out.println("滑鼠運作中嗎？ " + mouse.isWorking());

        System.out.println("--------------------------");

        keyboard.connect();
        System.out.println("鍵盤運作中嗎？ " + keyboard.isWorking());
        keyboard.disconnect();
        System.out.println("鍵盤運作中嗎？ " + keyboard.isWorking());
    }
}
