package com.wangguitang.freedom.algorithm.diagram.utils;

/**
 * 数学计算工具类
 *
 * @author freedom wang
 * @date 2019-11-02 09:32:02
 */
public class MathUtils {

    /**
     * 求以base为底的value的对数
     *
     * @param base  底数
     * @param value 求对数的值
     *
     * @return 对数
     *
     * @author freedom wang
     * @date 2019-11-02 09:33:59
     */
    public static double log(double base, double value) {
        return Math.log(value) / Math.log(base);
    }

}
