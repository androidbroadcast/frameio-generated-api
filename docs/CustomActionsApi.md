# CustomActionsApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createActionForTeam**](CustomActionsApi.md#createActionForTeam) | **POST** /v2/teams/{team_id}/actions | Create a Custom Action |
| [**deleteAction**](CustomActionsApi.md#deleteAction) | **DELETE** /v2/actions/{action_id} | Delete a Custom Action |
| [**getAction**](CustomActionsApi.md#getAction) | **GET** /v2/actions/{action_id} | Get a Custom Action by ID |
| [**getActionsByAccount**](CustomActionsApi.md#getActionsByAccount) | **GET** /v2/accounts/{account_id}/actions | Get Custom Actions for an Account or Team |
| [**getActionsByTeam**](CustomActionsApi.md#getActionsByTeam) | **GET** /v2/teams/{team_id}/actions | Get Custom Actions for a given Team |
| [**updateAction**](CustomActionsApi.md#updateAction) | **PUT** /v2/actions/{action_id} | Update a Custom Action |


<a id="createActionForTeam"></a>
# **createActionForTeam**
> Action createActionForTeam(teamId, createActionForTeamRequest)

Create a Custom Action

Create a Custom Action belonging to A Team

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CustomActionsApi()
val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
val createActionForTeamRequest : CreateActionForTeamRequest =  // CreateActionForTeamRequest | Action to create or update
try {
    val result : Action = apiInstance.createActionForTeam(teamId, createActionForTeamRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomActionsApi#createActionForTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomActionsApi#createActionForTeam")
    e.printStackTrace()
}
```

### Parameters
| **teamId** | **kotlin.String**| Team ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createActionForTeamRequest** | [**CreateActionForTeamRequest**](CreateActionForTeamRequest.md)| Action to create or update | [optional] |

### Return type

[**Action**](Action.md)

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

<a id="deleteAction"></a>
# **deleteAction**
> Action deleteAction(actionId)

Delete a Custom Action

Delete a given Custom Action via its ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CustomActionsApi()
val actionId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Custom Action ID
try {
    val result : Action = apiInstance.deleteAction(actionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomActionsApi#deleteAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomActionsApi#deleteAction")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **kotlin.String**| Custom Action ID | |

### Return type

[**Action**](Action.md)

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

<a id="getAction"></a>
# **getAction**
> Action getAction(actionId)

Get a Custom Action by ID

Get a Custom Action via its ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CustomActionsApi()
val actionId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Custom Action ID
try {
    val result : Action = apiInstance.getAction(actionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomActionsApi#getAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomActionsApi#getAction")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **kotlin.String**| Custom Action ID | |

### Return type

[**Action**](Action.md)

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

<a id="getActionsByAccount"></a>
# **getActionsByAccount**
> kotlin.collections.List&lt;Action&gt; getActionsByAccount(accountId, include)

Get Custom Actions for an Account or Team

Get Custom Actions available to a given Account

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CustomActionsApi()
val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Account ID
val include : kotlin.String = include_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Action> = apiInstance.getActionsByAccount(accountId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomActionsApi#getActionsByAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomActionsApi#getActionsByAccount")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **kotlin.String**| Account ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;Action&gt;**](Action.md)

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

<a id="getActionsByTeam"></a>
# **getActionsByTeam**
> kotlin.collections.List&lt;Action&gt; getActionsByTeam(teamId, include)

Get Custom Actions for a given Team

Fetch Custom Actions belonging to a given Team

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CustomActionsApi()
val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
val include : kotlin.String = include_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Action> = apiInstance.getActionsByTeam(teamId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomActionsApi#getActionsByTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomActionsApi#getActionsByTeam")
    e.printStackTrace()
}
```

### Parameters
| **teamId** | **kotlin.String**| Team ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;Action&gt;**](Action.md)

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

<a id="updateAction"></a>
# **updateAction**
> Action updateAction(actionId, createActionForTeamRequest)

Update a Custom Action

Update a given Custom Action via its ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CustomActionsApi()
val actionId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Custom Action ID
val createActionForTeamRequest : CreateActionForTeamRequest =  // CreateActionForTeamRequest | Action to create or update
try {
    val result : Action = apiInstance.updateAction(actionId, createActionForTeamRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomActionsApi#updateAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomActionsApi#updateAction")
    e.printStackTrace()
}
```

### Parameters
| **actionId** | **kotlin.String**| Custom Action ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createActionForTeamRequest** | [**CreateActionForTeamRequest**](CreateActionForTeamRequest.md)| Action to create or update | [optional] |

### Return type

[**Action**](Action.md)

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

