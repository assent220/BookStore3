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
}
