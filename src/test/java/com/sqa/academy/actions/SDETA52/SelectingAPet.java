package com.sqa.academy.actions.SDETA52;

import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.SelectPetPage;
import com.sqa.academy.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class SelectingAPet extends Hooks {
    SelectPetPage objSelectPetPage;

@Test
public void SelectingPet () throws Exception {
    String url= ConfigurationReader.get("url");
    driver.get(url);

    objSelectPetPage=new SelectPetPage(driver);
    objSelectPetPage.clickPet();


//heeeeej
}
}
