package payloads;

public class Client {

    public static String addClient(String baseEntityUuid,String addressUuid,String id_uuid)
    {
        return "{\n" +
                "  \"firstName\": \"Web\",\n" +
                "  \"lastName\": \"admin\",\n" +
                "  \"birthdate\":\"2019-12-09T00:00:00.000Z\",\n" +
                "  \"birthdateApprox\": false,\n" +
                "  \"deathdateApprox\": false,\n" +
                "  \"gender\": \"female\",\n" +
                "  \"baseEntityId\": \""+baseEntityUuid+"\",\n" +
                "  \"identifiers\": {\n" +
                "    \"M_ZEIR_ID\": \"1001202L_mother\"\n" +
                "  },\n" +
                "  \"addresses\": [\n" +
                "    {\n" +
                "      \"addressType\": \"usual_residence\",\n" +
                "      \"addressFields\": {\n" +
                "        \"address2\": \"Nouakchott\",\n" +
                "        \"address3\": \""+addressUuid+"\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"attributes\": {},\n" +
                "  \"dateCreated\": \"2019-12-12T16:32:55.557Z\",\n" +
                "  \"serverVersion\": 1576168375509,\n" +
                "  \"type\": \"Client\",\n" +
                "  \"id\": \""+id_uuid+"\",\n" +
                "  \"revision\": \"v1\"\n" +
                "}";
    }

    public static String UpdateClient(String baseEntityUuid,String addressUuid,String id_uuid,String gender)
    {
        return "{\n" +
                "  \"firstName\": \"Web\",\n" +
                "  \"lastName\": \"admin\",\n" +
                "  \"birthdate\":\"2019-12-09T00:00:00.000Z\",\n" +
                "  \"birthdateApprox\": false,\n" +
                "  \"deathdateApprox\": false,\n" +
                "  \"gender\": \""+gender+"\",\n" +
                "  \"baseEntityId\": \""+baseEntityUuid+"\",\n" +
                "  \"identifiers\": {\n" +
                "    \"M_ZEIR_ID\": \"1001202L_mother\"\n" +
                "  },\n" +
                "  \"addresses\": [\n" +
                "    {\n" +
                "      \"addressType\": \"usual_residence\",\n" +
                "      \"addressFields\": {\n" +
                "        \"address2\": \"Nouakchott\",\n" +
                "        \"address3\": \""+addressUuid+"\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"attributes\": {},\n" +
                "  \"dateCreated\": \"2019-12-12T16:32:55.557Z\",\n" +
                "  \"serverVersion\": 1576168375509,\n" +
                "  \"type\": \"Client\",\n" +
                "  \"id\": \""+id_uuid+"\",\n" +
                "  \"revision\": \"v1\"\n" +
                "}";
    }
}
