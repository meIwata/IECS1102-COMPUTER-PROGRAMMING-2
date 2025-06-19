package java0619;

public class Demo1 {
    public static void main(String[] args) {
        // https://fluffy-jujube-1b8.notion.site/Java-Syntax-and-Data-Types-9c1f2bbefd074c6181eaefd954a21113

        /**
         * 變數命名規則說明
         * 開頭字元: 變數名稱的第一個字元必須是英文字母（a-z 或 A-Z）、底線（_）或美元符號（$）。不能以數字開頭。
         * 後續字元: 除第一個字元外，後面的字元可以是英文字母、數字（0-9）、底線（_）、或美元符號（$）。
         * 區分大小寫: 變數名稱是區分大小寫的。例如：count 和 Count 是兩個不同的變數。
         * 避免使用保留字作為變數名稱
         */
        int age = 10;
        int _bc;
        int $de;

        /**
         * 變數範圍（Variable Scope）解釋
         * 1. 區域變數（Local Variable）
         * 2. 成員/實例變數（Instance Variable）
         * 3. 類別變數（Class Variable / Static Variable）
         */

        /**
         * 常數變數Constant Variables:
         * 1. 常數變數必須使用 final 關鍵字宣告。例如：
         * 2. 值不可變，一旦對常數變數指派初值後，其值就不能再更改。如果嘗試再次賦值，編譯時會報錯。
         * 3. Java 通常習慣將常數名稱全部大寫，單字之間用底線分隔，例如：MAX_SIZE、PI。
         * */
        final double PI = 3.14159;

        /**
         * 變數命名慣例（Variable Naming Conventions）
         * 有意義且具描述性: 變數名稱應該能清楚表達用途與內容，避免用像 a、b、x1 這種沒意義的名字。
         * 範例：score、userName、totalAmount。
         * 小寫開頭: 變數名稱的第一個字母應以小寫開始。
         * 範例：count、maxValue。
         * 多字組合用駝峰式寫法（camelCase）: 若變數名稱有多個單字，從第二個單字開始，每個單字的首字母大寫。
         * 範例：studentAge、orderAmountTotal。
         * */
        String userName = "Tom";
        double exchangeRate = 0.01;
        int score = 80;
    }
}
