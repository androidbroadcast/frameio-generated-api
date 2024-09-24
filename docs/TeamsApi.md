# TeamsApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addTeamMember**](TeamsApi.md#addTeamMember) | **POST** /v2/teams/{team_id}/members | Add a Team member |
| [**createTeam**](TeamsApi.md#createTeam) | **POST** /v2/accounts/{account_id}/teams | Create a Team for the given Account |
| [**getMembershipByTeam**](TeamsApi.md#getMembershipByTeam) | **GET** /v2/teams/{team_id}/membership | Get user membership for team |
| [**getTeam**](TeamsApi.md#getTeam) | **GET** /v2/teams/{team_id} | Get a Team |
| [**getTeamMembers**](TeamsApi.md#getTeamMembers) | **GET** /v2/teams/{team_id}/members | Get Team Members |
| [**getTeams**](TeamsApi.md#getTeams) | **GET** /v2/teams | Get Teams for User |
| [**getTeamsByAccount**](TeamsApi.md#getTeamsByAccount) | **GET** /v2/accounts/{account_id}/teams | Get all Teams on an Account |


<a id="addTeamMember"></a>
# **addTeamMember**
> AddTeamMember200Response addTeamMember(teamId, addTeamMemberRequest)

Add a Team member

Add a Team member to a given Team

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
val addTeamMemberRequest : AddTeamMemberRequest =  // AddTeamMemberRequest | Team member to create or update
try {
    val result : AddTeamMember200Response = apiInstance.addTeamMember(teamId, addTeamMemberRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#addTeamMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#addTeamMember")
    e.printStackTrace()
}
```

### Parameters
| **teamId** | **kotlin.String**| Team ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addTeamMemberRequest** | [**AddTeamMemberRequest**](AddTeamMemberRequest.md)| Team member to create or update | [optional] |

### Return type

[**AddTeamMember200Response**](AddTeamMember200Response.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTeam"></a>
# **createTeam**
> Team createTeam(accountId, createTeamRequest)

Create a Team for the given Account

Create a new Team inside the given Account.   _Limited to Pro and Enterprise plans_

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = TeamsApi()
val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Account ID
val createTeamRequest : CreateTeamRequest =  // CreateTeamRequest | Team create or update request
try {
    val result : Team = apiInstance.createTeam(accountId, createTeamRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#createTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#createTeam")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **kotlin.String**| Account ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTeamRequest** | [**CreateTeamRequest**](CreateTeamRequest.md)| Team create or update request | [optional] |

### Return type

[**Team**](Team.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMembershipByTeam"></a>
# **getMembershipByTeam**
> GetMembershipByTeam200Response getMembershipByTeam(teamId)

Get user membership for team

Get currently authed User&#39;s membership within a particular Team

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
try {
    val result : GetMembershipByTeam200Response = apiInstance.getMembershipByTeam(teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#getMembershipByTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#getMembershipByTeam")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **teamId** | **kotlin.String**| Team ID | |

### Return type

[**GetMembershipByTeam200Response**](GetMembershipByTeam200Response.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTeam"></a>
# **getTeam**
> Team getTeam(teamId, include)

Get a Team

Fetch a given Team&#39;s information by ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
val include : kotlin.String = include_example // kotlin.String | 
try {
    val result : Team = apiInstance.getTeam(teamId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#getTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#getTeam")
    e.printStackTrace()
}
```

### Parameters
| **teamId** | **kotlin.String**| Team ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | **kotlin.String**|  | [optional] [enum: account, user_role] |

### Return type

[**Team**](Team.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTeamMembers"></a>
# **getTeamMembers**
> Team getTeamMembers(teamId)

Get Team Members

List the members on a given Team

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
try {
    val result : Team = apiInstance.getTeamMembers(teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#getTeamMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#getTeamMembers")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **teamId** | **kotlin.String**| Team ID | |

### Return type

[**Team**](Team.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTeams"></a>
# **getTeams**
> kotlin.collections.List&lt;Team&gt; getTeams()

Get Teams for User

Return an array of all the Teams a user has access to

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = TeamsApi()
try {
    val result : kotlin.collections.List<Team> = apiInstance.getTeams()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#getTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#getTeams")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTeamsByAccount"></a>
# **getTeamsByAccount**
> kotlin.collections.List&lt;Team&gt; getTeamsByAccount(accountId, include)

Get all Teams on an Account

Return an array of all of the Teams accessible via a given Account

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = TeamsApi()
val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Account ID
val include : kotlin.String = include_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Team> = apiInstance.getTeamsByAccount(accountId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#getTeamsByAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#getTeamsByAccount")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **kotlin.String**| Account ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | **kotlin.String**|  | [optional] [enum: user_role] |

### Return type

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

