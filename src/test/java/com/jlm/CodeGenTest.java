package com.jlm;

import com.senrui.generator.MyBatisPlusCodeGenerator;
import org.junit.Test;

/**
 * @Author:ljl
 * @Date:2024/6/29
 * @VERSION:1.0
 */
public class CodeGenTest {
    @Test
    public void generateCode() {
        MyBatisPlusCodeGenerator.ConfigBuilder configBuilder = new MyBatisPlusCodeGenerator.ConfigBuilder();
        MyBatisPlusCodeGenerator generator = configBuilder.dbHost("43.143.125.160")
                .dbPort("3306")
                .dbName("learning")
                .userName("root")
                .password("c207ed1b6b22ddda")
                .packageName("com.jlm.data")
                .include("information")
                .fileOverride(true)
                .build();
        generator.generate();
    }
}
