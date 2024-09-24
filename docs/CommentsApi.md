# CommentsApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**completeComment**](CommentsApi.md#completeComment) | **POST** /v2/comments/{comment_id}/complete | Mark completed |
| [**createComment**](CommentsApi.md#createComment) | **POST** /v2/assets/{asset_id}/comments | Create a Comment |
| [**createCommentImpressionLike**](CommentsApi.md#createCommentImpressionLike) | **POST** /v2/comments/{comment_id}/like | Create a Like on a Comment |
| [**createReply**](CommentsApi.md#createReply) | **POST** /v2/comments/{comment_id}/replies | Leave a Reply on a Comment |
| [**deleteComment**](CommentsApi.md#deleteComment) | **DELETE** /v2/comments/{comment_id} | Delete a Comment |
| [**deleteCommentImpressionLike**](CommentsApi.md#deleteCommentImpressionLike) | **DELETE** /v2/comments/{comment_id}/like | Delete a like from a comment |
| [**getComment**](CommentsApi.md#getComment) | **GET** /v2/comments/{comment_id} | Get a Comment by ID |
| [**getCommentImpressions**](CommentsApi.md#getCommentImpressions) | **GET** /v2/comments/{comment_id}/impressions | Get impressions |
| [**getComments**](CommentsApi.md#getComments) | **GET** /v2/assets/{asset_id}/comments | Get all the Comments and Replies from  a Comment thread |
| [**getReplies**](CommentsApi.md#getReplies) | **GET** /v2/comments/{comment_id}/replies | Get comments and replies |
| [**uncompleteComment**](CommentsApi.md#uncompleteComment) | **DELETE** /v2/comments/{comment_id}/complete | Mark a Comment as Uncompleted |
| [**updateComment**](CommentsApi.md#updateComment) | **PUT** /v2/comments/{comment_id} | Update a Comment |


<a id="completeComment"></a>
# **completeComment**
> Comment completeComment(commentId)

Mark completed

Complete a \&quot;Task\&quot; on a given Comment

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val commentId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Comment ID
try {
    val result : Comment = apiInstance.completeComment(commentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#completeComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#completeComment")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **commentId** | **kotlin.String**| Comment ID | |

### Return type

[**Comment**](Comment.md)

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

<a id="createComment"></a>
# **createComment**
> Comment createComment(assetId, createCommentRequest)

Create a Comment

Leave a Comment on an Asset

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val createCommentRequest : CreateCommentRequest =  // CreateCommentRequest | Comment to create or update
try {
    val result : Comment = apiInstance.createComment(assetId, createCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#createComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#createComment")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createCommentRequest** | [**CreateCommentRequest**](CreateCommentRequest.md)| Comment to create or update | [optional] |

### Return type

[**Comment**](Comment.md)

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

<a id="createCommentImpressionLike"></a>
# **createCommentImpressionLike**
> kotlin.collections.List&lt;CommentImpression&gt; createCommentImpressionLike(commentId)

Create a Like on a Comment

Leave a thumbs-up on a Comment

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val commentId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
try {
    val result : kotlin.collections.List<CommentImpression> = apiInstance.createCommentImpressionLike(commentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#createCommentImpressionLike")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#createCommentImpressionLike")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **commentId** | **kotlin.String**|  | |

### Return type

[**kotlin.collections.List&lt;CommentImpression&gt;**](CommentImpression.md)

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

<a id="createReply"></a>
# **createReply**
> Comment createReply(commentId, createCommentRequest)

Leave a Reply on a Comment

Leave a Reply on a given Comment

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val commentId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Comment ID
val createCommentRequest : CreateCommentRequest =  // CreateCommentRequest | Comment to create or update
try {
    val result : Comment = apiInstance.createReply(commentId, createCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#createReply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#createReply")
    e.printStackTrace()
}
```

### Parameters
| **commentId** | **kotlin.String**| Comment ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createCommentRequest** | [**CreateCommentRequest**](CreateCommentRequest.md)| Comment to create or update | [optional] |

### Return type

[**Comment**](Comment.md)

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

<a id="deleteComment"></a>
# **deleteComment**
> Comment deleteComment(commentId)

Delete a Comment

Delete a Comment or Reply using its ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val commentId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Comment ID
try {
    val result : Comment = apiInstance.deleteComment(commentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#deleteComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#deleteComment")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **commentId** | **kotlin.String**| Comment ID | |

### Return type

[**Comment**](Comment.md)

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

<a id="deleteCommentImpressionLike"></a>
# **deleteCommentImpressionLike**
> kotlin.collections.List&lt;CommentImpression&gt; deleteCommentImpressionLike(commentId)

Delete a like from a comment

Remove a Like from a Comment

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val commentId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
try {
    val result : kotlin.collections.List<CommentImpression> = apiInstance.deleteCommentImpressionLike(commentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#deleteCommentImpressionLike")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#deleteCommentImpressionLike")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **commentId** | **kotlin.String**|  | |

### Return type

[**kotlin.collections.List&lt;CommentImpression&gt;**](CommentImpression.md)

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

<a id="getComment"></a>
# **getComment**
> Comment getComment(commentId, include)

Get a Comment by ID

Fetch a Comment by its ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val commentId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Comment ID
val include : kotlin.String = include_example // kotlin.String | 
try {
    val result : Comment = apiInstance.getComment(commentId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#getComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#getComment")
    e.printStackTrace()
}
```

### Parameters
| **commentId** | **kotlin.String**| Comment ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | **kotlin.String**|  | [optional] |

### Return type

[**Comment**](Comment.md)

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

<a id="getCommentImpressions"></a>
# **getCommentImpressions**
> kotlin.collections.List&lt;CommentImpression&gt; getCommentImpressions(commentId, include)

Get impressions

Fetch a list of who has &#39;seen&#39; your comment

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val commentId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val include : kotlin.String = include_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CommentImpression> = apiInstance.getCommentImpressions(commentId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#getCommentImpressions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#getCommentImpressions")
    e.printStackTrace()
}
```

### Parameters
| **commentId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CommentImpression&gt;**](CommentImpression.md)

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

<a id="getComments"></a>
# **getComments**
> kotlin.collections.List&lt;Comment&gt; getComments(assetId, include)

Get all the Comments and Replies from  a Comment thread

This endpoint will return all comments and replies in a flat list.

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
val include : kotlin.String = include_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Comment> = apiInstance.getComments(assetId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#getComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#getComments")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;Comment&gt;**](Comment.md)

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

<a id="getReplies"></a>
# **getReplies**
> kotlin.collections.List&lt;Comment&gt; getReplies(commentId, include)

Get comments and replies

Fetch all Comments and Replies for a given Comment or Reply ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val commentId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Comment ID
val include : kotlin.String = include_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Comment> = apiInstance.getReplies(commentId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#getReplies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#getReplies")
    e.printStackTrace()
}
```

### Parameters
| **commentId** | **kotlin.String**| Comment ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | **kotlin.String**|  | [optional] [default to &quot;replies&quot;] |

### Return type

[**kotlin.collections.List&lt;Comment&gt;**](Comment.md)

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

<a id="uncompleteComment"></a>
# **uncompleteComment**
> Comment uncompleteComment(commentId)

Mark a Comment as Uncompleted

If a Comment has been marked **Completed**, you can reset its to **Uncompleted** by hitting this endpoint.

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val commentId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Comment ID
try {
    val result : Comment = apiInstance.uncompleteComment(commentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#uncompleteComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#uncompleteComment")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **commentId** | **kotlin.String**| Comment ID | |

### Return type

[**Comment**](Comment.md)

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

<a id="updateComment"></a>
# **updateComment**
> Comment updateComment(commentId, createCommentRequest)

Update a Comment

Update a Comment via its ID, overwriting only the passed key/value pairs

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = CommentsApi()
val commentId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Comment ID
val createCommentRequest : CreateCommentRequest =  // CreateCommentRequest | Comment to create or update
try {
    val result : Comment = apiInstance.updateComment(commentId, createCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#updateComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#updateComment")
    e.printStackTrace()
}
```

### Parameters
| **commentId** | **kotlin.String**| Comment ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createCommentRequest** | [**CreateCommentRequest**](CreateCommentRequest.md)| Comment to create or update | [optional] |

### Return type

[**Comment**](Comment.md)

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

