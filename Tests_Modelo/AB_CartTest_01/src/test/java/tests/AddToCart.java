package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AcademyBugsPage;

public class AddToCart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        AcademyBugsPage cartFlux = new AcademyBugsPage(driver);

        cartFlux.pageProducts("https://academybugs.com/find-bugs/");

        cartFlux.clickProduct();

        cartFlux.addItens(2);

        cartFlux.addToCart();

        cartFlux.plusCartButton(2);

        cartFlux.updateCart();

    }
}
