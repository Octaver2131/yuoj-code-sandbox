package com.yupi.yuojcodesandbox.unsafe;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 运行其他程序（比如危险木马）
 */
public class RunFileError {

    public static void main(String[] args) throws IOException, InterruptedException {

        String userDir = System.getProperty("user.dir");
        String filePath = userDir + File.separator + "src/main/resources/warning.bat";
        Process process = Runtime.getRuntime().exec(filePath);
        process.waitFor();
        String errorProgram = "java -version 2>&1";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        // 逐行读取
        String compileOutputLine;
        while ((compileOutputLine = bufferedReader.readLine()) != null) {
            System.out.println(compileOutputLine);
        }
        System.out.println("程序执行完毕");
    }
}
