package com.zscat.mallplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 应用启动入口
 * https://gitee.com/zscat-platform/mall on 2018/4/26.
 */
@SpringBootApplication
@MapperScan({"com.macro.mall.mapper", "com.macro.mall.ums.mapper","com.macro.mall.sms.mapper","com.macro.mall.cms.mapper","com.macro.mall.sys.mapper","com.macro.mall.oms.mapper","com.macro.mall.pms.mapper"})
@EnableTransactionManagement
public class MallAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class, args);
    }
}