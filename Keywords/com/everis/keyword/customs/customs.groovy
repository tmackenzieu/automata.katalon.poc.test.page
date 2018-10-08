package com.everis.keyword.customs
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class customs {

	@Keyword
	def getProductsList(){
		WebDriver webDriver = DriverFactory.getWebDriver()
		List<WebElement> productsList = webDriver.findElements(By.xpath("//div[@id='calugas-productos']/div"))
		int randomItem = new Random().nextInt(productsList.size())
		WebElement elementoSeleccionado = productsList.get(randomItem)
		System.out.println(elementoSeleccionado.getText())
	}
}
