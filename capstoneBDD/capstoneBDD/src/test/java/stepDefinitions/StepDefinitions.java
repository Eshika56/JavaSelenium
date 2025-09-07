package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.DriverFactory;

public class StepDefinitions {
	WebDriver driver = DriverFactory.getDriver();
	@Given("I am on the Demoblaze homepage")
	public void i_am_on_the_demoblaze_homepage() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver(chromeOptions);
    	// launch the application on the chrome browser
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(8000);
	}

	@When("I click on {string}")
	public void i_click_on(String signUp) throws InterruptedException {
	    WebElement signUpLink = driver.findElement(By.id("signin2"));
	    signUpLink.click();
	    Thread.sleep(2000);
	}

	@When("I register with username {string} and password {string}")
	public void i_register_with_username_and_password(String username, String password) throws InterruptedException {
		WebElement username1 = driver.findElement(By.id("sign-username"));
        username1.sendKeys("eshikaBose");
        Thread.sleep(2000);
        
        WebElement password1 = driver.findElement(By.id("sign-password"));
    	password1.sendKeys("eshikaB@34");
        Thread.sleep(2000);
        
        WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
        signUpButton.click();
	}

	@Then("I should see an alert {string}")
	public void i_should_see_an_alert(String expectedAlertText) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		    String actualAlertText = alert.getText();
		    org.testng.Assert.assertEquals(actualAlertText, expectedAlertText);
		    alert.accept();
	    
	}
	
	@When("I click on the {string}")
	public void i_click_on_the(String logIn) throws InterruptedException {
		WebElement logInLink = driver.findElement(By.id("login2"));
		logInLink.click();
	    Thread.sleep(2000);
	}
	
	@When("I login with username {string} and password {string}")
	public void i_login_with_username_and_password(String username, String password) throws InterruptedException {
		WebElement username1 = driver.findElement(By.id("loginusername"));
        username1.sendKeys("eshikaBose");
        Thread.sleep(8000);
        
        WebElement password1 = driver.findElement(By.id("loginpassword"));
    	password1.sendKeys("eshikaB@34");
        Thread.sleep(8000);
        
        WebElement logInButton = driver.findElement(By.xpath("//button[text()='Log in']"));
        logInButton.click();
        Thread.sleep(8000);
	}
	
	@Then("I should see a welcome message with username {string}")
    public void i_should_see_a_welcome_message_with_username(String expectedUser) {
        WebElement welcomeMsg = driver.findElement(By.id("nameofuser"));
        String actualText = welcomeMsg.getText().trim();
        String expectedMessage = "Welcome " + expectedUser;
        Assert.assertEquals(actualText, expectedMessage, 
                "Expected welcome message: " + expectedMessage + " but got: " + actualText);
    }
	
	@Given("I am logged in as {string}")
    public void i_am_logged_in_as(String username) throws InterruptedException {
        // Navigate to Demoblaze
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(4000);

        // Click Login
        driver.findElement(By.id("login2")).click();
        Thread.sleep(4000);

        // Enter username and password
        driver.findElement(By.id("loginusername")).sendKeys("eshikaBose");
        Thread.sleep(4000);
        driver.findElement(By.id("loginpassword")).sendKeys("eshikaB@34");
        Thread.sleep(4000);

        // Click Login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(4000);
    }

    @Then("there is no profile management functionality")
    public void there_is_no_profile_management_functionality() throws InterruptedException {
        // Check that Profile management button/link is NOT present
        boolean isProfilePresent = driver.findElements(By.xpath("//*[contains(text(),'Profile')]")).size() > 0;
        Assert.assertFalse(isProfilePresent, "Profile management functionality should not be present");
        Thread.sleep(4000);
    }
    
    @When("I click on the {string} product")
    public void i_click_on_the_product(String productName) throws InterruptedException {
        WebElement product = driver.findElement(By.linkText("Samsung galaxy s6"));
        product.click();
        Thread.sleep(4000);
    }
    
    @Then("I should see the product details page with title {string}")
    public void i_should_see_the_product_details_page_with_title(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        WebElement productTitle = wait.until(
            org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".name"))
        );
        String actualTitle = productTitle.getText();
        org.junit.Assert.assertEquals(expectedTitle, actualTitle);
    }


    @Then("I should see a visible {string} button")
    public void i_should_see_a_visible_button(String buttonText) {
        WebElement addToCartBtn = driver.findElement(By.xpath("//a[text()='" + buttonText + "']"));
        Assert.assertTrue(addToCartBtn.isDisplayed());
    }
    
    @Given("I am viewing the {string} details page")
    public void i_am_viewing_the_details_page(String productName) {
        driver.get("https://www.demoblaze.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement productLink = wait.until(
            ExpectedConditions.elementToBeClickable(By.linkText("Samsung galaxy s6"))
        );
        productLink.click();

        // Verify product page title
        WebElement productTitle = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".name"))
        );
        Assert.assertEquals(productName, productTitle.getText());
    }
    
    @When("I click {string}")
    public void i_click(String buttonText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='" + buttonText + "']"))
        );
        button.click();
    }
    
    @Then("I should see an alert confirming {string}")
    public void i_should_see_an_alert_confirming(String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        String actualMessage = alert.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));

        alert.accept(); // close alert
    }
    
    @Given("I have added {string} to the cart")
    public void i_have_added_to_the_cart(String productName) throws InterruptedException {
    	driver.get("https://www.demoblaze.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Thread.sleep(8000);
        // Click on product
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        Thread.sleep(8000);

        // Click Add to cart
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
        Thread.sleep(2000);

        // Accept alert popup
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        // Navigate back to homepage
        driver.findElement(By.id("nava")).click();
        Thread.sleep(2000);
    }

    @When("I navigate to the cart")
    public void i_navigate_to_the_cart() throws InterruptedException {
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);
    }

    @Then("the cart should list {string}")
    public void the_cart_should_list(String expectedProduct) throws InterruptedException {
        Thread.sleep(2000);
        WebElement productInCart = driver.findElement(By.xpath("//td[text()='" + expectedProduct + "']"));
        Assert.assertTrue(productInCart.isDisplayed());
    }

    @When("I click {string} on the item")
    public void i_click_on_the_item(String action) throws InterruptedException {
        if (action.equalsIgnoreCase("Delete")) {
            driver.findElement(By.xpath("//a[text()='Delete']")).click();
            Thread.sleep(2000);
        }
    }

    @Then("the cart should be empty")
    public void the_cart_should_be_empty() throws InterruptedException {
        Thread.sleep(2000);
        boolean isEmpty = driver.findElements(By.xpath("//tr[@class='success']")).isEmpty();
        Assert.assertTrue(isEmpty);
    }
    
    @Given("I have added {string} to my cart")
    public void i_have_added_to_my_cart(String productName) throws InterruptedException {
    	driver.get("https://www.demoblaze.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Thread.sleep(8000);
        // Click on product
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        Thread.sleep(8000);

        // Click Add to cart
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
        Thread.sleep(2000);

        // Accept alert popup
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        // Navigate back to homepage
        driver.findElement(By.id("nava")).click();
        Thread.sleep(2000);
    }
    
    @When("I proceed to cart and place order")
    public void i_proceed_to_cart_and_place_order() throws InterruptedException {
        // Navigate to Cart
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);

        // Click Place Order
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        Thread.sleep(2000);
    }

    @When("I fill order form with name {string}, country {string}, city {string}, credit card {string}, month {string}, year {string}")
    public void i_fill_order_form_with_name_country_city_credit_card_month_year(
            String name, String country, String city, String creditCard, String month, String year) throws InterruptedException {

        driver.findElement(By.id("name")).sendKeys("Eshika Bose");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Kolkata");
        driver.findElement(By.id("card")).sendKeys("1234567890");
        driver.findElement(By.id("month")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("2025");
        Thread.sleep(1000);
    }

    @When("I confirm purchase")
    public void i_confirm_purchase() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();
        Thread.sleep(2000);
    }

    @Then("I should see a confirmation dialog with purchase details")
    public void i_should_see_a_confirmation_dialog_with_purchase_details() throws InterruptedException {
        WebElement confirmationDialog = driver.findElement(By.xpath("//div[@class='sweet-alert  showSweetAlert visible']"));
        Assert.assertTrue(confirmationDialog.isDisplayed());

        // Extract confirmation text
        String confirmationText = driver.findElement(By.xpath("//p[@class='lead text-muted ']")).getText();
        System.out.println("Purchase Confirmation Details: " + confirmationText);

        // Click OK
        driver.findElement(By.xpath("//button[text()='OK']")).click();
        Thread.sleep(2000);
    }
    }
    
    

	
