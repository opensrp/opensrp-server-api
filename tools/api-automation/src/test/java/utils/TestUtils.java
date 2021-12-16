package utils;

import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class TestUtils {
    public static String testOAuthWithAuthorizationCode() throws JSONException {
        Response response = given().auth().preemptive().basic("opensrp-stage-server", "02a9cced-690f-48eb-b1f9-e82e523efa61")
                .contentType("application/x-www-form-urlencoded")
                .formParam("grant_type", "password")
                .formParam("username", "web-admin")
                .formParam("password", "2EeJ6Yty")
                .when()
                .post("https://keycloak-stage.smartregister.org/auth/realms/opensrp-web-stage/protocol/openid-connect/token");

        JSONObject jsonObject = new JSONObject(response.getBody().asString());
        String accessToken = jsonObject.get("access_token").toString();
        System.out.println(accessToken);
        return accessToken;
    }
}