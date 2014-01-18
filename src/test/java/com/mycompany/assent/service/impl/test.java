/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assent.service.impl;

import org.junit.Test;

public class test {

    @Test
    public void test0() {
        String s = "/BookStore3/authors/";



        //System.out.println(s.replaceFirst("/[-a-zA-z0-9_.:]+/", "").matches("a-zA-Z+/?$"));
        System.out.println("authors/".matches("[a-zA-Z0-9]+/?"));
    }

    @Test
    public void test1() {
        String s = "/BookStore3/authors/0";
        System.out.println(s);
        s = s.replaceFirst("/[-a-zA-z0-9_.:]+/", "");
        System.out.println(s);
        System.out.println(s.matches("[a-zA-Z0-9]+/?\\d+"));
    }
    
    @Test
    public void test2() {
        String s = "/BookStore3/authors/21";
        System.out.println(s);
        s = s.replaceFirst("/[-a-zA-z0-9_.:]+/", "");
        System.out.println(s);
        System.out.println(s.matches("[a-zA-Z0-9]+/?\\d+"));
    }
    @Test
    public void test3() {
        String s = "/BookStore3/authors/21?form";
        System.out.println(s);
        s = s.replaceFirst("/[-a-zA-z0-9_.:]+/", "");
        System.out.println(s);
        System.out.println(s.matches("[a-zA-Z0-9]+/\\d+\\?form"));
    }
}
