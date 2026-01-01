package com.yupi.yuojcodesandbox.security;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class TestSecurityManager {

    public static void main(String[] args) {
        System.setSecurityManager(new DenySecurityManager());

//        List<String> strings = FileUtil.readLines("C:\\Users\\Octaver\\Desktop\\yuoj-code-sandbox\\src\\main\\resources\\warning.bat", StandardCharsets.UTF_8);



    }
}
