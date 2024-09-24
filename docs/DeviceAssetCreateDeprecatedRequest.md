
# DeviceAssetCreateDeprecatedRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The name the asset should have in Frame.io. This value does not have to match the name of the file on disk; it can be whatever you want it to be in Frame.io.  Required if &#x60;is_realtime_upload&#x60; is &#x60;false&#x60;.  If &#x60;is_realtime_upload&#x60; is &#x60;true&#x60;, must containa valid extension in the form of &#x60;\&quot;.[ext]\&quot;&#x60;, unless &#x60;extension&#x60; is provided, in which case this field may be &#x60;null&#x60; or omitted. |  [optional] |
| **extension** | **kotlin.String** | Required when &#x60;is_realtime_upload&#x60; is &#x60;true&#x60;, when &#x60;name&#x60; is not known at time of asset creation. If &#x60;name&#x60; is provided, must match extension of that value.  Ignored when &#x60;is_realtime_upload&#x60; is &#x60;false&#x60;.  When supplied, asset will be creted with &#x60;name&#x60; value of &#x60;\&quot;[new file].extension\&quot;&#x60;. |  [optional] |
| **filetype** | **kotlin.String** | MIME type like &#x60;video/quicktime&#x60;. Many languages have built in utilities for detecting file mimetype (see Go and Python for examples).  Required if &#x60;is_realtime_upload&#x60; is &#x60;true&#x60;. |  [optional] |
| **autoVersionId** | **kotlin.String** | The asset you&#39;d like this to be the next version of |  [optional] |
| **isRealtimeUpload** | **kotlin.Boolean** | If &#x60;true&#x60;, File data for this asset is to be uploaded through the Real-time Uploads API.  If &#x60;false&#x60;, File data for this asset will be uploaded through the default API.  Must be &#x60;false&#x60; if &#x60;filetype&#x60; is not &#x60;file&#x60;. |  [optional] |
| **filesize** | [**DeviceAssetCreateDeprecatedRequestFilesize**](DeviceAssetCreateDeprecatedRequestFilesize.md) |  |  [optional] |
| **channel** | [**DeviceAssetCreateDeprecatedRequestChannel**](DeviceAssetCreateDeprecatedRequestChannel.md) |  |  [optional] |
| **offset** | [**DeviceAssetCreateDeprecatedRequestFilesize**](DeviceAssetCreateDeprecatedRequestFilesize.md) |  |  [optional] |
| **parts** | [**DeviceAssetCreateDeprecatedRequestParts**](DeviceAssetCreateDeprecatedRequestParts.md) |  |  [optional] |



