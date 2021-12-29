package payloads;

public class Events {
    public static String addEvent()
    {
        return "{\n" +
                "  \"clients\": [\n" +
                "    {\n" +
                "      \"firstName\": \"Postman\",\n" +
                "      \"lastName\": \"Pentest\",\n" +
                "      \"birthdateApprox\": false,\n" +
                "      \"deathdateApprox\": false,\n" +
                "      \"gender\": \"female\",\n" +
                "      \"baseEntityId\": \"test-c632-41b6-b855-eda8db7d79e6\",\n" +
                "      \"identifiers\": {\n" +
                "        \"M_ZEIR_ID\": \"1001202L_mother\"\n" +
                "      },\n" +
                "      \"addresses\": [\n" +
                "        {\n" +
                "          \"addressType\": \"usual_residence\",\n" +
                "          \"addressFields\": {\n" +
                "            \"address2\": \"Nouakchott\",\n" +
                "            \"address3\": \"b1b8c8dd-55fe-4ad3-aa73-740ae3114cd5\"\n" +
                "          }\n" +
                "        }\n" +
                "      ],\n" +
                "      \"attributes\": {},\n" +
                "      \"dateCreated\": \"2019-12-12T16:32:55.557Z\",\n" +
                "      \"serverVersion\": 1576168375509,\n" +
                "      \"type\": \"Client\",\n" +
                "      \"id\": \"test-d5d4-452d-9662-8881d92995d9\",\n" +
                "      \"revision\": \"v1\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"no_of_events\": 1,\n" +
                "  \"events\": [\n" +
                "    {\n" +
                "      \"identifiers\": {},\n" +
                "      \"baseEntityId\": \"test-c632-41b6-b855-eda8db7d79e6\",\n" +
                "      \"locationId\": \"b1b8c8dd-55fe-4ad3-aa73-740ae3114cd5\",\n" +
                "      \"eventDate\": \"2019-12-09T00:00:00.000Z\",\n" +
                "      \"eventType\": \"Birth Registration\",\n" +
                "      \"formSubmissionId\": \"c88c9557-7d60-4eb3-b857-10968e552a9e\",\n" +
                "      \"providerId\": \"ptclinician1\",\n" +
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
                "      \"teamId\": \"567a6dbf-90c1-4a52-a19a-ff1e02072341\",\n" +
                "      \"team\": \"PTClinic1\",\n" +
                "      \"dateCreated\": \"2019-12-09T20:40:07.033Z\",\n" +
                "      \"serverVersion\": 1575924007025,\n" +
                "      \"clientApplicationVersion\": 11,\n" +
                "      \"clientDatabaseVersion\": 11,\n" +
                "      \"type\": \"Event\",\n" +
                "      \"id\": \"test-e005-4dd6-8a94-68e0bfd12876\",\n" +
                "      \"revision\": \"v1\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}