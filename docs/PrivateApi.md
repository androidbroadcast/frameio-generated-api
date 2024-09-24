# PrivateApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getGroupedNotifications**](PrivateApi.md#getGroupedNotifications) | **GET** /v2/notifications | Get Grouped Notifications |
| [**getSubtitles**](PrivateApi.md#getSubtitles) | **GET** /v2/assets/{asset_id}/subtitles | Get the subtitles for an Asset |


<a id="getGroupedNotifications"></a>
# **getGroupedNotifications**
> GetGroupedNotifications200Response getGroupedNotifications()

Get Grouped Notifications



### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = PrivateApi()
try {
    val result : GetGroupedNotifications200Response = apiInstance.getGroupedNotifications()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PrivateApi#getGroupedNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PrivateApi#getGroupedNotifications")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetGroupedNotifications200Response**](GetGroupedNotifications200Response.md)

### Authorization


Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSubtitles"></a>
# **getSubtitles**
> AssetSubtitle getSubtitles(assetId)

Get the subtitles for an Asset

Fetch subtitles that have been hoisted out by the media pipeline

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = PrivateApi()
val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
try {
    val result : AssetSubtitle = apiInstance.getSubtitles(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PrivateApi#getSubtitles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PrivateApi#getSubtitles")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetId** | **kotlin.String**|  | |

### Return type

[**AssetSubtitle**](AssetSubtitle.md)

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

