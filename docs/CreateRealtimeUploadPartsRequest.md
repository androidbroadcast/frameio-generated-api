
# CreateRealtimeUploadPartsRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **parts** | [**kotlin.collections.List&lt;CreateRealtimeUploadPartsRequestPartsInner&gt;**](CreateRealtimeUploadPartsRequestPartsInner.md) | List of file upload parts to register with Frame. |  |
| **assetName** | **kotlin.String** | Updates the asset name if only &#x60;extension&#x60; was supplied to assetCreate, and the default name is still in use.  Otherwise, will be ignored. |  [optional] |
| **assetFilesize** | **kotlin.Int** | The full filesize for the upload in bytes. This field is required when an object in &#x60;parts&#x60; has &#x60;is_final&#x60; set to &#x60;true&#x60;.  Must be no more than 5 TiB. |  [optional] |



