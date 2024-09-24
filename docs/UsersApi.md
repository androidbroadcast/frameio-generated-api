# UsersApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getMe**](UsersApi.md#getMe) | **GET** /v2/me | Get the current authenticated User |
| [**getSharedProjects**](UsersApi.md#getSharedProjects) | **GET** /v2/projects/shared | Get Projects where User is a Collaborator |


<a id="getMe"></a>
# **getMe**
> User getMe()

Get the current authenticated User

Get information about the currently authenticated user

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = UsersApi()
try {
    val result : User = apiInstance.getMe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getMe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization


Configure C2COAuth2:
    ApiClient.accessToken = ""
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

<a id="getSharedProjects"></a>
# **getSharedProjects**
> kotlin.collections.List&lt;Project&gt; getSharedProjects(filterAccountId, filterArchived, filterName, page, pageSize)

Get Projects where User is a Collaborator

Fetch all of the Projects that a User has Collaborator access to (not team-member)

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = UsersApi()
val filterAccountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter projects to those belonging to the specified account
val filterArchived : kotlin.Boolean = true // kotlin.Boolean | Filter projects by archival status
val filterName : kotlin.String = filterName_example // kotlin.String | Filter projects by name
val page : kotlin.Double = 8.14 // kotlin.Double | The current page number in this Paginated Response
val pageSize : kotlin.Double = 8.14 // kotlin.Double | Number of pages in this Paginated Response
try {
    val result : kotlin.collections.List<Project> = apiInstance.getSharedProjects(filterAccountId, filterArchived, filterName, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getSharedProjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getSharedProjects")
    e.printStackTrace()
}
```

### Parameters
| **filterAccountId** | **kotlin.String**| Filter projects to those belonging to the specified account | [optional] |
| **filterArchived** | **kotlin.Boolean**| Filter projects by archival status | [optional] [default to false] |
| **filterName** | **kotlin.String**| Filter projects by name | [optional] |
| **page** | **kotlin.Double**| The current page number in this Paginated Response | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Double**| Number of pages in this Paginated Response | [optional] |

### Return type

[**kotlin.collections.List&lt;Project&gt;**](Project.md)

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

