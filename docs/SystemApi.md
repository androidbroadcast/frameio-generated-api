# SystemApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**healthCheck**](SystemApi.md#healthCheck) | **GET** /health | Status check |


<a id="healthCheck"></a>
# **healthCheck**
> HealthCheck200Response healthCheck()

Status check

Check status of the Frame.io API

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = SystemApi()
try {
    val result : HealthCheck200Response = apiInstance.healthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#healthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#healthCheck")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthCheck200Response**](HealthCheck200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

