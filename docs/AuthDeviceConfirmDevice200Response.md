
# AuthDeviceConfirmDevice200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accessToken** | **kotlin.String** | This is your key to the rest of the Frame.io backend. We will need to add this to the header of the rest of the requests we are going to make in these tutorials. |  |
| **expiresIn** | **kotlin.Double** | The number of seconds until &#x60;access_token&#x60; expires. After the token&#39;s time is up, it will need to be refreshed, which we will go over in a future tutorial. |  |
| **refreshToken** | **kotlin.String** | A token we can use to manage our access_token. It will most commonly be used to refresh our authorization, but it can also be used to revoke it. |  |
| **tokenType** | [**inline**](#TokenType) | Will always be bearer for the C2C API, and is not actionable. |  |


<a id="TokenType"></a>
## Enum: token_type
| Name | Value |
| ---- | ----- |
| tokenType | bearer |



