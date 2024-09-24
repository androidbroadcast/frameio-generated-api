# PresentationsApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPresentation**](PresentationsApi.md#createPresentation) | **POST** /v2/assets/{asset_id}/presentations | Create a Presentation Link for an asset |
| [**deletePresentation**](PresentationsApi.md#deletePresentation) | **DELETE** /v2/presentations/{presentation_id} | Delete a Presentation |
| [**getAssetPresentations**](PresentationsApi.md#getAssetPresentations) | **GET** /v2/assets/{asset_id}/presentations | Get Presentation Links for a particular asset |
| [**getProjectPresentations**](PresentationsApi.md#getProjectPresentations) | **GET** /v2/projects/{project_id}/presentations | Get a paginated list of Presentations |
| [**getUserPresentations**](PresentationsApi.md#getUserPresentations) | **GET** /v2/presentations | Get global presentation links |
| [**showPresentation**](PresentationsApi.md#showPresentation) | **GET** /v2/presentations/{presentation_id} | Show a Presentation |
| [**updatePresentation**](PresentationsApi.md#updatePresentation) | **PUT** /v2/presentations/{presentation_id} | Update a Presentation |


<a id="createPresentation"></a>
# **createPresentation**
> Presentation createPresentation(assetId, createPresentationRequest)

Create a Presentation Link for an asset

Create a new Presentation Link

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = PresentationsApi()
val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
val createPresentationRequest : CreatePresentationRequest =  // CreatePresentationRequest | Presentation to create
try {
    val result : Presentation = apiInstance.createPresentation(assetId, createPresentationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PresentationsApi#createPresentation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PresentationsApi#createPresentation")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **kotlin.String**| Asset ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createPresentationRequest** | [**CreatePresentationRequest**](CreatePresentationRequest.md)| Presentation to create | [optional] |

### Return type

[**Presentation**](Presentation.md)

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

<a id="deletePresentation"></a>
# **deletePresentation**
> Presentation deletePresentation(presentationId)

Delete a Presentation

Delete a given Presentation Link

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = PresentationsApi()
val presentationId : kotlin.String = presentationId_example // kotlin.String | Presentation Link ID
try {
    val result : Presentation = apiInstance.deletePresentation(presentationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PresentationsApi#deletePresentation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PresentationsApi#deletePresentation")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **presentationId** | **kotlin.String**| Presentation Link ID | |

### Return type

[**Presentation**](Presentation.md)

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

<a id="getAssetPresentations"></a>
# **getAssetPresentations**
> kotlin.collections.List&lt;Presentation&gt; getAssetPresentations(assetId)

Get Presentation Links for a particular asset

Get a paginated list of Presentation Links attached to a particular asset ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = PresentationsApi()
val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
try {
    val result : kotlin.collections.List<Presentation> = apiInstance.getAssetPresentations(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PresentationsApi#getAssetPresentations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PresentationsApi#getAssetPresentations")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetId** | **kotlin.String**| Asset ID | |

### Return type

[**kotlin.collections.List&lt;Presentation&gt;**](Presentation.md)

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

<a id="getProjectPresentations"></a>
# **getProjectPresentations**
> kotlin.collections.List&lt;Presentation&gt; getProjectPresentations(projectId)

Get a paginated list of Presentations

Get a paginated list of Presentations

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = PresentationsApi()
val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
try {
    val result : kotlin.collections.List<Presentation> = apiInstance.getProjectPresentations(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PresentationsApi#getProjectPresentations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PresentationsApi#getProjectPresentations")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectId** | **kotlin.String**| Project ID | |

### Return type

[**kotlin.collections.List&lt;Presentation&gt;**](Presentation.md)

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

<a id="getUserPresentations"></a>
# **getUserPresentations**
> kotlin.collections.List&lt;Presentation&gt; getUserPresentations()

Get global presentation links

Get recently created Presentation Links across a user&#39;s account

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = PresentationsApi()
try {
    val result : kotlin.collections.List<Presentation> = apiInstance.getUserPresentations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PresentationsApi#getUserPresentations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PresentationsApi#getUserPresentations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Presentation&gt;**](Presentation.md)

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

<a id="showPresentation"></a>
# **showPresentation**
> Presentation showPresentation(presentationId)

Show a Presentation

Fetch a particular presentaiton link&#39;s id

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = PresentationsApi()
val presentationId : kotlin.String = presentationId_example // kotlin.String | Presentation Link ID
try {
    val result : Presentation = apiInstance.showPresentation(presentationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PresentationsApi#showPresentation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PresentationsApi#showPresentation")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **presentationId** | **kotlin.String**| Presentation Link ID | |

### Return type

[**Presentation**](Presentation.md)

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

<a id="updatePresentation"></a>
# **updatePresentation**
> Presentation updatePresentation(presentationId, updatePresentationRequest)

Update a Presentation

Update a Presentation Link via it&#39;s ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = PresentationsApi()
val presentationId : kotlin.String = presentationId_example // kotlin.String | Presentation Link ID
val updatePresentationRequest : UpdatePresentationRequest =  // UpdatePresentationRequest | Presentation to update
try {
    val result : Presentation = apiInstance.updatePresentation(presentationId, updatePresentationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PresentationsApi#updatePresentation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PresentationsApi#updatePresentation")
    e.printStackTrace()
}
```

### Parameters
| **presentationId** | **kotlin.String**| Presentation Link ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updatePresentationRequest** | [**UpdatePresentationRequest**](UpdatePresentationRequest.md)| Presentation to update | [optional] |

### Return type

[**Presentation**](Presentation.md)

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

