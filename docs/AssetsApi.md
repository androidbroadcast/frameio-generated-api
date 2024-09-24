# AssetsApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addVersionToAsset**](AssetsApi.md#addVersionToAsset) | **POST** /v2/assets/{asset_id}/version | Version an Asset |
| [**assetSearchGet**](AssetsApi.md#assetSearchGet) | **GET** /v2/search/assets | Search for Assets |
| [**assetSearchPost**](AssetsApi.md#assetSearchPost) | **POST** /v2/search/assets | Search for Assets |
| [**batchCopyAsset**](AssetsApi.md#batchCopyAsset) | **POST** /v2/batch/assets/{destination_id}/copy | Bulk copy assets |
| [**batchDeleteAsset**](AssetsApi.md#batchDeleteAsset) | **DELETE** /v2/batch/assets | Bulk delete assets |
| [**copyAsset**](AssetsApi.md#copyAsset) | **POST** /v2/assets/{destination_folder}/copy | Copy asset |
| [**createAsset**](AssetsApi.md#createAsset) | **POST** /v2/assets/{asset_id}/children | Create an Asset |
| [**createRealtimeUploadParts**](AssetsApi.md#createRealtimeUploadParts) | **POST** /v2/assets/{asset_id}/realtime_upload/parts | Request upload URLs for real-time upload |
| [**deleteAsset**](AssetsApi.md#deleteAsset) | **DELETE** /v2/assets/{asset_id} | Delete an Asset |
| [**deviceAssetCreate**](AssetsApi.md#deviceAssetCreate) | **POST** /v2/devices/assets | Create C2C asset |
| [**deviceAssetCreateDeprecated**](AssetsApi.md#deviceAssetCreateDeprecated) | **POST** /v2/assets | Create C2C asset |
| [**getAsset**](AssetsApi.md#getAsset) | **GET** /v2/assets/{asset_id} | Get an Asset |
| [**getAssets**](AssetsApi.md#getAssets) | **GET** /v2/assets/{asset_id}/children | Fetch child Assets |
| [**getAudio**](AssetsApi.md#getAudio) | **GET** /v2/assets/{asset_id}/audio | Get audio for an Asset |
| [**getSubtitles**](AssetsApi.md#getSubtitles) | **GET** /v2/assets/{asset_id}/subtitles | Get the subtitles for an Asset |
| [**librarySearchGet**](AssetsApi.md#librarySearchGet) | **GET** /v2/search/library | Advanced search for Assets |
| [**librarySearchPost**](AssetsApi.md#librarySearchPost) | **POST** /v2/search/library | Advanced search for Assets |
| [**moveAsset**](AssetsApi.md#moveAsset) | **POST** /v2/assets/{destination_folder}/move | Move asset |
| [**unversionAsset**](AssetsApi.md#unversionAsset) | **DELETE** /v2/assets/{asset_id}/unversion | Unversion an Asset |
| [**updateAsset**](AssetsApi.md#updateAsset) | **PUT** /v2/assets/{asset_id} | Update an Asset |


<a id="addVersionToAsset"></a>
# **addVersionToAsset**
> Asset addVersionToAsset(assetId, addVersionToAssetRequest)

Version an Asset

Add an asset to a version stack, or create one if one doesn&#39;t already exist

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val addVersionToAssetRequest : AddVersionToAssetRequest =  // AddVersionToAssetRequest | 
try {
    val result : Asset = apiInstance.addVersionToAsset(assetId, addVersionToAssetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#addVersionToAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#addVersionToAsset")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addVersionToAssetRequest** | [**AddVersionToAssetRequest**](AddVersionToAssetRequest.md)|  | [optional] |

### Return type

[**Asset**](Asset.md)

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

<a id="assetSearchGet"></a>
# **assetSearchGet**
> kotlin.collections.List&lt;Asset&gt; assetSearchGet(accountId, filter, include, includeDeleted, opts, page, pageSize, projectId, properties, q, query, sharedProjects, sort, teamId, type)

Search for Assets

Search for Assets via query parameters

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val filter : kotlin.String = Object // kotlin.String | Custom ES filters to apply to your query
val include : kotlin.String = include_example // kotlin.String | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Flag to include soft-deleted records in results
val opts : kotlin.String = Object // kotlin.String | Additional request options
val page : kotlin.Int = 56 // kotlin.Int | The page to retrieve
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of results to include in the page
val projectId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val properties : kotlin.String = Object // kotlin.String | 
val q : kotlin.String = q_example // kotlin.String | Search text
val query : kotlin.String = query_example // kotlin.String | Search text
val sharedProjects : kotlin.Boolean = true // kotlin.Boolean | 
val sort : kotlin.String = sort_example // kotlin.String | Sorting parameters
val teamId : AssetSearchGetTeamIdParameter =  // AssetSearchGetTeamIdParameter | 
val type : kotlin.String = type_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Asset> = apiInstance.assetSearchGet(accountId, filter, include, includeDeleted, opts, page, pageSize, projectId, properties, q, query, sharedProjects, sort, teamId, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetSearchGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetSearchGet")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **kotlin.String**|  | [optional] |
| **filter** | [**kotlin.String**](.md)| Custom ES filters to apply to your query | [optional] |
| **include** | **kotlin.String**|  | [optional] |
| **includeDeleted** | **kotlin.Boolean**| Flag to include soft-deleted records in results | [optional] |
| **opts** | [**kotlin.String**](.md)| Additional request options | [optional] |
| **page** | **kotlin.Int**| The page to retrieve | [optional] |
| **pageSize** | **kotlin.Int**| The number of results to include in the page | [optional] |
| **projectId** | **kotlin.String**|  | [optional] |
| **properties** | [**kotlin.String**](.md)|  | [optional] |
| **q** | **kotlin.String**| Search text | [optional] |
| **query** | **kotlin.String**| Search text | [optional] |
| **sharedProjects** | **kotlin.Boolean**|  | [optional] |
| **sort** | **kotlin.String**| Sorting parameters | [optional] |
| **teamId** | [**AssetSearchGetTeamIdParameter**](.md)|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;Asset&gt;**](Asset.md)

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

<a id="assetSearchPost"></a>
# **assetSearchPost**
> kotlin.collections.List&lt;Asset&gt; assetSearchPost(assetSearch)

Search for Assets

Search for Assets using a JSON payload

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val assetSearch : AssetSearch =  // AssetSearch | Asset search
try {
    val result : kotlin.collections.List<Asset> = apiInstance.assetSearchPost(assetSearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetSearchPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetSearch** | [**AssetSearch**](AssetSearch.md)| Asset search | [optional] |

### Return type

[**kotlin.collections.List&lt;Asset&gt;**](Asset.md)

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

<a id="batchCopyAsset"></a>
# **batchCopyAsset**
> BatchCopyAsset200Response batchCopyAsset(destinationId, batchCopyAssetRequest)

Bulk copy assets

Copy a batch of asset ids to a new folder. You can also choose to copy over all or none of the comments from the original to the copied asset.

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val destinationId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Destination folder `id` - must be in the same folder
val batchCopyAssetRequest : BatchCopyAssetRequest = {"batch":[{"id":1},{"id":2}],"copy_comments":"none"} // BatchCopyAssetRequest | An array of batch operations
try {
    val result : BatchCopyAsset200Response = apiInstance.batchCopyAsset(destinationId, batchCopyAssetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#batchCopyAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#batchCopyAsset")
    e.printStackTrace()
}
```

### Parameters
| **destinationId** | **kotlin.String**| Destination folder &#x60;id&#x60; - must be in the same folder | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchCopyAssetRequest** | [**BatchCopyAssetRequest**](BatchCopyAssetRequest.md)| An array of batch operations | [optional] |

### Return type

[**BatchCopyAsset200Response**](BatchCopyAsset200Response.md)

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

<a id="batchDeleteAsset"></a>
# **batchDeleteAsset**
> BatchCreateCollaborators200Response batchDeleteAsset(batchDeleteAssetRequest)

Bulk delete assets

Delete a list of Assets

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val batchDeleteAssetRequest : BatchDeleteAssetRequest =  // BatchDeleteAssetRequest | Delete a list of Assets by their ID's
try {
    val result : BatchCreateCollaborators200Response = apiInstance.batchDeleteAsset(batchDeleteAssetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#batchDeleteAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#batchDeleteAsset")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchDeleteAssetRequest** | [**BatchDeleteAssetRequest**](BatchDeleteAssetRequest.md)| Delete a list of Assets by their ID&#39;s | [optional] |

### Return type

[**BatchCreateCollaborators200Response**](BatchCreateCollaborators200Response.md)

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

<a id="copyAsset"></a>
# **copyAsset**
> Asset copyAsset(destinationFolder, copyAssetRequest)

Copy asset

Copy an Asset to a new location

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val destinationFolder : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Destination folder `id`
val copyAssetRequest : CopyAssetRequest =  // CopyAssetRequest | Asset copy request
try {
    val result : Asset = apiInstance.copyAsset(destinationFolder, copyAssetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#copyAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#copyAsset")
    e.printStackTrace()
}
```

### Parameters
| **destinationFolder** | **kotlin.String**| Destination folder &#x60;id&#x60; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **copyAssetRequest** | [**CopyAssetRequest**](CopyAssetRequest.md)| Asset copy request | [optional] |

### Return type

[**Asset**](Asset.md)

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

<a id="createAsset"></a>
# **createAsset**
> CreateAsset200Response createAsset(assetId, createAssetRequest)

Create an Asset

Create a new asset.

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
val createAssetRequest : CreateAssetRequest = {"name":"my_movie","type":"file","filetype":"video/mp4","auto_version_id":"4386e276-6317-4d8d-b82c-8a16df9b66d2","filesize":80000000} // CreateAssetRequest | While supported, we encourage you to switch from `application/x-ww-form-urlencoded` to `application/json` in order to support future workflows that will only be supported through JSON.  When `is_realtime_upload` is `true`, call must be made in `application/json`.
try {
    val result : CreateAsset200Response = apiInstance.createAsset(assetId, createAssetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#createAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#createAsset")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **kotlin.String**| Asset ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createAssetRequest** | [**CreateAssetRequest**](CreateAssetRequest.md)| While supported, we encourage you to switch from &#x60;application/x-ww-form-urlencoded&#x60; to &#x60;application/json&#x60; in order to support future workflows that will only be supported through JSON.  When &#x60;is_realtime_upload&#x60; is &#x60;true&#x60;, call must be made in &#x60;application/json&#x60;. | [optional] |

### Return type

[**CreateAsset200Response**](CreateAsset200Response.md)

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

<a id="createRealtimeUploadParts"></a>
# **createRealtimeUploadParts**
> CreateRealtimeUploadParts200Response createRealtimeUploadParts(assetId, createRealtimeUploadPartsRequest)

Request upload URLs for real-time upload

Register real-time upload parts and generate presigned AWS S3 upload PUT URLs.

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Asset ID
val createRealtimeUploadPartsRequest : CreateRealtimeUploadPartsRequest = {"parts":[{"number":1,"size":2000000000,"is_final":false},{"number":2,"size":1500000000,"is_final":false}]} // CreateRealtimeUploadPartsRequest | Enumerates parts that upload URLs should be created for.
try {
    val result : CreateRealtimeUploadParts200Response = apiInstance.createRealtimeUploadParts(assetId, createRealtimeUploadPartsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#createRealtimeUploadParts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#createRealtimeUploadParts")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **kotlin.String**| Asset ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createRealtimeUploadPartsRequest** | [**CreateRealtimeUploadPartsRequest**](CreateRealtimeUploadPartsRequest.md)| Enumerates parts that upload URLs should be created for. | [optional] |

### Return type

[**CreateRealtimeUploadParts200Response**](CreateRealtimeUploadParts200Response.md)

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

<a id="deleteAsset"></a>
# **deleteAsset**
> Asset deleteAsset(assetId)

Delete an Asset

Delete the referenced Asset ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
try {
    val result : Asset = apiInstance.deleteAsset(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#deleteAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#deleteAsset")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetId** | **kotlin.String**| Asset ID | |

### Return type

[**Asset**](Asset.md)

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

<a id="deviceAssetCreate"></a>
# **deviceAssetCreate**
> CreateAsset200Response deviceAssetCreate(xClientVersion, deviceAssetCreateDeprecatedRequest)

Create C2C asset

Asset upload initiation specifically for C2C devices and applications.  Note: This endpoint used to be &#x60;/v2/assets&#x60;, and while that endpoint will continue to function as normal, we suggest you use this one instead.

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val xClientVersion : kotlin.String = 2.16.4 // kotlin.String | Firmware or software version of a C2C integration. Will be used to determine the correct Device Model configuration for the device when multiple are available. Must be a valid semantic version.    For more on semantic versions, see here: https://semver.org/
val deviceAssetCreateDeprecatedRequest : DeviceAssetCreateDeprecatedRequest = {"name":"my_video.mp4","filetype":"video/mp4","is_realtime_upload":true,"channel":0,"offset":-10} // DeviceAssetCreateDeprecatedRequest | While supported, we encourage you to switch from `application/x-ww-form-urlencoded` to `application/json` in order to support future workflows that will only be supported through JSON.  When `is_realtime_upload` is `true`, call must be made in `application/json`.
try {
    val result : CreateAsset200Response = apiInstance.deviceAssetCreate(xClientVersion, deviceAssetCreateDeprecatedRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#deviceAssetCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#deviceAssetCreate")
    e.printStackTrace()
}
```

### Parameters
| **xClientVersion** | **kotlin.String**| Firmware or software version of a C2C integration. Will be used to determine the correct Device Model configuration for the device when multiple are available. Must be a valid semantic version.    For more on semantic versions, see here: https://semver.org/ | [optional] [default to &quot;0.0.0&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deviceAssetCreateDeprecatedRequest** | [**DeviceAssetCreateDeprecatedRequest**](DeviceAssetCreateDeprecatedRequest.md)| While supported, we encourage you to switch from &#x60;application/x-ww-form-urlencoded&#x60; to &#x60;application/json&#x60; in order to support future workflows that will only be supported through JSON.  When &#x60;is_realtime_upload&#x60; is &#x60;true&#x60;, call must be made in &#x60;application/json&#x60;. | [optional] |

### Return type

[**CreateAsset200Response**](CreateAsset200Response.md)

### Authorization


Configure C2COAuth2:
    ApiClient.accessToken = ""
Configure C2CDeviceAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a id="deviceAssetCreateDeprecated"></a>
# **deviceAssetCreateDeprecated**
> CreateAsset200Response deviceAssetCreateDeprecated(xClientVersion, deviceAssetCreateDeprecatedRequest)

Create C2C asset

**THIS ENDPOINT IS DEPRECATED**. Please use &#x60;/v2/devices/assets&#x60; instead. While this endpoint will continue to function as normal, we ask that integrations begin using the new endpoint instead for consistency with the rest of the C2C API.  Asset upload initiation specifically for C2C devices and applications.

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val xClientVersion : kotlin.String = 2.16.4 // kotlin.String | Firmware or software version of a C2C integration. Will be used to determine the correct Device Model configuration for the device when multiple are available. Must be a valid semantic version.    For more on semantic versions, see here: https://semver.org/
val deviceAssetCreateDeprecatedRequest : DeviceAssetCreateDeprecatedRequest = {"name":"my_video.mp4","filetype":"video/mp4","is_realtime_upload":true,"channel":0,"offset":-10} // DeviceAssetCreateDeprecatedRequest | While supported, we encourage you to switch from `application/x-ww-form-urlencoded` to `application/json` in order to support future workflows that will only be supported through JSON.  When `is_realtime_upload` is `true`, call must be made in `application/json`.
try {
    val result : CreateAsset200Response = apiInstance.deviceAssetCreateDeprecated(xClientVersion, deviceAssetCreateDeprecatedRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#deviceAssetCreateDeprecated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#deviceAssetCreateDeprecated")
    e.printStackTrace()
}
```

### Parameters
| **xClientVersion** | **kotlin.String**| Firmware or software version of a C2C integration. Will be used to determine the correct Device Model configuration for the device when multiple are available. Must be a valid semantic version.    For more on semantic versions, see here: https://semver.org/ | [optional] [default to &quot;0.0.0&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deviceAssetCreateDeprecatedRequest** | [**DeviceAssetCreateDeprecatedRequest**](DeviceAssetCreateDeprecatedRequest.md)| While supported, we encourage you to switch from &#x60;application/x-ww-form-urlencoded&#x60; to &#x60;application/json&#x60; in order to support future workflows that will only be supported through JSON.  When &#x60;is_realtime_upload&#x60; is &#x60;true&#x60;, call must be made in &#x60;application/json&#x60;. | [optional] |

### Return type

[**CreateAsset200Response**](CreateAsset200Response.md)

### Authorization


Configure C2COAuth2:
    ApiClient.accessToken = ""
Configure C2CDeviceAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a id="getAsset"></a>
# **getAsset**
> Asset getAsset(assetId, includeDeleted, type)

Get an Asset

Fetch the full Asset manifest

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val type : GetAssetTypeParameter =  // GetAssetTypeParameter | 
try {
    val result : Asset = apiInstance.getAsset(assetId, includeDeleted, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAsset")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **kotlin.String**| Asset ID | |
| **includeDeleted** | **kotlin.Boolean**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | [**GetAssetTypeParameter**](.md)|  | [optional] |

### Return type

[**Asset**](Asset.md)

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

<a id="getAssets"></a>
# **getAssets**
> kotlin.collections.List&lt;Asset&gt; getAssets(assetId, includeDeleted, include, sort, page, pageSize)

Fetch child Assets

Get child elements of a given asset. Can be used to get the items in a review link, version stack, folder, as well as including an asset to use on the cover of a folder.

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Include deleted files by passing `true`
val include : kotlin.String = include_example // kotlin.String | Include additional \"pre-loads\" for related resources
val sort : kotlin.String = sort_example // kotlin.String | The sorting order for the returned list of Assets. Supporting chaining like `comment_count,id`. Also supports reversing the order with `-` i.e. `-comment_count,id` or `filetype,-id`.
val page : kotlin.Double = 8.14 // kotlin.Double | The current page number in this Paginated Response
val pageSize : kotlin.Double = 8.14 // kotlin.Double | Number of pages in this Paginated Response
try {
    val result : kotlin.collections.List<Asset> = apiInstance.getAssets(assetId, includeDeleted, include, sort, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssets")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **kotlin.String**| Asset ID | |
| **includeDeleted** | **kotlin.Boolean**| Include deleted files by passing &#x60;true&#x60; | [optional] [default to false] |
| **include** | **kotlin.String**| Include additional \&quot;pre-loads\&quot; for related resources | [optional] [enum: children, cover_asset, review_links] |
| **sort** | **kotlin.String**| The sorting order for the returned list of Assets. Supporting chaining like &#x60;comment_count,id&#x60;. Also supports reversing the order with &#x60;-&#x60; i.e. &#x60;-comment_count,id&#x60; or &#x60;filetype,-id&#x60;. | [optional] [enum: comment_count, filesize, filetype, id, label, name, uploaded_at] |
| **page** | **kotlin.Double**| The current page number in this Paginated Response | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Double**| Number of pages in this Paginated Response | [optional] |

### Return type

[**kotlin.collections.List&lt;Asset&gt;**](Asset.md)

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

<a id="getAudio"></a>
# **getAudio**
> AssetAudio getAudio(assetId)

Get audio for an Asset

Fetch the audio tracks for a given Asset

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
try {
    val result : AssetAudio = apiInstance.getAudio(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAudio")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAudio")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetId** | **kotlin.String**|  | |

### Return type

[**AssetAudio**](AssetAudio.md)

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

val apiInstance = AssetsApi()
val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
try {
    val result : AssetSubtitle = apiInstance.getSubtitles(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getSubtitles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getSubtitles")
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

<a id="librarySearchGet"></a>
# **librarySearchGet**
> kotlin.collections.List&lt;Asset&gt; librarySearchGet(accountId, filter, includeDeleted, opts, page, pageSize, q, query, sort)

Advanced search for Assets

Advanced Asset Search

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val filter : kotlin.String = Object // kotlin.String | Custom ES filters to apply to your query
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Flag to include soft-deleted records in results
val opts : kotlin.String = Object // kotlin.String | Additional request options
val page : kotlin.Int = 56 // kotlin.Int | The page to retrieve
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of results to include in the page
val q : kotlin.String = q_example // kotlin.String | Search text
val query : kotlin.String = query_example // kotlin.String | Search text
val sort : kotlin.String = sort_example // kotlin.String | Sorting parameters
try {
    val result : kotlin.collections.List<Asset> = apiInstance.librarySearchGet(accountId, filter, includeDeleted, opts, page, pageSize, q, query, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#librarySearchGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#librarySearchGet")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **kotlin.String**|  | [optional] |
| **filter** | [**kotlin.String**](.md)| Custom ES filters to apply to your query | [optional] |
| **includeDeleted** | **kotlin.Boolean**| Flag to include soft-deleted records in results | [optional] |
| **opts** | [**kotlin.String**](.md)| Additional request options | [optional] |
| **page** | **kotlin.Int**| The page to retrieve | [optional] |
| **pageSize** | **kotlin.Int**| The number of results to include in the page | [optional] |
| **q** | **kotlin.String**| Search text | [optional] |
| **query** | **kotlin.String**| Search text | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sorting parameters | [optional] |

### Return type

[**kotlin.collections.List&lt;Asset&gt;**](Asset.md)

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

<a id="librarySearchPost"></a>
# **librarySearchPost**
> kotlin.collections.List&lt;Asset&gt; librarySearchPost(librarySearch)

Advanced search for Assets

Search using ElasticSearch key/value pairs

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val librarySearch : LibrarySearch =  // LibrarySearch | Advanced asset search
try {
    val result : kotlin.collections.List<Asset> = apiInstance.librarySearchPost(librarySearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#librarySearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#librarySearchPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **librarySearch** | [**LibrarySearch**](LibrarySearch.md)| Advanced asset search | [optional] |

### Return type

[**kotlin.collections.List&lt;Asset&gt;**](Asset.md)

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

<a id="moveAsset"></a>
# **moveAsset**
> Asset moveAsset(destinationFolder, copyAssetRequest)

Move asset

Move an asset to a new location

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val destinationFolder : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Destination folder `id`
val copyAssetRequest : CopyAssetRequest =  // CopyAssetRequest | Asset copy request
try {
    val result : Asset = apiInstance.moveAsset(destinationFolder, copyAssetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#moveAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#moveAsset")
    e.printStackTrace()
}
```

### Parameters
| **destinationFolder** | **kotlin.String**| Destination folder &#x60;id&#x60; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **copyAssetRequest** | [**CopyAssetRequest**](CopyAssetRequest.md)| Asset copy request | [optional] |

### Return type

[**Asset**](Asset.md)

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

<a id="unversionAsset"></a>
# **unversionAsset**
> Asset unversionAsset(assetId)

Unversion an Asset

Unversion an Asset from a Version Stack

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
try {
    val result : Asset = apiInstance.unversionAsset(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#unversionAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#unversionAsset")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetId** | **kotlin.String**|  | |

### Return type

[**Asset**](Asset.md)

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

<a id="updateAsset"></a>
# **updateAsset**
> Asset updateAsset(assetId)

Update an Asset

Update the manifest on an Asset

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AssetsApi()
val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
try {
    val result : Asset = apiInstance.updateAsset(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#updateAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#updateAsset")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetId** | **kotlin.String**| Asset ID | |

### Return type

[**Asset**](Asset.md)

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

