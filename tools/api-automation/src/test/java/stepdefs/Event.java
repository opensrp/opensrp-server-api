package stepdefs;

import config.ConfigProperties;
import config.EndpointURLs;
import config.EnvGlobals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import general.ReusableFunctions;
import payloads.Client;
import payloads.Events;
import utils.Uuid;

import static stepdefs.Hooks.RequestPayLoad;
import static stepdefs.Hooks.endPoint;

public class Event {


    @Given("I Set POST event service api endpoint")
    public void i_Set_POST_event_service_api_endpoint() {
        EnvGlobals.eventBasicEntityID_uuid = Uuid.generateUuid();
        EnvGlobals.eventLocation_uuid = Uuid.generateUuid();
        EnvGlobals.formSubmissionId_uuid = Uuid.generateUuid();
        EnvGlobals.eventId_uuid=Uuid.generateUuid();
        endPoint = EndpointURLs.POST_EVENT;
        RequestPayLoad = Events.addEvent(EnvGlobals.clientBasicEntityID_uuid,EnvGlobals.clientAddress_uuid,EnvGlobals.clientId_uuid,EnvGlobals.teamName,EnvGlobals.teamUuid,EnvGlobals.eventBasicEntityID_uuid,EnvGlobals.eventLocation_uuid ,EnvGlobals.formSubmissionId_uuid,EnvGlobals.eventId_uuid, ConfigProperties.username,"female");
    }

    @Then("I receive valid Response for POST event service")
    public void i_receive_valid_Response_for_POST_event_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_CREATED);
    }

    @Given("I Set Put event service api endpoint")
    public void i_Set_Put_event_service_api_endpoint() {
        endPoint = EndpointURLs.POST_EVENT;
        RequestPayLoad = Events.addEvent(EnvGlobals.clientBasicEntityID_uuid,EnvGlobals.clientAddress_uuid,EnvGlobals.clientId_uuid,EnvGlobals.teamName,EnvGlobals.teamUuid,EnvGlobals.eventBasicEntityID_uuid,EnvGlobals.eventLocation_uuid ,EnvGlobals.formSubmissionId_uuid,EnvGlobals.eventId_uuid, ConfigProperties.username,"male");
    }

    @Then("I receive valid Response for Put event service")
    public void i_receive_valid_Response_for_Put_event_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }


    @Given("I Set POST Client service api endpoint")
    public void i_Set_POST_client_service_api_endpoint() {
        EnvGlobals.clientBasicEntityID_uuid = Uuid.generateUuid();
        EnvGlobals.clientId_uuid = Uuid.generateUuid();
        EnvGlobals.clientAddress_uuid = Uuid.generateUuid();
        endPoint = EndpointURLs.POST_CLIENT;
        RequestPayLoad = Client.addClient(EnvGlobals.clientBasicEntityID_uuid,EnvGlobals.clientAddress_uuid,EnvGlobals.clientId_uuid);
    }

    @Then("I receive valid Response for POST Client service")
    public void i_receive_valid_Response_for_POST_client_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        validation.Client.validateClientResponseBody();
    }

    @Given("I Set Put Client service api endpoint")
    public void i_Set_Put_client_service_api_endpoint() {
        endPoint = EndpointURLs.POST_CLIENT;
        RequestPayLoad = Client.UpdateClient(EnvGlobals.clientBasicEntityID_uuid,EnvGlobals.clientAddress_uuid,EnvGlobals.clientId_uuid,"male");
    }

    @Then("I receive valid Response for Put Client service")
    public void i_receive_valid_Response_for_Put_client_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        validation.Client.validateClientResponseBody();
        validation.Client.validateUpdatedField("male");
    }
}
