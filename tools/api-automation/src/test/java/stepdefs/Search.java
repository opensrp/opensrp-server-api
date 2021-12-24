package stepdefs;

import config.EndpointURLs;
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
    }

    @Given("I Set Search Client By Gender api service endpoint")
    public void i_Set_Search_Client_By_Gender_api_service_endpoint() {
        endPoint = EndpointURLs.SEARCH_CLIENT_BY_GENDER;
    }

    @Then("I receive valid Response for Search Client By Gender  service")
    public void i_receive_valid_Response_for_Search_Client_By_Gender_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
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
    }

    @Given("I Set GET all users api service endpoint")
    public void i_Set_GET_all_users_api_service_endpoint() {
        endPoint = EndpointURLs.GET_ALL_USERS;
    }

    @Then("I receive valid Response for GET all users service")
    public void i_receive_valid_Response_for_GET_all_users_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

}

