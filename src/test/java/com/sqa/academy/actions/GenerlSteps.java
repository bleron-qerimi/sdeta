package com.sqa.academy.actions;

import com.sqa.academy.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GenerlSteps extends Hooks {

    @Test
    public static void gotToEnv(String env){
        if(env.equalsIgnoreCase("JPetStore")) {
            driver.get(ConfigurationReader.get("url2"));
            Assert.assertTrue(driver.getTitle().contains(ConfigurationReader.get("Jtitle")));
        } else if (env.equalsIgnoreCase("Computer")) {
            driver.get(ConfigurationReader.get("url"));
            Assert.assertTrue(driver.getTitle().contains(ConfigurationReader.get("Ctitle")));
        }
    }
}
