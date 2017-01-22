package com.aerexu.test.aibaidu.utils;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/19 13:59
 * @version: 1.0.0
 */
public class ByteArrayUtilTest {

    @org.junit.Test
    public void testDuplicateCertainByte() throws Exception {
        byte[] origin = {'1', '2', '4','\\', '5'};
        Assert.assertArrayEquals(new byte[]{'1', '2', '4','\\','\\', '5'},ByteArrayUtil.duplicateCertainByte(origin,(byte)'\\',1));
    }

    @org.junit.Test
    public void testByteArrayExtend() throws Exception {
        byte[] origin = {1, 2, 4, 5};
        Assert.assertArrayEquals(new byte[]{1, 2, 4, 5, 0, 0, 0}, ByteArrayUtil.byteArrayExtend(origin, 3));

    }
}