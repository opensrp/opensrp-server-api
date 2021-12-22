
package config;


public class EndpointURLs {

public static String GET_AUTHNETICATION = "/security/authenticate";
public static String SYNC_BY_LOCATION= "/rest/event/sync?locationId=b652b2f4-a95d-489b-9e28-4629746db96a&serverVersion=0&limit=250";
public static String SYNC_BY_PROVIDER= "/rest/event/sync?providerId=ptclinician1&serverVersion=0&limit=250";
public static String SYNC_BY_TEAM ="/rest/event/sync?team=PTClinic1&serverVersion=0&limit=250";
public static String GET_UNIQUE_ID_REQ ="/uniqueids/get?source=1&numberToGenerate=5";
public static String SEARCH_CLIENT_BY_PATH="/rest/search/path?first_name=a&last_name=am";
public static String SEARCH_CLIENT_II ="/rest/search/search?lastName=Bashir";
public static String FETCH_CLIENT_BY_ID = "/rest/client/1000001V";
public static String SEARCH_CLIENT_BY_GENDER = "/rest/client/search?gender=Male";
public static String SYNC_VIEW_CONFIGURATION = "/rest/viewconfiguration/sync?serverVersion=0";


}