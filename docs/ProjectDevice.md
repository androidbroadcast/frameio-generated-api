
# ProjectDevice

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **assetType** | [**ProjectDeviceAssetType**](ProjectDeviceAssetType.md) |  |  [optional] |
| **creatorId** | **kotlin.String** |  |  [optional] |
| **deletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **deviceId** | **kotlin.String** |  |  [optional] |
| **insertedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **lastSeenAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **name** | **kotlin.String** | Name of this device as shown in the iOS app and web app |  [optional] |
| **projectId** | **kotlin.String** | The Project ID that this device is linked to |  [optional] |
| **updatedAt** | **kotlin.String** |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **timezone** | **kotlin.String** |  |  [optional] |
| **authorization** | [**ProjectDeviceAuthorization**](ProjectDeviceAuthorization.md) |  |  [optional] |
| **project** | [**Project**](Project.md) |  |  [optional] |
| **channels** | [**kotlin.collections.List&lt;ProjectDeviceChannel&gt;**](ProjectDeviceChannel.md) |  |  [optional] |
| **channelCount** | **kotlin.Int** |  |  [optional] |
| **pathAssetType** | **kotlin.String** |  |  [optional] |
| **pathName** | **kotlin.String** |  |  [optional] |
| **requiredMetadataAttributes** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | offline, online |



