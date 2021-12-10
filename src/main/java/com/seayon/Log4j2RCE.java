package com.seayon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @BelongProjecet Log4j2RCE_Demo
 * @BelongPackage com.seayon
 * @Copyleft 2013-3102
 * @Author: SaeyonZhao
 * @Date: 2021/12/10 2:24 下午
 * @Version V1.0
 * @Description:
 */

public class Log4j2RCE {
    public static void main(String[] args) {
        Logger loggger = LogManager.getLogger(Log4j2RCE.class);
        String username = "${java:os}";
        // error 级别才会生效
        loggger.error("username: {}", username);
    }
}
