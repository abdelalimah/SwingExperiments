package com.company.swing;

import javax.swing.*;
import javax.swing.border.Border;

public class Example {

    public Example() {
        try{
            //exp01();
            //exp02();
            //exp03();
            //exp04();
            //exp05();
            //exp06();
            //exp07();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void exp01() throws Exception {
        new HelloFrame();
    }

    void exp02() throws Exception {
        new MenuExample();
    }

    void exp03() throws Exception {
        new FlowLayoutExample();
    }

    void exp04() throws Exception {
        new GridLayoutExample();
    }

    void exp05() throws Exception {
        new BorderLayoutExample();
    }

    void exp06() throws Exception {
        new BoxLayoutExample();
    }

    void exp07(){
        new MultithreadingExample();
    }

    public static void main(String[] args) {
        new Example();
    }
}
