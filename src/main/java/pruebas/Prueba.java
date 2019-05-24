package pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import robot.NoticiasAcademicas;

public class Prueba {

    private static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.get("https://divisist2.ufps.edu.co/");

        NoticiasAcademicas n = new NoticiasAcademicas(driver);
        System.out.println( n.getTitulo() );
        n.noticias();
        n.cerrarNoticias();

        driver.quit();

    }



}
