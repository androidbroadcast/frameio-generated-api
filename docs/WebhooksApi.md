# WebhooksApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWebhookForTeam**](WebhooksApi.md#createWebhookForTeam) | **POST** /v2/teams/{team_id}/hooks | Create team webhook |
| [**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /v2/hooks/{hook_id} | Delete webhook |
| [**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /v2/hooks/{hook_id} | Get Webhook by ID |
| [**getWebhooksByAccount**](WebhooksApi.md#getWebhooksByAccount) | **GET** /v2/accounts/{account_id}/hooks | Get Webhooks for Account |
| [**updateWebhook**](WebhooksApi.md#updateWebhook) | **PUT** /v2/hooks/{hook_id} | Update webhook |


<a id="createWebhookForTeam"></a>
# **createWebhookForTeam**
> Webhook createWebhookForTeam(teamId, createWebhookForTeamRequest)

Create team webhook

Create an outbound Webhook for all appropriate actions for a given Team

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = WebhooksApi()
val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val createWebhookForTeamRequest : CreateWebhookForTeamRequest =  // CreateWebhookForTeamRequest | Webhook to create or update
try {
    val result : Webhook = apiInstance.createWebhookForTeam(teamId, createWebhookForTeamRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#createWebhookForTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#createWebhookForTeam")
    e.printStackTrace()
}
```

### Parameters
| **teamId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createWebhookForTeamRequest** | [**CreateWebhookForTeamRequest**](CreateWebhookForTeamRequest.md)| Webhook to create or update | [optional] |

### Return type

[**Webhook**](Webhook.md)

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

<a id="deleteWebhook"></a>
# **deleteWebhook**
> Webhook deleteWebhook(hookId)

Delete webhook

Delete a given Webhook via its ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = WebhooksApi()
val hookId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Webhook ID
try {
    val result : Webhook = apiInstance.deleteWebhook(hookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#deleteWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#deleteWebhook")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hookId** | **kotlin.String**| Webhook ID | |

### Return type

[**Webhook**](Webhook.md)

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

<a id="getWebhook"></a>
# **getWebhook**
> Webhook getWebhook(hookId)

Get Webhook by ID

Get the information about a given Webhook

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = WebhooksApi()
val hookId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Webhook ID
try {
    val result : Webhook = apiInstance.getWebhook(hookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhook")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hookId** | **kotlin.String**| Webhook ID | |

### Return type

[**Webhook**](Webhook.md)

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

<a id="getWebhooksByAccount"></a>
# **getWebhooksByAccount**
> kotlin.collections.List&lt;Webhook&gt; getWebhooksByAccount(accountId)

Get Webhooks for Account

Get Webhooks belonging to a given Account

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = WebhooksApi()
val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Account ID
try {
    val result : kotlin.collections.List<Webhook> = apiInstance.getWebhooksByAccount(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhooksByAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhooksByAccount")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.String**| Account ID | |

### Return type

[**kotlin.collections.List&lt;Webhook&gt;**](Webhook.md)

### Authorization


Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateWebhook"></a>
# **updateWebhook**
> Webhook updateWebhook(hookId, createWebhookForTeamRequest)

Update webhook

Update the settings for a given Webhook via its ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = WebhooksApi()
val hookId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Webhook ID
val createWebhookForTeamRequest : CreateWebhookForTeamRequest =  // CreateWebhookForTeamRequest | Webhook to create or update
try {
    val result : Webhook = apiInstance.updateWebhook(hookId, createWebhookForTeamRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#updateWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#updateWebhook")
    e.printStackTrace()
}
```

### Parameters
| **hookId** | **kotlin.String**| Webhook ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createWebhookForTeamRequest** | [**CreateWebhookForTeamRequest**](CreateWebhookForTeamRequest.md)| Webhook to create or update | [optional] |

### Return type

[**Webhook**](Webhook.md)

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

