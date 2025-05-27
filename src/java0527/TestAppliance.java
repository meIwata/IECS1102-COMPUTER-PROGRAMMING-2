package java0527;
interface IntelCpu{
    void pin1();
    void pin2();
    void pin107();
    void pin108();
}
class I3Cpu implements IntelCpu{

    @Override
    public void pin1() {
        System.out.println("pin1被呼叫，但執行速度較慢");
    }

    @Override
    public void pin2() {
        System.out.println("pin2被呼叫，但執行速度較慢");
    }

    @Override
    public void pin107() {
        System.out.println("pin107被呼叫，但執行速度較慢");
    }

    @Override
    public void pin108() {
        System.out.println("pin108被呼叫，但執行速度較慢");
    }
}

class I9Cpu implements IntelCpu{

    @Override
    public void pin1() {
        System.out.println("pin1被呼叫，但執行速度較快");
    }

    @Override
    public void pin2() {
        System.out.println("pin2被呼叫，但執行速度較快");
    }

    @Override
    public void pin107() {
        System.out.println("pin107被呼叫，但執行速度較快");
    }

    @Override
    public void pin108() {
        System.out.println("pin108被呼叫，但執行速度較快");
    }
}

public class TestAppliance {
    public static void main(String[] args) {

    }
}
