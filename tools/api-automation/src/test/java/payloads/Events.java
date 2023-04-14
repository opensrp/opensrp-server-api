package payloads;

public class Events {
    public static String addEvent(String clientBase,String clientAddress,String clientId,String teamName,String teamId,String eventBase,String location,String form,String eventId,String provider,String gender)
    {
        return "{\n" +
                "  \"clients\": [\n" +
                "    {\n" +
                "      \"firstName\": \"Web\",\n" +
                "      \"lastName\": \"admin\",\n" +
                "      \"birthdateApprox\": false,\n" +
                "      \"deathdateApprox\": false,\n" +
                "      \"gender\": \""+gender+"\",\n" +
                "      \"baseEntityId\": \""+clientBase+"\",\n" +
                "      \"identifiers\": {\n" +
                "        \"M_ZEIR_ID\": \"1001202L_mother\"\n" +
                "      },\n" +
                "      \"addresses\": [\n" +
                "        {\n" +
                "          \"addressType\": \"usual_residence\",\n" +
                "          \"addressFields\": {\n" +
                "            \"address2\": \"Nouakchott\",\n" +
                "            \"address3\": \""+clientAddress+"\"\n" +
                "          }\n" +
                "        }\n" +
                "      ],\n" +
                "      \"attributes\": {},\n" +
                "      \"dateCreated\": \"2019-12-12T16:32:55.557Z\",\n" +
                "      \"serverVersion\": 1576168375509,\n" +
                "      \"type\": \"Client\",\n" +
                "      \"id\": \""+clientId+"\",\n" +
                "      \"revision\": \"v1\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"no_of_events\": 1,\n" +
                "  \"events\": [\n" +
                "    {\n" +
                "      \"identifiers\": {},\n" +
                "      \"baseEntityId\": \""+eventBase+"\",\n" +
                "      \"locationId\": \""+location+"\",\n" +
                "      \"eventDate\": \"2019-12-09T00:00:00.000Z\",\n" +
                "      \"eventType\": \"Birth Registration\",\n" +
                "      \"formSubmissionId\": \""+form+"\",\n" +
                "      \"providerId\": \""+provider+"\",\n" +
                "      \"duration\": 0,\n" +
                "      \"obs\": [\n" +
                "        {\n" +
                "          \"fieldType\": \"formsubmissionField\",\n" +
                "          \"fieldDataType\": \"text\",\n" +
                "          \"fieldCode\": \"isConsented\",\n" +
                "          \"parentCode\": \"\",\n" +
                "          \"values\": [\n" +
                "            \"true\"\n" +
                "          ],\n" +
                "          \"set\": [],\n" +
                "          \"formSubmissionField\": \"isConsented\",\n" +
                "          \"humanReadableValues\": []\n" +
                "        },\n" +
                "        {\n" +
                "          \"fieldType\": \"concept\",\n" +
                "          \"fieldDataType\": \"text\",\n" +
                "          \"fieldCode\": \"5916AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                "          \"parentCode\": \"\",\n" +
                "          \"values\": [\n" +
                "            \"3.6\"\n" +
                "          ],\n" +
                "          \"set\": [],\n" +
                "          \"formSubmissionField\": \"Birth_Weight\",\n" +
                "          \"humanReadableValues\": []\n" +
                "        },\n" +
                "        {\n" +
                "          \"fieldType\": \"concept\",\n" +
                "          \"fieldDataType\": \"text\",\n" +
                "          \"fieldCode\": \"164826AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                "          \"parentCode\": \"\",\n" +
                "          \"values\": [\n" +
                "            \"1065AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"\n" +
                "          ],\n" +
                "          \"set\": [],\n" +
                "          \"formSubmissionField\": \"Birth_Tetanus_Protection\",\n" +
                "          \"humanReadableValues\": [\n" +
                "            \"Yes\"\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"fieldType\": \"formsubmissionField\",\n" +
                "          \"fieldDataType\": \"text\",\n" +
                "          \"fieldCode\": \"Home_Facility\",\n" +
                "          \"parentCode\": \"\",\n" +
                "          \"values\": [\n" +
                "            \"b1b8c8dd-55fe-4ad3-aa73-740ae3114cd5\"\n" +
                "          ],\n" +
                "          \"set\": [],\n" +
                "          \"formSubmissionField\": \"Home_Facility\",\n" +
                "          \"humanReadableValues\": []\n" +
                "        },\n" +
                "        {\n" +
                "          \"fieldType\": \"concept\",\n" +
                "          \"fieldDataType\": \"text\",\n" +
                "          \"fieldCode\": \"159635AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                "          \"parentCode\": \"\",\n" +
                "          \"values\": [\n" +
                "            \"69854785\"\n" +
                "          ],\n" +
                "          \"set\": [],\n" +
                "          \"formSubmissionField\": \"Mother_Guardian_Phone_Number\",\n" +
                "          \"humanReadableValues\": []\n" +
                "        },\n" +
                "        {\n" +
                "          \"fieldType\": \"formsubmissionField\",\n" +
                "          \"fieldDataType\": \"text\",\n" +
                "          \"fieldCode\": \"last_interacted_with\",\n" +
                "          \"parentCode\": \"\",\n" +
                "          \"values\": [\n" +
                "            \"1575923858647\"\n" +
                "          ],\n" +
                "          \"set\": [],\n" +
                "          \"formSubmissionField\": \"last_interacted_with\",\n" +
                "          \"humanReadableValues\": []\n" +
                "        },\n" +
                "        {\n" +
                "          \"fieldType\": \"concept\",\n" +
                "          \"fieldDataType\": \"start\",\n" +
                "          \"fieldCode\": \"163137AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                "          \"parentCode\": \"\",\n" +
                "          \"values\": [\n" +
                "            \"2019-12-09 15:36:28\"\n" +
                "          ],\n" +
                "          \"set\": [],\n" +
                "          \"formSubmissionField\": \"start\",\n" +
                "          \"humanReadableValues\": []\n" +
                "        },\n" +
                "        {\n" +
                "          \"fieldType\": \"concept\",\n" +
                "          \"fieldDataType\": \"end\",\n" +
                "          \"fieldCode\": \"163138AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                "          \"parentCode\": \"\",\n" +
                "          \"values\": [\n" +
                "            \"2019-12-09 15:37:38\"\n" +
                "          ],\n" +
                "          \"set\": [],\n" +
                "          \"formSubmissionField\": \"end\",\n" +
                "          \"humanReadableValues\": []\n" +
                "        },\n" +
                "        {\n" +
                "          \"fieldType\": \"concept\",\n" +
                "          \"fieldDataType\": \"deviceid\",\n" +
                "          \"fieldCode\": \"163149AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\",\n" +
                "          \"parentCode\": \"\",\n" +
                "          \"values\": [\n" +
                "            \"89fb8b070bbd5ce6\"\n" +
                "          ],\n" +
                "          \"set\": [],\n" +
                "          \"formSubmissionField\": \"deviceid\",\n" +
                "          \"humanReadableValues\": []\n" +
                "        }\n" +
                "      ],\n" +
                "      \"entityType\": \"child\",\n" +
                "      \"version\": 1575923858656,\n" +
                "      \"teamId\": \""+teamId+"\",\n" +
                "      \"team\": \""+teamName+"\",\n" +
                "      \"dateCreated\": \"2019-12-09T20:40:07.033Z\",\n" +
                "      \"serverVersion\": 1575924007025,\n" +
                "      \"clientApplicationVersion\": 11,\n" +
                "      \"clientDatabaseVersion\": 11,\n" +
                "      \"type\": \"Event\",\n" +
                "      \"id\": \""+eventId+"\",\n" +
                "      \"revision\": \"v1\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}
