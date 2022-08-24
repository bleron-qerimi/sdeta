package com.sqa.academy.actions;

import com.sqa.academy.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GenerlStpes extends Hooks {

    @Test
    public static void gotToEnv(String env){

            driver.get(ConfigurationReader.get("url2"));
            Assert.assertTrue(driver.getTitle().contains(ConfigurationReader.get("Jtitle")));

    }
}
