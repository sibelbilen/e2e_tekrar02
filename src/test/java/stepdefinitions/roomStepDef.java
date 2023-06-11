package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import pages.MedunnaRoomPage;
import utilities.Driver;

public class roomStepDef {

    MedunnaHomePage medunnaHomePage=new MedunnaHomePage();
    MedunnaLoginPage medunnaLoginPage=new MedunnaLoginPage();
    MedunnaRoomPage medunnaRoomPage=new MedunnaRoomPage();
    @When("Click on ItemsAndTitles")
    public void click_on_ıtems_and_titles() {
        medunnaHomePage.itemsdAndTitles.click();
    }
    @When("click on Room option")
    public void click_on_room_option() {
        medunnaHomePage.roomOption.click();
    }
    @When("click on Create a new room button")
    public void click_on_create_a_new_room_button() {
medunnaRoomPage.createANewRoomButton.click();
    }
    @When("enter {string} room number input")
    public void enter_room_number_input(String roomNum) {
     int roomNumFaker=   Faker.instance().number().numberBetween(10000,10000000);
      medunnaRoomPage.roomNumberInput.sendKeys(roomNumFaker+"");

    }
    @When("select Suite option from Room Type dropdown")
    public void select_suite_option_from_room_type_dropdown() {
new Select(medunnaRoomPage.roomTypeDropDown).selectByIndex(3);
    }
    @When("click on Status checkbox")
    public void click_on_status_checkbox() {
medunnaRoomPage.statusCheckbox.click();
    }
    @When("enter {string} in Price input")
    public void enter_in_price_input(String price) {

        medunnaRoomPage.priceInput.sendKeys(price);

    }
    @When("enter {string} in Description input")
    public void enter_in_description_input(String Description) {
medunnaRoomPage.descriptionInput.sendKeys(Description);
    }
    @When("click on Save button")
    public void click_on_save_button() {
medunnaRoomPage.saveSubmitButton.sendKeys(Keys.PAGE_DOWN,Keys.ENTER);
    }
    @When("close the application")
    public void close_the_application() {
        Driver.closeDriver();

    }



    @Given("send get request")
    public void send_get_request() {

    }
    @Then("validate body")
    public void validate_body() {

    }


    @Given("send get request by id")
    public void send_get_request_by_id() {

    }
    @Then("validate response body")
    public void validate_response_body() {

    }




    @Given("connect to database")
    public void connect_to_database() {

    }
    @Then("read room and validate")
    public void read_room_and_validate() {

    }
}
