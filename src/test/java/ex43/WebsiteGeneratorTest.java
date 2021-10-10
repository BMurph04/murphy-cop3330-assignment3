/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex43;

import org.junit.Assert;
import org.junit.Test;

import static ex43.WebsiteGenerator.user;

public class WebsiteGeneratorTest {

    @Test
    public void testCreateFiles() {
        user.setSiteName("awesomeco");
        user.setAuthorName("Max Powers");
        Assert.assertEquals("src/main/java/ex43/website/awesomeco/css.css/", "src/main/java/ex43/website/" + user.getSiteName() + "/css.css/");
        Assert.assertEquals("<meta name= \"author\" content=\"Max Powers\">\n", "<meta name= \"author\" content=\"" + user.getAuthorName() + "\">\n");
        Assert.assertEquals("src/main/java/ex43/website/awesomeco/js.js/", "src/main/java/ex43/website/" + user.getSiteName() + "/js.js/");
        Assert.assertEquals("src/main/java/ex43/website/awesomeco/css.css/", "src/main/java/ex43/website/" + user.getSiteName() + "/css.css/");
}}