package stepdefs;

import config.EndpointURLs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import general.ReusableFunctions;
import payloads.Client;
import payloads.Events;

import static stepdefs.Hooks.RequestPayLoad;
import static stepdefs.Hooks.endPoint;

public class Event {

    @Given("I Set POST event service api endpoint")
    public void i_Set_POST_event_service_api_endpoint() {
        endPoint = EndpointURLs.POST_EVENT;
        RequestPayLoad = Events.addEvent();
    }

    @Then("I receive valid Response for POST event service")
    public void i_receive_valid_Response_for_POST_event_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_CREATED);
    }

    @Given("I Set POST Client service api endpoint")
    public void i_Set_POST_client_service_api_endpoint() {
        endPoint = EndpointURLs.POST_CLIENT;
        RequestPayLoad = Client.addClient();
    }

    @Then("I receive valid Response for POST Client service")
    public void i_receive_valid_Response_for_POST_client_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }
}
