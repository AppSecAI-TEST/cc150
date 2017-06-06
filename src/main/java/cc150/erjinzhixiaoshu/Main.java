package cc150.erjinzhixiaoshu;

/**
 * Created by vino on 2017/6/6.
 * 有一个介于0和1之间的实数，类型为double，返回它的二进制表示。如果该数字无法精确地用32位以内的二进制表示，返回“Error”。
 给定一个double num，表示0到1的实数，请返回一个string，代表该数的二进制表示或者“Error”。
 测试样例：
 0.625
 返回：0.101
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().printBin(0.625));
    }

    public String printBin(double num) {
        // write code here
        StringBuilder sb = new StringBuilder("0.");
        int count = 32;
        while (num != 0.0) {
            count--;
            double tmp = num * 2;
            if (tmp >= 1) {
                num = tmp - 1;
                sb.append(1);
            }
            else {
                num = tmp;
                sb.append(0);
            }
            if (count == 0)
                break;
        }

        return num != 0.0 ? "Error" : sb.toString();
    }
}
