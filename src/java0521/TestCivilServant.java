package java0521;

class CivilServant {
    void serveGeneralPublic() {
        System.out.println("服務大眾");
    }
}

class President extends CivilServant {
    void makeSpeech() {
        System.out.println("發表演講");
    }
}


public class TestCivilServant {

    public static void main(String[] args) {
        President president = new President();
        CivilServant civilServant = new CivilServant();
        boolean result1 = president  instanceof CivilServant; // 總統是公務員的子類實作
        boolean result2 = civilServant instanceof President;
        System.out.println(result1); // true
        System.out.println(result2); // false
    }
}
