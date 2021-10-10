/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex43;
import java.util.Scanner;
import java.io.*;


public class WebsiteGenerator {

    final private static Scanner input = new Scanner(System.in);
    public static UserInput user = new UserInput();


    public static void askUser(){

        //Prompt user for site name
        System.out.print("Site name: ");
        user.setSiteName(input.nextLine());

        //Prompt user for author name
        System.out.print("Author: ");
        user.setAuthorName(input.nextLine());

        //Ask user if they want a folder for JavaScript files
        System.out.print("Do you want a folder for JavaScript? Type \"y\" if yes: ");
        user.setWantsJS(input.next());

        //Ask user if they want a folder for CSS files
        System.out.print("Do you want a folder for CSS? Type \"y\" if yes: ");
        user.setWantsCSS(input.next());
    }

    public static void createFiles() throws IOException{

        String folderPath = "src/main/java/ex43/website/";
        File websiteFolder = new File(folderPath);
        boolean madeFolder = websiteFolder.mkdir();
        if(madeFolder) {
            System.out.println("Created " + folderPath);
        }

        String sitePath = "src/main/java/ex43/website/"+user.getSiteName()+"/";
        File site = new File(sitePath);
        boolean madeSite = site.mkdir();
        if(madeSite) {
            System.out.println("Created " + sitePath);
        }
        
        /* Generate an index.html file containing
        name of the side inside <title> tag
        and author in <meta> tag */
        String siteIndexPath = "src/main/java/ex43/website/"+user.getSiteName()+"/index.html";
        File siteIndex = new File(siteIndexPath);
        boolean madeIndex = siteIndex.createNewFile();
        if(madeIndex) {
            System.out.println("Created " + siteIndexPath);
        }

        BufferedWriter writeIndex = new BufferedWriter(new FileWriter(siteIndex));
        writeIndex.write("<html>\n" +
                "<head>\n" +
                "<title>"+user.getSiteName()+"</title>\n"+ //Writes the name of site to index file inside <title> tags
                "<meta name= \"author\" content=\""+user.getAuthorName()+"\">\n"+ //Writes the author of site to index file inside <meta> tags
                "</head>\n" +
                "</html>");
        writeIndex.close();

        String jsPath;
        //If desired, create a folder for javascript files named js.
        if(user.getWantsJS().equals("y")){
            jsPath = "src/main/java/ex43/website/"+user.getSiteName()+"/js.js/";
            File siteJS = new File(jsPath);

            boolean madeJS = siteJS.createNewFile();
            if(madeJS){
                System.out.println("Created "+jsPath);
            }
        }

        String cssPath;
        //If desired, create a folder for CSS files names css.
        if(user.getWantsCSS().equals("y")){
            cssPath = "src/main/java/ex43/website/"+user.getSiteName()+"/css.css/";
            File siteCSS = new File(cssPath);

            boolean madeCSS = siteCSS.createNewFile();
            if(madeCSS){
                System.out.println("Created "+cssPath);
            }
        }

    }

    public static void main(String[] args) throws IOException{
        askUser();
        createFiles();

    }









}
