import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcessoSite {
	
	@Test
	public void acesso() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.clubedepregadores.com.br/");
		Assert.assertEquals("Acesso ALUNO", driver.getTitle());
		driver.quit();
	}
}