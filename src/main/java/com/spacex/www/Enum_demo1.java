package com.spacex.www;

import com.spacex.www.model.Affirm;
import com.spacex.www.model.Day;

import java.util.Arrays;

public class Enum_demo1 {
    public static void main(String[] args) {

        /*----------------------------------Day-----------------------------------------*/
        Day[] days = new Day[]{Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY,
                Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};
        for (Day day : days) {
            System.out.print(day + ",");
        }
        System.out.println();

        for (Day day : days) {
            System.out.print(day.ordinal()+",");
        }
        System.out.println();

        System.out.println(Day.MONDAY.equals(days[0]));
        System.out.println(days[0].equals("MONDAY"));
        System.out.println(days[0].equals(Day.MONDAY.name()));
        System.out.println(days[0].getDeclaringClass());
        //静态的方法
        System.out.println(Day.valueOf(Day.class,"MONDAY"));

        System.out.println(Arrays.toString(Day.values()));
        try {
            System.out.println(Day.valueOf("1233"));
        }catch (Exception e){
            System.out.println("此常量不在枚举中");
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------------------------");


        //Class对象中的getDeclaringClass() 和 isEnum()
        //向上转型---获取枚举的全部元素
        Enum en=Day.MONDAY;
        Class clazz = en.getDeclaringClass();
        if(clazz.isEnum()){
            System.out.println(Arrays.toString(clazz.getEnumConstants()));
        }

        /*------------------------------------Affirm---------------------------------------*/
        System.out.println("-------------------------------------------------------------");
        System.out.println(Affirm.YES);
        System.out.println(Affirm.YES.getId()+"-"+Affirm.YES.getText());
        System.out.println(Affirm.NO.ordinal());
        System.out.println(Affirm.YES.name());
        System.out.println(Affirm.YES.toString());
        System.out.println(Affirm.YES.getDeclaringClass());
        //静态的方法
        try {
            System.out.println(Affirm.valueOf(Affirm.class, "12233"));
        }catch (Exception e){
            System.out.println("此常量不在枚举中");
            System.out.println(e.getMessage());
        }
        System.out.println(Arrays.toString(Affirm.values()));
        System.out.println(Affirm.valueOf("YES"));
        System.out.println("-----------------------进阶---------------------");







    }
}
