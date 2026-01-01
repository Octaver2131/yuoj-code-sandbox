package com.yupi.yuojcodesandbox.security;

import java.security.Permission;

/**
 * 禁用所有的安全管理器
 */
public class DenySecurityManager extends SecurityManager {

    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        super.checkPermission(perm);
    }
}
