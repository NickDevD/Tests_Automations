import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AcademyBugsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://academybugs.com/find-bugs/");

        WebElement image = driver.findElement(By.id("ec_product_image_effect_4481370"));
        image.click();


        WebElement addCart = driver.findElement(By.className("ec_details_add_to_cart"));
        addCart.click();

        WebElement addButton = driver.findElement(By.className("ec_plus_column"));
        for (int i = 1; i < 3; i++) {
            addButton.click();

            Thread.sleep(2000);
        }

        WebElement updateButton = driver.findElement(By.className("ec_cartitem_update_button"));
        updateButton.click();


    }

}
