package utils;

import config.ConfigProperties;
import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class TestUtils {
    public static String testOAuthWithAuthorizationCode() throws JSONException {
        Response response = given().auth().preemptive().basic("opensrp-stage-server", ConfigProperties.privateKey)
                .contentType("application/x-www-form-urlencoded")
                .formParam("grant_type", "password")
                .formParam("username", ConfigProperties.username)
                .formParam("password", ConfigProperties.password)
                .when()
                .post("https://keycloak-stage.smartregister.org/auth/realms/opensrp-web-stage/protocol/openid-connect/token");

        JSONObject jsonObject = new JSONObject(response.getBody().asString());
        String accessToken = jsonObject.get("access_token").toString();
        System.out.println(accessToken);
        return accessToken;
    }
}