package java0527;

// Interface IntelCpu介面
interface IntelCpu {
    void pin1();

    void pin2();

    void pin107();

    void pin108();
}

// Interface MainBoard介面
interface MainBoard { // 主機板
    void installCpu(IntelCpu cpu);

    void installRam();

    void installVga(); // 顯示卡

    void calculate();
}

// I3Cpu去實作介面
class I3Cpu implements IntelCpu {

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

// I5Cpu去實作介面
class I5cpu implements IntelCpu {

    @Override
    public void pin1() {
        System.out.println("pin1被呼叫，但執行速度中等");
    }

    @Override
    public void pin2() {
        System.out.println("pin2被呼叫，但執行速度中等");
    }

    @Override
    public void pin107() {
        System.out.println("pin107被呼叫，但執行速度中等");
    }

    @Override
    public void pin108() {
        System.out.println("pin108被呼叫，但執行速度中等");
    }
}


// I9Cpu去實作介面
class I9Cpu implements IntelCpu {

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

// AsusMainBoard去實作介面
class AsusMainBoard implements MainBoard {
    private IntelCpu cpu;

    @Override
    public void installCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public void installRam() {

    }

    @Override
    public void installVga() {

    }

    @Override
    public void calculate() {
        if (cpu != null) { // 當cpu不是null
            // 透過pin1、pin107運算
            System.out.println("華碩主機板在計算...");
            cpu.pin1();
            cpu.pin107();
        }
    }
}

// GigabyteMainBoard去實作介面
class GigabyteMainBoard implements MainBoard {
    private IntelCpu cpu;

    @Override
    public void installCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public void installRam() {

    }

    @Override
    public void installVga() {

    }

    @Override
    public void calculate() {
        if (cpu != null) { // 當cpu不是null
            // 透過pin2、pin108運算
            System.out.println("技嘉主機板在計算...");
            cpu.pin2();
            cpu.pin108();
        }
    }
}

public class TestAppliance {
    public static void main(String[] args) {
        MainBoard asusBoard = new AsusMainBoard();
        IntelCpu i3Cpu = new I3Cpu();
        asusBoard.installCpu(i3Cpu); // 把i3Cpu裝進去主機板
        asusBoard.calculate();

        // 重新買一顆I9Cpu，再安裝回去華碩主機板
        IntelCpu i9Cpu = new I9Cpu();
        asusBoard.installCpu(i9Cpu);
        asusBoard.calculate();

//        MainBoard gigabyteMainBoard = new GigabyteMainBoard();
        GigabyteMainBoard gigabyteMainBoard = new GigabyteMainBoard();
        IntelCpu i5cpu = new I5cpu();
        gigabyteMainBoard.installCpu(i5cpu); // 把i5Cpu裝進去主機板
        gigabyteMainBoard.calculate();
    }
}
