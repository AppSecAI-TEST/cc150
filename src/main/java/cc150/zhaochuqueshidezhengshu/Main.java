package cc150.zhaochuqueshidezhengshu;

/**
 * Created by vino on 2017/6/6.
 *数组A包含了0到n的所有整数，但其中缺失了一个。对于这个问题，我们设定限制，使得一次操作无法取得数组number里某个整数的完整内容。唯一的可用操作是询问数组中第i个元素的二进制的第j位(最低位为第0位)，该操作的时间复杂度为常数，请设计算法，在O(n)的时间内找到这个数。
 给定一个数组number，即所有剩下的数按从小到大排列的二进制各位的值，如A[0][1]表示剩下的第二个数二进制从低到高的第二位。同时给定一个int n，意义如题。请返回缺失的数。
 测试样例：
 [[0],[0,1]]
 返回：1
 *
 * numbers是一个已经排好序的二维数组，存储的是0-n，但是缺少一个数，每一行存储的是每个数的
 二进制，从二进制低位开始存储。
 */
public class Main {
    public int findMissing(int[][] numbers, int n) {
        // write code here
        for(int i = 0; i < n ; i++) {
            if (i % 2 != numbers[i][0])
                return i;
        }
        return n;
    }

}
