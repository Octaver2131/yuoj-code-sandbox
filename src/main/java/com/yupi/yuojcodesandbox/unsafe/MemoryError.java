package com.yupi.yuojcodesandbox.unsafe;

import java.util.ArrayList;
import java.util.List;

public class MemoryError {
    public static void main(String[] args) {
        List<byte[]> bytes = new ArrayList<>();
        while (true) {
            bytes.add(new byte[1024 * 1024]);
        }
    }
}
