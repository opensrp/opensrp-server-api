package stepdefs;

import config.EndpointURLs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import general.ReusableFunctions;

import static stepdefs.Hooks.endPoint;

public class Authentication {
    @Given("I Set GET authentication api service endpoint")
    public void i_Set_GET_authentication_api_service_endpoint() {
        endPoint = EndpointURLs.GET_AUTHNETICATION;
    }
    @Then("I receive valid Response for GET Authentication service")
    public void i_receive_valid_Response_for_GET_Authentication_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        validation.Authentication.validateUserName();
    }

}
