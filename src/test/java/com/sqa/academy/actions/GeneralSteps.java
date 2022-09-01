package com.sqa.academy.actions;

import com.sqa.academy.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class GeneralSteps extends Hooks {

    @Test
    public static void goToEnv(String env){
        if(env.equalsIgnoreCase("JPetStore")) {
            driver.get(ConfigurationReader.get("url2"));
            Assert.assertTrue(driver.getTitle().contains(ConfigurationReader.get("Jtitle")));
        } else if (env.equalsIgnoreCase("Computer")) {
            driver.get(ConfigurationReader.get("url"));
            Assert.assertTrue(driver.getTitle().contains(ConfigurationReader.get("Ctitle")));
        }
    }

    public static String pageintionUrl(int pageNumber){
        if(pageNumber>=1 && pageNumber<50)
        return "https://computer-database.gatling.io/computers?p="+pageNumber+"&n=10&s=name&d=asc";
        else {
            throw new IllegalArgumentException("the number should be between 2 and 50");
        }

    }

    @Test
    public void anzPreconditon() {
        Random random=new Random();
        driver.get(pageintionUrl(random.nextInt(50)));
    }
}
