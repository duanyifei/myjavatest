import java.io.*;

public class Employee{
    public String name;
    private static double salary;
    // 常量
    public static final String DEPARTMENT = "开发人员";
    // Employee 类的构造器
    public Employee(String ename){
        name = ename;
    }
    // 打印相关信息
    public void printEmployee(){
        // 局部变量
        salary = 1000;
        System.out.println(DEPARTMENT + "名字:" + name);
        System.out.println("薪水:" + salary);
    }
    public static void main(String args[]){
        Employee empOne = new Employee("RUNOOB");
        empOne.printEmployee();
    }
}
