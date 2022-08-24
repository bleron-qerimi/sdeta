package com.sqa.academy.actions.SDETA55;


import com.sqa.academy.actions.GenerlSteps;
import com.sqa.academy.actions.Hooks;
import com.sqa.academy.pages.jPetStore.Category;
import com.sqa.academy.pages.jPetStore.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Objects;
import java.util.Random;
public class ItemsInCartAfterClosingBrowser extends Hooks {

    @Test
    public static void addToCart(){
        GenerlSteps.gotToEnv("JPetStore");
        HomePage home = new HomePage(driver);
        ////Navigate to the ‘category view’ by clicking on the name at the left or top of the page, or on the picture of the desired animal.
        int max = home.leftSideMenu.size()-1;
        Random rand = new Random();
        int randomNum = rand.nextInt(max);
        home.leftSideMenu.get(randomNum).click();
        Category animalsies = new Category(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("viewCategory"));
        Assert.assertTrue(animalsies.productId.getText().contains("Product ID"));
        Assert.assertTrue(animalsies.productName.getText().contains("Name"));
        //Click on the productID of the desired animal
        int animalMax = animalsies.productLinks.size()-1;
        int animalNumber = rand.nextInt(animalMax);
        animalsies.productLinks.get(animalNumber).click();
        //Click on the add to cart button
        HomePage addToCart = new HomePage(driver);
        int maxProduct = addToCart.addToCartProductView.size()-1;
        int addToCartOption = rand.nextInt(maxProduct);
        addToCart.addToCartProductView.get(addToCartOption).click();
        driver.quit();
        driver = null;
        driver = new ChromeDriver();
        GenerlSteps.gotToEnv("JPetStore");
        HomePage home1 = new HomePage(driver);
        home1.shoppingCart.click();
        WebElement cartUpdate = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[1]/input"));
        cartUpdate.click();
        String cartEmptyCheck = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td/b")).getText();
        if (Objects.equals(cartEmptyCheck, "Your cart is empty.")) {
            Assert.fail();
        }
        home1.backHome.click();
        ////Navigate to the ‘category view’ by clicking on the name at the left or top of the page, or on the picture of the desired animal.
        int max1 = home1.leftSideMenu.size()-1;
        Random rand1 = new Random();
        int randomNum1 = rand1.nextInt(max1);
        home1.leftSideMenu.get(randomNum1).click();
        Category animalsies1 = new Category(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("viewCategory"));
        Assert.assertTrue(animalsies1.productId.getText().contains("Product ID"));
        Assert.assertTrue(animalsies1.productName.getText().contains("Name"));
        //Click on the productID of the desired animal
        int animalMax1 = animalsies1.productLinks.size()-1;
        int animalNumber1 = rand.nextInt(animalMax1);
        animalsies.productLinks.get(animalNumber1).click();
        //Click on the add to cart button of the desired animal
        HomePage addToCart1 = new HomePage(driver);
        int maxProduct1 = addToCart1.addToCartProductView.size()-1;
        int addToCartOption1 = rand1.nextInt(maxProduct1);
        addToCart.addToCartProductView.get(addToCartOption1).click();
    }
}
