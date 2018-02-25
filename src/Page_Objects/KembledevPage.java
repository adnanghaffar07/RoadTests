package Page_Objects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KembledevPage {
	
	private static WebElement element = null;
	private static boolean isPresent = false;

	public static WebElement checkInDatePicker(WebDriver driver) {
		element = driver.findElement(By.id("checkIn"));
		return element;		
	}
	public static WebElement pickDateForCheckIN(WebDriver driver,int index,int date) {
		List<WebElement>check_in = driver.findElements(By.xpath("//span[text() = "+date+"]"));
		return element = check_in.get(index);
	}
	public static WebElement pickDateForCheckOut(WebDriver driver , int index, int date) {
		List<WebElement>check_in = driver.findElements(By.xpath("//span[text() = 29]"));
		return element = check_in.get(index);	
	}
	public static WebElement changeDateForCheckIN(WebDriver driver,int index,int date) {
		List<WebElement>check_in = driver.findElements(By.xpath("//span[text() = "+date+"]"));
		return element = check_in.get(index);
	}
	public static WebElement changeDateForCheckOut(WebDriver driver , int index,int date) {
		List<WebElement>check_in = driver.findElements(By.xpath("//span[text() = "+date+"]"));
		return element = check_in.get(index);	
	}

	public static WebElement staticDatePickerCheckIn(WebDriver driver , int index, int date) {
		List<WebElement>date_picker = driver.findElements(By.xpath("//span[text() = "+date+"]"));
		return element = date_picker.get(index);	
	}
	public static WebElement staticDatePickerCheckOut(WebDriver driver , int index, int date) {
		List<WebElement>date_picker = driver.findElements(By.xpath("//span[text() = "+date+"]"));
		return element = date_picker.get(index);	
	}
	public static WebElement checkOutDatePicker(WebDriver driver) {
		element = driver.findElement(By.id("checkOut"));
		return element;		
	}
	public static WebElement adultField(WebDriver driver) {
		element = driver.findElement(By.id("adults"));
		return element;		
	}
	public static WebElement childrenField(WebDriver driver) {
		element = driver.findElement(By.id("children"));
		return element;		
	}
	public static WebElement promoCodeField(WebDriver driver) {
		element = driver.findElement(By.id("promoCode"));
		return element;		
	}
	public static WebElement searchForRoomButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".searchForm__footer___3h3iP div button"));
		return element;
	}
	public static WebElement totalRoom(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".search__resultsTitle___3g9F_ span"));
		return element;		
	}
	public static int totalRoomsInSearch(WebDriver driver) {
		List<WebElement> total_room =driver.findElements(By.className("roomSummary__roomSummary___2P0fi"));
		return  total_room.size();
	}
	public static WebElement viewMoreInfoButton(WebDriver driver,int index) {
		List<WebElement> room_view =driver.findElements(By.cssSelector(".roomSummary__roomSummary___2P0fi a "));
		element = room_view.get(index);
		return element;		
	}
	
	public static WebElement checekInRoomView(WebDriver driver,int index) {
		List<WebElement> check_in =driver.findElements(By.cssSelector(".dateRangePicker__formGroup___3iFJD p"));
		element = check_in.get(index);
		return element;		
	}
	public static WebElement checekOutRoomView(WebDriver driver,int index) {
		List<WebElement> check_out =driver.findElements(By.cssSelector(".dateRangePicker__formGroup___3iFJD p"));
		element = check_out.get(index);
		return element;		
	}
	public static WebElement guestInRoomView(WebDriver driver,int index) {
		List<WebElement> guest =driver.findElements(By.cssSelector(".searchForm__formGroup___2QzSl p"));
		element = guest.get(index);
		return element;		
	}
	public static WebElement promoCodeInRoomView(WebDriver driver,int index) {
		List<WebElement> promo_code =driver.findElements(By.cssSelector(".searchForm__formGroup___2QzSl p"));
		element = promo_code.get(index);
		return element;		
	}
	public static WebElement roomTitleInRoomView(WebDriver driver,int index) {
		List<WebElement> room_title =driver.findElements(By.cssSelector(".rate__title___u6Ffu"));
		element = room_title.get(index);
		return element;		
	}
	public static WebElement oneNightStayRate(WebDriver driver,int index) {
		List<WebElement> rate_one_night =driver.findElements(By.cssSelector(".rate-card h3 span"));
		element = rate_one_night.get(index);
		return element;		
	}
	public static WebElement taxesAndServiceFee(WebDriver driver,int index) {
		List<WebElement> taxes_services_fees =driver.findElements(By.cssSelector(".rate-card h3 span"));
		element = taxes_services_fees.get(index);
		return element;		
	}
	public static WebElement totalCost(WebDriver driver,int index) {
		List<WebElement> total_cost =driver.findElements(By.cssSelector(".rate-card h3 span"));
		element = total_cost.get(index);
		return element;		
	}
	public static WebElement roomDescriptions(WebDriver driver,int index) {
		List<WebElement> view_description =driver.findElements(By.cssSelector(".room__descTabPane___3LQXQ div"));
		element = view_description.get(index);
		return element;		
	}
	public static int totalAmenities(WebDriver driver) {
		List<WebElement> amunties =driver.findElements(By.cssSelector(".room__descTabPane___3LQXQ div ul li"));
		return amunties.size();		
	}
	public static WebElement amenities(WebDriver driver,int index) {
		List<WebElement> amunties =driver.findElements(By.cssSelector(".room__descTabPane___3LQXQ div ul li"));
		element = amunties.get(index);
		return element;		
	}
	public static WebElement editReservationDetailsButton(WebDriver driver) {
		element =driver.findElement(By.cssSelector(".room__title___3eWcd a i"));
		return element;		
	}
	public static WebElement checkAvailabilityButton(WebDriver driver) {
		element =driver.findElement(By.cssSelector(".room__submitButton___3fefb"));
		return element;		
	}
	public static WebElement bookRoomButton(WebDriver driver,int index) {
		List<WebElement> room_view =driver.findElements(By.className("rate__btnBook___2Rg5D"));
		element = room_view.get(index);
		return element;		
	}
	public static WebElement checkOutMeLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".addons__checkoutSection___1-geM button span"));
		return element;		
	}
	public static WebElement addOrRemoveExtraThing(WebDriver driver, int index) {
		List<WebElement>extra_list = driver.findElements(By.className("addOn__counterButton___3YYE4"));
		return element = extra_list.get(index);		
	}
	public static WebElement ExtraThingPriceInForm(WebDriver driver, int index) {
		List<WebElement>extra_price_list = driver.findElements(By.cssSelector(".checkout__sidebarContent___hcNnV div span"));
		return element = extra_price_list.get(index);		
	}
	public static WebElement checkExtraThingAdded(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".addons__checkoutSection___1-geM button span"));
		return element ;		
	}
	public static WebElement removeExtraThing(WebDriver driver, int index) {
		List<WebElement>extra_list = driver.findElements(By.className("addOn__counterButton___3YYE4 btn"));
		return element = extra_list.get(index);		
	}
	public static WebElement firstNameField(WebDriver driver) {
		element = driver.findElement(By.id("firstName"));
		return element;		
	}
	public static WebElement lastNameField(WebDriver driver) {
		element = driver.findElement(By.id("lastName"));
		return element;		
	}
	public static WebElement emailAddressField(WebDriver driver) {
		element = driver.findElement(By.id("emailAddress"));
		return element;		
	}
	public static WebElement phoneNumberField(WebDriver driver) {
		element = driver.findElement(By.id("phoneNumber"));
		return element;		
	}
	public static WebElement homeAddressField(WebDriver driver) {
		element = driver.findElement(By.id("homeAddress"));
		return element;		
	}
	public static WebElement zipcodeField(WebDriver driver) {
		element = driver.findElement(By.id("homeZipCode"));
		return element;		
	}
	public static WebElement cityField(WebDriver driver) {
		element = driver.findElement(By.id("homeCity"));
		return element;		
	}
	public static WebElement stateButton(WebDriver driver) {
		List<WebElement> state_button = driver.findElements(By.className("dropdown-toggle"));
		element = state_button.get(2);
		return element;		
	}
	public static WebElement selectSate(WebDriver driver,int index) {
		List<WebElement> state_list = driver.findElements(By.cssSelector(".homeState-group div div ul li"));
		element = state_list.get(index);
		return element;		
	}
	public static WebElement ccNumberField(WebDriver driver) {
		element = driver.findElement(By.id("creditCardNumber"));
		return element;		
	}
	public static WebElement ccExpDateField(WebDriver driver) {
		element = driver.findElement(By.id("expirationDate"));
		return element;		
	}
	public static WebElement cardFullNameField(WebDriver driver) {
		element = driver.findElement(By.id("cardFullName"));
		return element;		
	}
	public static WebElement cvvField(WebDriver driver) {
		element = driver.findElement(By.id("cvv"));
		return element;		
	}
	
	
	
	
	public static Boolean firstNameFieldIsPresent(WebDriver driver) {
		isPresent = driver.findElements(By.id("")).size() > 0;
		return isPresent;		
	}
	public static Boolean lastNameFieldIsPresent(WebDriver driver) {
		isPresent = driver.findElements(By.id("lastNames")).size()>0;
		return isPresent;		
	}
	public static Boolean emailAddressFieldIsPresnt(WebDriver driver) {
		isPresent = driver.findElements(By.id("emailAddress")).size()>0;
		return isPresent;		
	}
	public static Boolean phoneNumberFieldIsPresnt(WebDriver driver) {
		isPresent = driver.findElements(By.id("phoneNumber")).size()>0;
		return isPresent;		
	}
	public static Boolean homeAddressFieldIsPresnt(WebDriver driver) {
		isPresent = driver.findElements(By.id("homeAddress")).size()>0;
		return isPresent;		
	}
	public static Boolean zipcodeFieldIsPresnt(WebDriver driver) {
		isPresent = driver.findElements(By.id("homeZipCode")).size()>0;
		return isPresent;		
	}
	public static Boolean cityFieldIsPresnt(WebDriver driver) {
		isPresent = driver.findElements(By.id("homeCity")).size()>0;
		return isPresent;		
	}
	public static WebElement stateButtonIsPresnt(WebDriver driver) {
		List<WebElement> state_button = driver.findElements(By.className("dropdown-toggle"));
		element = state_button.get(2);
		return element;		
	}
	public static WebElement selectSateIsPresnt(WebDriver driver,int index) {
		List<WebElement> state_list = driver.findElements(By.cssSelector(".homeState-group div div ul li"));
		element = state_list.get(index);
		return element;		
	}
	public static Boolean ccNumberFieldIsPresnt(WebDriver driver) {
		isPresent = driver.findElements(By.id("creditCardNumber")).size()>0;
		return isPresent;		
	}
	public static Boolean ccExpDateFieldIsPresnt(WebDriver driver) {
		isPresent = driver.findElements(By.id("expirationDate")).size()>0;
		return isPresent;		
	}
	public static Boolean cardFullNameFieldIsPresent(WebDriver driver) {
		isPresent = driver.findElements(By.id("cardFullName")).size()>0;
		return isPresent;		
	}
	public static Boolean cvvFieldIsPresnt(WebDriver driver) {
		isPresent = driver.findElements(By.id("cvv")).size()>0;
		return isPresent;		
	}
	
	
	
	
	
	
	public static WebElement agreeCheckBox(WebDriver driver) {
		List<WebElement> agree_checkbox = driver.findElements(By.cssSelector(".checkbox__inputWrapper___2O6kx i"));
		return element = agree_checkbox.get(1);		
	}
	public static WebElement bookStayButton(WebDriver driver) {
		List<WebElement> book_button = driver.findElements(By.className("searchForm__submitButton___1Ksmn"));
		return element = book_button.get(0);		
	}
	public static WebElement backBuuton(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".room__backRoomsLink___2uMBr span"));
		return element;		
	}
}
