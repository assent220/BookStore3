package com.mycompany.assent.util;

/**
 *
 * @author assent2
 */
public final class ProjectPathUtil {

    private ProjectPathUtil() {
    }
    
    private static final String path = System.getenv("PWD");    
    
    /**
     * Return absolute path to project file
     * 
     * @param localPath - local path to file
     * @return 
     */
    public static String getProjectPath(String localPath){
        if(localPath != null && !localPath.trim().isEmpty()){
            return path + localPath;
        }
        return path;
    }
    
    /**
     * 
     * @return absolute path to the project folder
     */
    public static String getProjectPath(){
        return path;
    }
}