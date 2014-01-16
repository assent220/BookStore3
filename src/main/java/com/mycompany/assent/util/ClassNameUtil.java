package com.mycompany.assent.util;

/**
 *
 * @author assent2
 */
public final class ClassNameUtil {

    private ClassNameUtil() {
    }
    
    public static String getCurrentClassName(){
        try {
         throw new RuntimeException();
        } catch (RuntimeException e) {
            return e.getStackTrace()[1].getClassName();
        }
    }
    
    public static String getCurrentClassName(Object obj){
        if(obj == null){
            return "null";
        }
        return obj.getClass().getName();
    }
}