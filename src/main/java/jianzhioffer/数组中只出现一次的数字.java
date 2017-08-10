package jianzhioffer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vino on 2017/8/10.
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class 数组中只出现一次的数字 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            }
            else {
                map.put(array[i], 1);
            }
        }
        boolean first = true;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1 && first) {
                num1[0] = entry.getKey();
                first = false;
            }
            if (entry.getValue() == 1 && !first) {
                num2[0] = entry.getKey();
            }
        }
    }
}
