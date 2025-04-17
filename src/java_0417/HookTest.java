package java_0417;

import java.util.Random;
import java.util.Scanner;

class bucket {
    // 初始化
    int count = 0, input = 0;
    boolean success = true;
    boolean[] hole = new boolean[10];//10個洞的記錄陣列
    boolean[] knifes = new boolean[hole.length]; // true 已插刀, false 未插刀

    public bucket() {
        hole[new Random().nextInt(hole.length)] = true; // 隨機產生某個特殊的洞
    }

    // 插入一把刀的方法, 輸入在那個位置插刀, 回傳是否
    // 1: 成功插到虎克船長, 0:沒插到虎克船長次數在五次以內,
    // -1:沒插到且超過5次, -2:錯誤輸入
    public int put_knifes(int input) {
        if (input < 0 || input > hole.length || knifes[input]) {// 刀插到外面或已有刀
            return -2;
        }// 錯誤輸入, 重插
        else if (hole[input]) {
            return 1;//成功插到虎克船長
        } else {
            knifes[input] = true; // 插入刀子
            count++;//插入刀子的計數
            if (count < 5) {
                return 0;
            }//失敗
            else {
                return -1;//失敗且超過5次
            }
        }
    }
}

public class HookTest {
    public static void main(String[] args) {
        int input, result;
        bucket bucket1 = new bucket();//產生一個新的木桶物件
        Scanner scanner = new Scanner(System.in);//使用者輸入物件
        while (true) {
            // 秀出沒有刀的洞
            for (int i = 0; i < bucket1.knifes.length - 1; i++)
                if (!bucket1.knifes[i]) System.out.print(i + ",");
            if (!bucket1.knifes[bucket1.knifes.length - 1])
                System.out.println(bucket1.knifes.length - 1);
            input = scanner.nextInt();// 取得user的下一刀的位置
            result = bucket1.put_knifes(input);
            if (result == 1) {
                System.out.println("成功");
                break;
            } else if (result == 0) {
                //System.out.println("失敗");
            } else if (result == -1) {
                System.out.println("爆, 失敗");
                break;
            }
        }
    }
}
