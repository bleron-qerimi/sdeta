package com.sqa.academy.actions;

import com.sqa.academy.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GenerlPetStore extends Hooks {

    @Test
    public static void gotToEnv(String env){
        if(env.equalsIgnoreCase("JPetStore")) {
            driver.get(ConfigurationReader.get("url2"));
            Assert.assertEquals(driver.getTitle(), ConfigurationReader.get("Jtitle"));
        } else if (false) {

        }
    }
}
