package com.wangguitang.freedom.algorithm.diagram.introduction_to_algorithms_01.big_O_notation_012;

/**
 * 大O表示法
 *
 * @author freedom wang
 * @date 2019-11-02 11:14:25
 */
public class BigONotation {

    public static void main(String[] args){
        // 1.3 在电话簿中根据名字查找电话号码
        // 电话簿中中文名称的是根据拼音排序的，所以可以使用二分查找法，O(logn)

        // 1.4 在电话簿中根据电话号码找人。（提示：你必须查找整个电话簿。）
        // 如果必须要查找整个电话簿，那么使用简单查找，复杂度：O(n)

        // 1.5 阅读电话簿中每个人的电话号码。
        // 要查看每个人的电话号码，需要使用遍历一次，复杂度：O(n)

        // 1.6 阅读电话簿中姓名以A打头的人的电话号码。这个问题比较棘手，它涉及第4章的概念。答案可能让你感到惊讶！
        // O(n)
    }
}
