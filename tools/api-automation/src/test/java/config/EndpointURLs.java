
package config;


public class EndpointURLs {

public static String GET_AUTHNETICATION = "/security/authenticate";
public static String SYNC_BY_LOCATION= "/rest/event/sync?locationId=%s&serverVersion=0&limit=250";
public static String SYNC_BY_PROVIDER= "/rest/event/sync?providerId=%s&serverVersion=0&limit=250";
public static String SYNC_BY_TEAM ="/rest/event/sync?team=%s&serverVersion=0&limit=250";
public static String GET_UNIQUE_ID_REQ ="/uniqueids/get?source=1&numberToGenerate=5";
public static String SEARCH_CLIENT_BY_PATH="/rest/search/path?first_name=a&last_name=am";
public static String SEARCH_CLIENT_II ="/rest/search/search?lastName=admin";
public static String FETCH_CLIENT_BY_ID = "/rest/client/1000001V";
public static String SEARCH_CLIENT_BY_GENDER = "/rest/client/search?gender=female";
public static String SYNC_VIEW_CONFIGURATION = "/rest/viewconfiguration/sync?serverVersion=0";
public static String SEARCH_CLIENT_BY_BIRTHDAY ="/rest/client/search?birthdate=2017-12-16:2019-12-19";
public static String GET_ALL_USERS= "/rest/user?page_size=10&start_index=0&source=Keycloak";
public static String SEARCH_CLIENT_BY_NAME = "/rest/client/search?name=web";
public static String SYNC_SERVERSIDE_SETTING = "/rest/settings/sync?serverVersion=0";
public static String GET_ALL_EVENTS= "/rest/event/getAll?serverVersion=0&limit=10";
public static String GET_ALL_STOCK= "/rest/stockresource/getall?serverVersion=0&limit=10";
public static String GET_ALL_STOCK_BY_ID= "/rest/stockresource/xxxx";
public static String SEARCH_EVENT_BY_TEAM= "/rest/event/search?team=%s";
public static String SEARCH_EVENT_BY_TEAM_ID= "/rest/event/search?teamId=%s";
public static String SEARCH_EVENT_BY_LOCATION_ID ="/rest/event/search?locationId=%s";
public static String SEARCH_EVENT_BY_PROVIDER_ID ="/rest/event/search?providerId=%s";
public static String SEARCH_EVENT_BY_ENTITY_TYPE ="/rest/event/search?entityType=child";
public static String SEARCH_EVENT_ID_BY_EVENT_TYPE ="/rest/event/findIdsByEventType?eventType=Birth Registration&serverVersion=0";
public static String SEARCH_EVENT_BY_ID ="/rest/event/%s";
public static String GET_PROVIDER_ACTION ="/actions?anmIdentifier=%s&timeStamp=1553817603433";
public static String POST_EVENT ="/rest/event/add/";
public static String POST_CLIENT ="/rest/client/add/";
}
