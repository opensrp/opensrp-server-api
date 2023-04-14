package validation;

import config.ConfigProperties;
import config.EnvGlobals;
import general.ReusableFunctions;
import org.junit.Assert;

public class Client {

    public static void validateClientResponseBody() {
        EnvGlobals.clientBasicEntityID_uuid = ReusableFunctions.getResponsePath("baseEntityId");
        EnvGlobals.clientId_uuid = ReusableFunctions.getResponsePath("_id");
        Assert.assertNotNull(ReusableFunctions.getResponsePath("baseEntityId"));
        Assert.assertNotNull(ReusableFunctions.getResponsePath("_id"));
        Assert.assertEquals(ReusableFunctions.getResponsePath("addresses.addressFields.address3"), "["+EnvGlobals.clientAddress_uuid+"]");
    }


    public static void validateUpdatedField(String gender) {
        Assert.assertEquals(ReusableFunctions.getResponsePath("gender"), gender);
    }
}
