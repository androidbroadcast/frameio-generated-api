# AccountsApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deviceIdentify**](AccountsApi.md#deviceIdentify) | **GET** /v2/devices/me | Device Information |
| [**deviceListAccounts**](AccountsApi.md#deviceListAccounts) | **GET** /v2/devices/accounts | List accounts |
| [**getAccount**](AccountsApi.md#getAccount) | **GET** /v2/accounts/{account_id} | Get Account |
| [**getAccountMembership**](AccountsApi.md#getAccountMembership) | **GET** /v2/accounts/{account_id}/membership | Get Account membership |
| [**getAccounts**](AccountsApi.md#getAccounts) | **GET** /v2/accounts | Get Accounts for User |


<a id="deviceIdentify"></a>
# **deviceIdentify**
> ProjectDeviceAuthorization deviceIdentify(xClientVersion)

Device Information

Fetches information about the current device connection.   Can be used to verify authorization token and returns information useful to present useful information in your user interface.

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AccountsApi()
val xClientVersion : kotlin.String = 2.16.4 // kotlin.String | Firmware or software version of a C2C integration. Will be used to determine the correct Device Model configuration for the device when multiple are available. Must be a valid semantic version.    For more on semantic versions, see here: https://semver.org/
try {
    val result : ProjectDeviceAuthorization = apiInstance.deviceIdentify(xClientVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#deviceIdentify")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#deviceIdentify")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xClientVersion** | **kotlin.String**| Firmware or software version of a C2C integration. Will be used to determine the correct Device Model configuration for the device when multiple are available. Must be a valid semantic version.    For more on semantic versions, see here: https://semver.org/ | [optional] [default to &quot;0.0.0&quot;] |

### Return type

[**ProjectDeviceAuthorization**](ProjectDeviceAuthorization.md)

### Authorization


Configure C2CDeviceAuth:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deviceListAccounts"></a>
# **deviceListAccounts**
> kotlin.collections.Set&lt;DeviceListAccounts200ResponseInner&gt; deviceListAccounts(xClientVersion)

List accounts

List available accounts to pair your C2C device with.

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AccountsApi()
val xClientVersion : kotlin.String = 2.16.4 // kotlin.String | Firmware or software version of a C2C integration. Will be used to determine the correct Device Model configuration for the device when multiple are available. Must be a valid semantic version.    For more on semantic versions, see here: https://semver.org/
try {
    val result : kotlin.collections.Set<DeviceListAccounts200ResponseInner> = apiInstance.deviceListAccounts(xClientVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#deviceListAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#deviceListAccounts")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xClientVersion** | **kotlin.String**| Firmware or software version of a C2C integration. Will be used to determine the correct Device Model configuration for the device when multiple are available. Must be a valid semantic version.    For more on semantic versions, see here: https://semver.org/ | [optional] [default to &quot;0.0.0&quot;] |

### Return type

[**kotlin.collections.Set&lt;DeviceListAccounts200ResponseInner&gt;**](DeviceListAccounts200ResponseInner.md)

### Authorization


Configure C2COAuth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccount"></a>
# **getAccount**
> Account getAccount(accountId)

Get Account

Fetch a particular account by ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AccountsApi()
val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Account ID
try {
    val result : Account = apiInstance.getAccount(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccount")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.String**| Account ID | |

### Return type

[**Account**](Account.md)

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

<a id="getAccountMembership"></a>
# **getAccountMembership**
> AccountMembership getAccountMembership(accountId)

Get Account membership

Get the membership status for the auth token making the request

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AccountsApi()
val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Account ID
try {
    val result : AccountMembership = apiInstance.getAccountMembership(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountMembership")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountMembership")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.String**| Account ID | |

### Return type

[**AccountMembership**](AccountMembership.md)

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

<a id="getAccounts"></a>
# **getAccounts**
> kotlin.collections.List&lt;Account&gt; getAccounts()

Get Accounts for User

Fetch all Accounts that a given User has access to

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AccountsApi()
try {
    val result : kotlin.collections.List<Account> = apiInstance.getAccounts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccounts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Account&gt;**](Account.md)

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

