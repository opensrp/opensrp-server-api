package validation;

import config.ConfigProperties;
import config.EnvGlobals;
import general.ReusableFunctions;
import org.junit.Assert;

public class Search {


    public static void validateLastName() {
        Assert.assertEquals(ReusableFunctions.getResponsePath("lastName"), "[admin]");
    }

    public static void validateGender() {
        Assert.assertEquals(ReusableFunctions.getResponsePath("gender"), "[female]");
    }

    public static void validateClientName() {
        Assert.assertEquals(ReusableFunctions.getResponsePath("firstName"), "[Web]");
    }

    public static void validateTeamName()
    {
        for(int i=0;i<ReusableFunctions.responseList("").size();i++)
        {
            Assert.assertEquals(ReusableFunctions.getResponsePath("["+i+"].team"), EnvGlobals.teamName);

        }
    }

    public static void validateTeamId()
    {
        for(int i=0;i<ReusableFunctions.responseList("").size();i++)
        {
            Assert.assertEquals(ReusableFunctions.getResponsePath("["+i+"].teamId"), EnvGlobals.teamUuid);

        }
    }

    public static void validateLocationId()
    {
        for(int i=0;i<ReusableFunctions.responseList("").size();i++)
        {
            Assert.assertEquals(ReusableFunctions.getResponsePath("["+i+"].locationId"), EnvGlobals.eventLocation_uuid);

        }
    }

    public static void validateProviderId()
    {
        for(int i=0;i<ReusableFunctions.responseList("").size();i++)
        {
            Assert.assertEquals(ReusableFunctions.getResponsePath("["+i+"].providerId"), ConfigProperties.username);

        }
    }

    public static void validateEntityType()
    {
        for(int i=0;i<ReusableFunctions.responseList("").size();i++)
        {
            Assert.assertEquals(ReusableFunctions.getResponsePath("["+i+"].entityType"), "child");

        }
    }
}
