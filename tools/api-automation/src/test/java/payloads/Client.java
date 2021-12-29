package payloads;

public class Client {

    public static String addClient()
    {
        return "{\n" +
                "  \"firstName\": \"Pentest\",\n" +
                "  \"lastName\": \"PostmanAdd\",\n" +
                "  \"birthdate\":\"2019-12-09T00:00:00.000Z\",\n" +
                "  \"birthdateApprox\": false,\n" +
                "  \"deathdateApprox\": false,\n" +
                "  \"gender\": \"female\",\n" +
                "  \"baseEntityId\": \"test-c632-41b6-b855-eda8db7d79e0\",\n" +
                "  \"identifiers\": {\n" +
                "    \"M_ZEIR_ID\": \"1001202L_mother\"\n" +
                "  },\n" +
                "  \"addresses\": [\n" +
                "    {\n" +
                "      \"addressType\": \"usual_residence\",\n" +
                "      \"addressFields\": {\n" +
                "        \"address2\": \"Nouakchott\",\n" +
                "        \"address3\": \"b1b8c8dd-55fe-4ad3-aa73-740ae3114cd5\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"attributes\": {},\n" +
                "  \"dateCreated\": \"2019-12-12T16:32:55.557Z\",\n" +
                "  \"serverVersion\": 1576168375509,\n" +
                "  \"type\": \"Client\",\n" +
                "  \"id\": \"test-d5d4-452d-9662-8881d92995d0\",\n" +
                "  \"revision\": \"v1\"\n" +
                "}";
    }
}
