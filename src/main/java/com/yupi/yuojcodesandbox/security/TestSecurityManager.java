package com.yupi.yuojcodesandbox.security;

public class TestSecurityManager {

    public static void main(String[] args) {
        System.setSecurityManager(new DenySecurityManager());

//        List<String> strings = FileUtil.readLines("C:\\Users\\Octaver\\Desktop\\yuoj-code-sandbox\\src\\main\\resources\\warning.bat", StandardCharsets.UTF_8);



    }
}
