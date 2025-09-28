package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcademyBugsPage {

    private static final Logger log = LoggerFactory.getLogger(AcademyBugsPage.class);
    private final WebDriver driver;

    private final By productImage = By.id("ec_product_image_effect_4481370");
    private final By plusButton = By.className("ec_plus");
    private final By cartButton = By.className("ec_details_add_to_cart");
    private final By plusButtonCart = By.className("ec_plus");
    private final By updateButtonCart = By.className("ec_cartitem_update_button");

    public AcademyBugsPage(WebDriver driver){
        log.info("Iniciando teste");
        this.driver = driver;
    }

    public void pageProducts(String url){
        driver.manage().window().maximize();
        try {
            driver.get(url);
            log.info("Página do produto carregada");
        } catch (RuntimeException e) {
            log.error("Página não encontrada");
            throw new RuntimeException(e);
        }
    }

    public void clickProduct(){
        try {
            driver.findElement(productImage).click();
            log.info("Produto selecionado");
        } catch (RuntimeException e) {
            log.error("Produto não localizado");
            throw new RuntimeException(e);
        }
    }

    public void addItens(int times) throws InterruptedException {
        try {
            for (int i = 1; i < times; i++) {
                driver.findElement(plusButton).click();
                log.info("Adicionado produto");
                Thread.sleep(4000);
            }
        } catch (RuntimeException e) {
            log.error("Produto indisponível");
            throw new RuntimeException(e);
        }
    }

    public void addToCart() throws InterruptedException {
        try {
            log.info("Produto adicionado ao carrinho");
            driver.findElement(cartButton).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void plusCartButton(int times) throws InterruptedException {
        try{
            for (int i = 1; i < times; i++) {
                driver.findElement(plusButtonCart).click();
                log.info("adicionado produtos com o carrinho aberto");
                Thread.sleep(4000);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateCart(){
        try {
            driver.findElement(updateButtonCart).click();
            log.info("Atualizando produto no carrinho");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        log.info("Teste de fluxo produto-carrinho concluído");
    }

    public void teardown(){
        if (driver != null){
            driver.quit();
        }
    }

}
