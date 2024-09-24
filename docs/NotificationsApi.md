# NotificationsApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getGroupedNotifications**](NotificationsApi.md#getGroupedNotifications) | **GET** /v2/notifications | Get Grouped Notifications |


<a id="getGroupedNotifications"></a>
# **getGroupedNotifications**
> GetGroupedNotifications200Response getGroupedNotifications()

Get Grouped Notifications



### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = NotificationsApi()
try {
    val result : GetGroupedNotifications200Response = apiInstance.getGroupedNotifications()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#getGroupedNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#getGroupedNotifications")
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

