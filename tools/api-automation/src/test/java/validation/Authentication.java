package validation;

import config.ConfigProperties;
import config.EnvGlobals;
import general.ReusableFunctions;
import org.junit.Assert;

public class Authentication {

    public static void validateUserName() {
        EnvGlobals.teamName = ReusableFunctions.getResponsePath("team.team.teamName");
        EnvGlobals.teamUuid = ReusableFunctions.getResponsePath("team.uuid");
        System.out.println(EnvGlobals.teamName);
        System.out.println(EnvGlobals.teamUuid);
        Assert.assertEquals(ReusableFunctions.getResponsePath("user.username"), ConfigProperties.username);
    }
}
