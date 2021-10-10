/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex43;

public class UserInput {

    private String siteName;
    private String authorName;
    private String wantsJS;
    private String wantsCSS;

    public String getSiteName(){
        return siteName;
    }
    public void setSiteName(String siteName){
        this.siteName = siteName;
    }

    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public String getWantsJS(){
        return wantsJS;
    }
    public void setWantsJS(String wantsJS){
        this.wantsJS = wantsJS;
    }

    public String getWantsCSS(){
        return wantsCSS;
    }
    public void setWantsCSS(String wantsCSS){
        this.wantsCSS = wantsCSS;
    }

}
