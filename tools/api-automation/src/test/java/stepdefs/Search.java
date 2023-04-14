package stepdefs;

import config.ConfigProperties;
import config.EndpointURLs;
import config.EnvGlobals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import general.ReusableFunctions;

import static stepdefs.Hooks.endPoint;

public class Search {
    @Given("I Set GET Unique Id request api service endpoint")
    public void i_Set_GET_Unique_Id_request_api_service_endpoint() {
        endPoint = EndpointURLs.GET_UNIQUE_ID_REQ;
    }

    @Then("I receive valid Response for GET Unique Id request service")
    public void i_receive_valid_Response_for_GET_Unique_Id_request_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

    @Given("I Set Search Client By Path api service endpoint")
    public void i_Set_Search_Client_By_Path_api_service_endpoint() {
        endPoint = EndpointURLs.SEARCH_CLIENT_BY_PATH;
    }

    @Then("I receive valid Response for Search Client By Path service")
    public void i_receive_valid_Response_for_Search_Client_By_Path_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

    @Given("I Set Search Client II api service endpoint")
    public void i_Set_Search_Client_II_api_service_endpoint() {
        endPoint = EndpointURLs.SEARCH_CLIENT_II;
    }

    @Then("I receive valid Response for Search Client II service")
    public void i_receive_valid_Response_for_Search_Client_II_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        validation.Search.validateLastName();
    }

    @Given("I Set Search Client By Gender api service endpoint")
    public void i_Set_Search_Client_By_Gender_api_service_endpoint() {
        endPoint = EndpointURLs.SEARCH_CLIENT_BY_GENDER;
    }

    @Then("I receive valid Response for Search Client By Gender  service")
    public void i_receive_valid_Response_for_Search_Client_By_Gender_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        validation.Search.validateGender();
    }

    @Given("I Set Fetch Client By Id api service endpoint")
    public void i_Set_Fetch_Client_By_Id_api_service_endpoint() {
        endPoint = EndpointURLs.FETCH_CLIENT_BY_ID;
    }

    @Then("I receive valid Response for SFetch Client By Id service")
    public void i_receive_valid_Response_for_SFetch_Client_By_Id_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

    @Given("I Set Search Client By Birthday api service endpoint")
    public void i_Set_Search_Client_By_Birthday_api_service_endpoint() {
        endPoint = EndpointURLs.SEARCH_CLIENT_BY_BIRTHDAY;
    }

    @Then("I receive valid Response for Search Client By Birthday  service")
    public void i_receive_valid_Response_for_Search_Client_By_Birthday_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

    @Given("I Set Search Client By Name api service endpoint")
    public void i_Set_Search_Client_By_Name_api_service_endpoint() {
        endPoint = EndpointURLs.SEARCH_CLIENT_BY_NAME;
    }

    @Then("I receive valid Response for Search Client By Name  service")
    public void i_receive_valid_Response_for_Search_Client_By_Name_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        validation.Search.validateClientName();
    }

    @Given("I Set GET all users api service endpoint")
    public void i_Set_GET_all_users_api_service_endpoint() {
        endPoint = EndpointURLs.GET_ALL_USERS;
    }

    @Then("I receive valid Response for GET all users service")
    public void i_receive_valid_Response_for_GET_all_users_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

    @Given("I Set GET all events api service endpoint")
    public void i_Set_GET_all_events_api_service_endpoint() {
        endPoint = EndpointURLs.GET_ALL_EVENTS;
    }

    @Then("I receive valid Response for GET all events service")
    public void i_receive_valid_Response_for_GET_all_events_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

    @Given("I Set GET all stocks api service endpoint")
    public void i_Set_GET_all_stocks_api_service_endpoint() {
        endPoint = EndpointURLs.GET_ALL_STOCK;
    }

    @Then("I receive valid Response for GET all stocks service")
    public void i_receive_valid_Response_for_GET_all_stocks_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

    @Given("I Set GET stock by id api service endpoint")
    public void i_Set_GET_stock_by_id_api_service_endpoint() {
        endPoint = EndpointURLs.GET_ALL_STOCK_BY_ID;
    }

    @Then("I receive valid Response for GET stock by id service")
    public void i_receive_valid_Response_for_GET_stock_by_id_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

    @Given("I Set Search  Event By team api service endpoint")
    public void i_Set_Search_Event_By_team_api_service_endpoint() {
        endPoint = String.format(EndpointURLs.SEARCH_EVENT_BY_TEAM, EnvGlobals.teamName);
    }

    @Then("I receive valid Response for Search Event By team service")
    public void i_receive_valid_Response_for_Search_Event_By_team_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        validation.Search.validateTeamName();
    }

    @Given("I Set Search  Event By team id api service endpoint")
    public void i_Set_Search_Event_By_team_id_api_service_endpoint() {
        endPoint = String.format(EndpointURLs.SEARCH_EVENT_BY_TEAM_ID,EnvGlobals.teamUuid);
    }

    @Then("I receive valid Response for Search Event By team id service")
    public void i_receive_valid_Response_for_Search_Event_By_team_id_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        validation.Search.validateTeamId();
    }

    @Given("I Set Search  Event By Location id api service endpoint")
    public void i_Set_Search_Event_By_Location_id_api_service_endpoint() {
        endPoint = String.format(EndpointURLs.SEARCH_EVENT_BY_LOCATION_ID,EnvGlobals.eventLocation_uuid);
    }

    @Then("I receive valid Response for Search Event By Location id service")
    public void i_receive_valid_Response_for_Search_Event_By_Location_id_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        validation.Search.validateLocationId();
    }

    @Given("I Set Search  Event By Provider id api service endpoint")
    public void i_Set_Search_Event_By_Provider_id_api_service_endpoint() {
        endPoint = String.format(EndpointURLs.SEARCH_EVENT_BY_PROVIDER_ID,ConfigProperties.username);

    }

    @Then("I receive valid Response for Search Event By Provider id service")
    public void i_receive_valid_Response_for_Search_Event_By_Provider_id_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        validation.Search.validateProviderId();
    }

    @Given("I Set Search  Event By Entity type api service endpoint")
    public void i_Set_Search_Event_By_Entity_type_api_service_endpoint() {
        endPoint = EndpointURLs.SEARCH_EVENT_BY_ENTITY_TYPE;

    }

    @Then("I receive valid Response for Search Event By Entity type service")
    public void i_receive_valid_Response_for_Search_Event_By_Entity_type_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        validation.Search.validateEntityType();
    }

    @Given("I Set Search  Event By Event type api service endpoint")
    public void i_Set_Search_Event_By_Event_type_api_service_endpoint() {
        endPoint = EndpointURLs.SEARCH_EVENT_ID_BY_EVENT_TYPE;
    }

    @Then("I receive valid Response for Search Event By Event type service")
    public void i_receive_valid_Response_for_Search_Event_By_Event_type_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

    @Given("I Set Search  Event By id api service endpoint")
    public void i_Set_Search_Event_By_id_api_service_endpoint() {
        endPoint = String.format(EndpointURLs.SEARCH_EVENT_BY_ID,EnvGlobals.eventId_uuid);
    }

    @Then("I receive valid Response for Search Event By id service")
    public void i_receive_valid_Response_for_Search_Event_By_id_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

    @Given("I Set Fetch Provider action api service endpoint")
    public void i_Set_Fetch_Provider_action_api_service_endpoint() {
        endPoint = String.format(EndpointURLs.GET_PROVIDER_ACTION,ConfigProperties.username);
    }

    @Then("I receive valid Response for Fetch Provider action service")
    public void i_receive_valid_Response_for_Fetch_Provider_action_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }


}
