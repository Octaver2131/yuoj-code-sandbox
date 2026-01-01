package com.yupi.yuojcodesandbox.security;

import java.security.Permission;

/**
 * 禁用所有的安全管理器
 */
public class MySecurityManager extends SecurityManager {

    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        if (perm instanceof java.util.logging.LoggingPermission) {
            if ("control".equals(perm.getName())) {
                return;
            }
        }
//        throw new SecurityException("权限拒绝：" + perm);
    }

    // 检测程序是否可读文件
    @Override
    public void checkRead(String file) {
//        throw new SecurityException("checkRead 权限拒绝：" + file);
    }

    // 检测程序是否可执行文件
    @Override
    public void checkExec(String cmd) {
        throw new SecurityException("checkExec 权限拒绝：" + cmd);
    }

    // 检测程序是否可写文件
    @Override
    public void checkWrite(String file) {
//        throw new SecurityException("checkWrite 权限拒绝：" + file);
    }

    // 检测程序是否可删除文件
    @Override
    public void checkDelete(String file) {
//        throw new SecurityException("checkDelete 权限拒绝：" + file);
    }

    // 检测程序是否可连接网络
    @Override
    public void checkConnect(String host, int port) {
//        throw new SecurityException("checkConnect 权限拒绝：" + host + ":" + port);
    }
}
