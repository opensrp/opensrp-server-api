package validation;

import config.ConfigProperties;
import config.EnvGlobals;
import cucumber.runtime.Env;
import general.ReusableFunctions;
import org.junit.Assert;

public class SYNC {

    public static void validateSyncByLocation() {
        Assert.assertEquals(ReusableFunctions.getResponsePath("events.type"), "[Event]");
        Assert.assertEquals(ReusableFunctions.getResponsePath("events.baseEntityId"), "["+EnvGlobals.eventBasicEntityID_uuid+"]");
        Assert.assertEquals(ReusableFunctions.getResponsePath("events.locationId"), "["+EnvGlobals.eventLocation_uuid+"]");
        Assert.assertEquals(ReusableFunctions.getResponsePath("events.formSubmissionId"), "["+EnvGlobals.formSubmissionId_uuid+"]");
        Assert.assertEquals(ReusableFunctions.getResponsePath("events.providerId"), "["+ConfigProperties.username+"]");
        Assert.assertEquals(ReusableFunctions.getResponsePath("events.teamId"),"["+ EnvGlobals.teamUuid+"]");
        Assert.assertEquals(ReusableFunctions.getResponsePath("events.team"), "["+EnvGlobals.teamName+"]");
        Assert.assertEquals(ReusableFunctions.getResponsePath("events._id"), "["+EnvGlobals.eventId_uuid+"]");
    }
}
