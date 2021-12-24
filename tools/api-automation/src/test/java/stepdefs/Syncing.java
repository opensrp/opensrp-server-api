package stepdefs;

import config.EndpointURLs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import general.ReusableFunctions;

import static stepdefs.Hooks.endPoint;

public class Syncing {
    @Given("I Set GET Event Sync by Location api service endpoint")
    public void i_Set_GET_Event_Sync_by_Location_api_service_endpoint() {
        endPoint = EndpointURLs.SYNC_BY_LOCATION;

    }

    @Then("I receive valid Response for GET Event Sync by Location service")
    public void i_receive_valid_Response_for_GET_Event_Sync_by_Location_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);

    }

    @Given("I Set GET Event Sync by Provider api service endpoint")
    public void i_Set_GET_Event_Sync_by_Provider_api_service_endpoint() {
        endPoint = EndpointURLs.SYNC_BY_PROVIDER;

    }

    @Then("I receive valid Response for GET Event Sync by Provider service")
    public void i_receive_valid_Response_for_GET_Event_Sync_by_Provider_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);

    }

    @Given("I Set GET Event Sync by Team api service endpoint")
    public void i_Set_GET_Event_Sync_by_Team_api_service_endpoint() {
        endPoint = EndpointURLs.SYNC_BY_TEAM;

    }

    @Then("I receive valid Response for GET Event Sync by Team service")
    public void i_receive_valid_Response_for_GET_Event_Sync_by_Team_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);

    }
    @Given("I Set GET Sync View Configuration api service endpoint")
    public void i_Set_GET_Sync_View_Configuration_api_service_endpoint() {
        endPoint = EndpointURLs.SYNC_VIEW_CONFIGURATION;
    }

    @Then("I receive valid Response for GET Sync View Configuration service")
    public void i_receive_valid_Response_for_GET_Sync_View_Configuration_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }
    @Given("I Set Sync ServerSide Client api service endpoint")
    public void i_Set_Sync_ServerSide_Client_api_service_endpoint() {
        endPoint = EndpointURLs.SYNC_SERVERSIDE_SETTING;
    }

    @Then("I receive valid Response for Sync ServerSide Client service")
    public void i_receive_valid_Response_for_Sync_ServerSide_Client_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }
}
