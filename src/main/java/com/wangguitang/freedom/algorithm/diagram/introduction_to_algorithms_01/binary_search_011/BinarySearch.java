package com.wangguitang.freedom.algorithm.diagram.introduction_to_algorithms_01.binary_search_011;

import com.wangguitang.freedom.algorithm.diagram.utils.MathUtils;

/**
 * 二分查找法
 *
 * @author freedom wang
 * @date 2019-11-02 09:01:39
 */
public class BinarySearch {

    /**
     * 二分查找
     *
     * @param list   被查找的整数数组
     * @param target 被查找的目标值
     *
     * @return 若找到目标值，则返回目标值在数组中的下标，否则返回null
     *
     * @author freedom wang
     * @date 2019-11-02 09:02:19
     */
    public static Integer binarySearch(int[] list, int target) {
        return null;
    }

    /**
     * 练习一：假设有一个包含128个名字的有序列表，你要使用二分查找在其中查找一个名字，请问最多需要几步才能找到？
     *
     * 使用二分查找法，每次可以排除当前查找列表的一半，也就是一个长度为n的数组，每次查询减半，查询x次后将等于1，所以存在以下公式：
     * n*(1/2)^x = 1;
     * 转换后得到：
     * x = log2 x
     *
     * @param arrayLength 数组长度
     *
     * @return 返回查找到名字所需要的最大步数
     *
     * @author freedom wang
     * @date 2019-11-02 09:06:46
     */
    public static double maxSearchCount(int arrayLength) {
        double count = MathUtils.log(2, arrayLength);

        return Math.ceil(count);
    }

    public static void main(String[] args) {
        // 1.1 假设有一个包含128个名字的有序列表，你要使用二分查找在其中查找一个名字，请问最多需要几步才能找到？
        System.out.println(maxSearchCount(128)); // 7步

        // 1.2 上面列表的长度翻倍后，最多需要几步？
        System.out.println(maxSearchCount(256)); // 8步
    }
}
