package robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NoticiasAcademicas {

    private String url = "https://divisist2.ufps.edu.co/";
    // xpath contenedor principal
    private By div = By.xpath("/html/body/div[1]/div[2]/div[2]");

    private WebDriver driver;

    private By header = By.tagName("header");
    private By h1 = By.tagName("h1");
    private By a = By.tagName("a");
    private By p = By.tagName("p");

    public NoticiasAcademicas(WebDriver driver){
        this.driver = driver;
    }

    public String getTitulo(){
        WebElement element = driver.findElement( div );
        element = element.findElement( header );
        element = element.findElement( h1 );

        return element.getText();
    }

    public List<WebElement> noticias(){
        WebElement element = driver.findElement( div );
        element = element.findElement( By.tagName("div") );
        element = element.findElement( By.tagName("div") );

        List<WebElement>lista = element.findElements( p );

        System.out.println(lista.size());

        for (WebElement e :lista) {
            System.out.println(e.getText());
            System.out.println("---------------------------");
        }

        return lista;
    }

    public void cerrarNoticias(){
        WebElement element = driver.findElement( div );
        element = element.findElement( header );
        element = element.findElement( a );

        element.click();
    }

}
