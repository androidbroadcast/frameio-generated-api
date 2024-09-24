# ReviewLinksApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**reviewLinkCreate**](ReviewLinksApi.md#reviewLinkCreate) | **POST** /v2/projects/{project_id}/review_links | Create a Review Link |
| [**reviewLinkDelete**](ReviewLinksApi.md#reviewLinkDelete) | **DELETE** /v2/review_links/{review_link_id} | Delete a Review Link |
| [**reviewLinkGet**](ReviewLinksApi.md#reviewLinkGet) | **GET** /v2/review_links/{review_link_id} | Get a Review Link |
| [**reviewLinkItemCreate**](ReviewLinksApi.md#reviewLinkItemCreate) | **POST** /v2/review_links/{review_link_id}/assets | Add Asset to a Review Link |
| [**reviewLinkItemUpdate**](ReviewLinksApi.md#reviewLinkItemUpdate) | **PUT** /v2/review_links/{review_link_id}/assets | Update Assets in a Review Link |
| [**reviewLinkItemsDelete**](ReviewLinksApi.md#reviewLinkItemsDelete) | **DELETE** /v2/review_links/{review_link_id}/items/shared | Remove items from a Review Link |
| [**reviewLinkItemsList**](ReviewLinksApi.md#reviewLinkItemsList) | **GET** /v2/review_links/{review_link_id}/items/shared | Get items in a Review Link |
| [**reviewLinkReviewerDelete**](ReviewLinksApi.md#reviewLinkReviewerDelete) | **DELETE** /v2/review_links/{review_link_id}/reviewers | Remove Reviewers from a Review Link |
| [**reviewLinkReviewerInvite**](ReviewLinksApi.md#reviewLinkReviewerInvite) | **POST** /v2/review_links/{review_link_id}/reviewers | Invite Reviewer to a Review Link |
| [**reviewLinkUpdate**](ReviewLinksApi.md#reviewLinkUpdate) | **PUT** /v2/review_links/{review_link_id} | Update a Review Link |
| [**reviewLinksList**](ReviewLinksApi.md#reviewLinksList) | **GET** /v2/projects/{project_id}/review_links | List Review Links in a project |


<a id="reviewLinkCreate"></a>
# **reviewLinkCreate**
> ReviewLink reviewLinkCreate(projectId, reviewLink)

Create a Review Link

Create a new Review Link in a given Project

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ReviewLinksApi()
val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
val reviewLink : ReviewLink = {"name":"Example review link"} // ReviewLink | ReviewLink to create
try {
    val result : ReviewLink = apiInstance.reviewLinkCreate(projectId, reviewLink)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewLinksApi#reviewLinkCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewLinksApi#reviewLinkCreate")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reviewLink** | [**ReviewLink**](ReviewLink.md)| ReviewLink to create | [optional] |

### Return type

[**ReviewLink**](ReviewLink.md)

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

<a id="reviewLinkDelete"></a>
# **reviewLinkDelete**
> ReviewLink reviewLinkDelete(reviewLinkId)

Delete a Review Link

Delete a given Review Link

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ReviewLinksApi()
val reviewLinkId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Review Link ID
try {
    val result : ReviewLink = apiInstance.reviewLinkDelete(reviewLinkId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewLinksApi#reviewLinkDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewLinksApi#reviewLinkDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reviewLinkId** | **kotlin.String**| Review Link ID | |

### Return type

[**ReviewLink**](ReviewLink.md)

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

<a id="reviewLinkGet"></a>
# **reviewLinkGet**
> ReviewLink reviewLinkGet(reviewLinkId, include)

Get a Review Link

Get a full Review Link manifest

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ReviewLinksApi()
val reviewLinkId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Review Link ID
val include : kotlin.String = include_example // kotlin.String | 
try {
    val result : ReviewLink = apiInstance.reviewLinkGet(reviewLinkId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewLinksApi#reviewLinkGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewLinksApi#reviewLinkGet")
    e.printStackTrace()
}
```

### Parameters
| **reviewLinkId** | **kotlin.String**| Review Link ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | **kotlin.String**|  | [optional] |

### Return type

[**ReviewLink**](ReviewLink.md)

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

<a id="reviewLinkItemCreate"></a>
# **reviewLinkItemCreate**
> ReviewLink reviewLinkItemCreate(reviewLinkId, reviewLinkItemsDeleteRequest)

Add Asset to a Review Link

Add assets to a Review Link

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ReviewLinksApi()
val reviewLinkId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val reviewLinkItemsDeleteRequest : ReviewLinkItemsDeleteRequest = {"asset_ids":["497f6eca-6276-4993-bfeb-53cbbbba6f08"]} // ReviewLinkItemsDeleteRequest | ReviewLinkItems to create
try {
    val result : ReviewLink = apiInstance.reviewLinkItemCreate(reviewLinkId, reviewLinkItemsDeleteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewLinksApi#reviewLinkItemCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewLinksApi#reviewLinkItemCreate")
    e.printStackTrace()
}
```

### Parameters
| **reviewLinkId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reviewLinkItemsDeleteRequest** | [**ReviewLinkItemsDeleteRequest**](ReviewLinkItemsDeleteRequest.md)| ReviewLinkItems to create | [optional] |

### Return type

[**ReviewLink**](ReviewLink.md)

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

<a id="reviewLinkItemUpdate"></a>
# **reviewLinkItemUpdate**
> ReviewLink reviewLinkItemUpdate(reviewLinkId, reviewLinkItemsDeleteRequest)

Update Assets in a Review Link

Replace the assets on this Review Link

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ReviewLinksApi()
val reviewLinkId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val reviewLinkItemsDeleteRequest : ReviewLinkItemsDeleteRequest = {"asset_ids":["497f6eca-6276-4993-bfeb-53cbbbba6f08"]} // ReviewLinkItemsDeleteRequest | ReviewLinkItems to create
try {
    val result : ReviewLink = apiInstance.reviewLinkItemUpdate(reviewLinkId, reviewLinkItemsDeleteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewLinksApi#reviewLinkItemUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewLinksApi#reviewLinkItemUpdate")
    e.printStackTrace()
}
```

### Parameters
| **reviewLinkId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reviewLinkItemsDeleteRequest** | [**ReviewLinkItemsDeleteRequest**](ReviewLinkItemsDeleteRequest.md)| ReviewLinkItems to create | [optional] |

### Return type

[**ReviewLink**](ReviewLink.md)

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

<a id="reviewLinkItemsDelete"></a>
# **reviewLinkItemsDelete**
> kotlin.collections.List&lt;ReviewLinkItem&gt; reviewLinkItemsDelete(reviewLinkId, reviewLinkItemsDeleteRequest)

Remove items from a Review Link

Remove a list of &#x60;asset_id&#x60;s from the assets shared in a Review Link

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ReviewLinksApi()
val reviewLinkId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val reviewLinkItemsDeleteRequest : ReviewLinkItemsDeleteRequest = {"asset_ids":["497f6eca-6276-4993-bfeb-53cbbbba6f08"]} // ReviewLinkItemsDeleteRequest | ReviewLinkItems to delete
try {
    val result : kotlin.collections.List<ReviewLinkItem> = apiInstance.reviewLinkItemsDelete(reviewLinkId, reviewLinkItemsDeleteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewLinksApi#reviewLinkItemsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewLinksApi#reviewLinkItemsDelete")
    e.printStackTrace()
}
```

### Parameters
| **reviewLinkId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reviewLinkItemsDeleteRequest** | [**ReviewLinkItemsDeleteRequest**](ReviewLinkItemsDeleteRequest.md)| ReviewLinkItems to delete | [optional] |

### Return type

[**kotlin.collections.List&lt;ReviewLinkItem&gt;**](ReviewLinkItem.md)

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

<a id="reviewLinkItemsList"></a>
# **reviewLinkItemsList**
> kotlin.collections.List&lt;ReviewLinkItem&gt; reviewLinkItemsList(reviewLinkId, include)

Get items in a Review Link

Fetch the list of items (assets, folders, and version stacks) on a given Review Link

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ReviewLinksApi()
val reviewLinkId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val include : kotlin.String = include_example // kotlin.String | 
try {
    val result : kotlin.collections.List<ReviewLinkItem> = apiInstance.reviewLinkItemsList(reviewLinkId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewLinksApi#reviewLinkItemsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewLinksApi#reviewLinkItemsList")
    e.printStackTrace()
}
```

### Parameters
| **reviewLinkId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;ReviewLinkItem&gt;**](ReviewLinkItem.md)

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

<a id="reviewLinkReviewerDelete"></a>
# **reviewLinkReviewerDelete**
> kotlin.collections.List&lt;ReviewLinkItem&gt; reviewLinkReviewerDelete(reviewLinkId, reviewLinkItemsDeleteRequest)

Remove Reviewers from a Review Link

Remove access for a Reviewer to a Review Link

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ReviewLinksApi()
val reviewLinkId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val reviewLinkItemsDeleteRequest : ReviewLinkItemsDeleteRequest = {"asset_ids":["497f6eca-6276-4993-bfeb-53cbbbba6f08"]} // ReviewLinkItemsDeleteRequest | ReviewLinkItems to delete
try {
    val result : kotlin.collections.List<ReviewLinkItem> = apiInstance.reviewLinkReviewerDelete(reviewLinkId, reviewLinkItemsDeleteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewLinksApi#reviewLinkReviewerDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewLinksApi#reviewLinkReviewerDelete")
    e.printStackTrace()
}
```

### Parameters
| **reviewLinkId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reviewLinkItemsDeleteRequest** | [**ReviewLinkItemsDeleteRequest**](ReviewLinkItemsDeleteRequest.md)| ReviewLinkItems to delete | [optional] |

### Return type

[**kotlin.collections.List&lt;ReviewLinkItem&gt;**](ReviewLinkItem.md)

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

<a id="reviewLinkReviewerInvite"></a>
# **reviewLinkReviewerInvite**
> kotlin.collections.List&lt;ReviewLinkItem&gt; reviewLinkReviewerInvite(reviewLinkId, reviewLinkReviewerInviteRequest)

Invite Reviewer to a Review Link

Invite a Reviewer to a Review Link

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ReviewLinksApi()
val reviewLinkId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val reviewLinkReviewerInviteRequest : ReviewLinkReviewerInviteRequest = {"email":"test_user@frame.io","message":"This a sample message!"} // ReviewLinkReviewerInviteRequest | ReviewLinkItems to delete
try {
    val result : kotlin.collections.List<ReviewLinkItem> = apiInstance.reviewLinkReviewerInvite(reviewLinkId, reviewLinkReviewerInviteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewLinksApi#reviewLinkReviewerInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewLinksApi#reviewLinkReviewerInvite")
    e.printStackTrace()
}
```

### Parameters
| **reviewLinkId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reviewLinkReviewerInviteRequest** | [**ReviewLinkReviewerInviteRequest**](ReviewLinkReviewerInviteRequest.md)| ReviewLinkItems to delete | [optional] |

### Return type

[**kotlin.collections.List&lt;ReviewLinkItem&gt;**](ReviewLinkItem.md)

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

<a id="reviewLinkUpdate"></a>
# **reviewLinkUpdate**
> ReviewLink reviewLinkUpdate(reviewLinkId, reviewLink)

Update a Review Link

Update a Review Links manifest, overwriting any specified key/value pairs

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ReviewLinksApi()
val reviewLinkId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Review Link ID
val reviewLink : ReviewLink =  // ReviewLink | ReviewLink to update
try {
    val result : ReviewLink = apiInstance.reviewLinkUpdate(reviewLinkId, reviewLink)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewLinksApi#reviewLinkUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewLinksApi#reviewLinkUpdate")
    e.printStackTrace()
}
```

### Parameters
| **reviewLinkId** | **kotlin.String**| Review Link ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reviewLink** | [**ReviewLink**](ReviewLink.md)| ReviewLink to update | [optional] |

### Return type

[**ReviewLink**](ReviewLink.md)

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

<a id="reviewLinksList"></a>
# **reviewLinksList**
> kotlin.collections.List&lt;ReviewLink&gt; reviewLinksList(projectId)

List Review Links in a project

List all the Review Links belonging to a Project

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ReviewLinksApi()
val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
try {
    val result : kotlin.collections.List<ReviewLink> = apiInstance.reviewLinksList(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewLinksApi#reviewLinksList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewLinksApi#reviewLinksList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectId** | **kotlin.String**| Project ID | |

### Return type

[**kotlin.collections.List&lt;ReviewLink&gt;**](ReviewLink.md)

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

