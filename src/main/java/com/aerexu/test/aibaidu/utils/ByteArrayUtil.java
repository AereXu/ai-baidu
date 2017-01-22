package com.aerexu.test.aibaidu.utils;

import java.util.Arrays;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/18 16:03
 * @version: 1.0.0
 */
public class ByteArrayUtil {

    public static byte[] duplicateCertainByte(byte[] origin, byte b, int times) {
        byte[] result = new byte[origin.length];
        int k = 0;
        for (int i = 0; i < origin.length; i++, k++) {
            result[k] = origin[i];
            if (k == origin.length - 1) {
                result = byteArrayExtend(result, origin.length);
            }
            if (origin[i] == b) {
                for (int n = 0; n < times; n++) {
                    result[++k] = b;
                    if (k == origin.length - 1) {
                        result = byteArrayExtend(result, origin.length);
                    }
                }
            }
        }
        return Arrays.copyOf(result, k);
    }

    public static byte[] byteArrayExtend(byte[] origin, int length) {
        byte[] result = new byte[origin.length + length];
        System.arraycopy(origin, 0, result, 0, origin.length);
        return result;
    }
}
