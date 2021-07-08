package com.spacex.www.serialize;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //获取当前类的所在工程路径;
        File f = new File(Student.class.getResource("/").getPath());
        System.out.println(f);
    }
}
