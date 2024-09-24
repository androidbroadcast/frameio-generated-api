
# ProjectDeviceAuthorization

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) |  |  |
| **assetType** | [**inline**](#AssetType) |  |  |
| **authorization** | [**ProjectDeviceAuthorizationAuthorization**](ProjectDeviceAuthorizationAuthorization.md) |  |  |
| **channels** | [**kotlin.collections.Set&lt;ProjectDeviceChannel&gt;**](ProjectDeviceChannel.md) |  |  |
| **creatorId** | **kotlin.String** |  |  |
| **deviceId** | **kotlin.String** |  |  |
| **id** | **kotlin.String** |  |  |
| **insertedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  |
| **lastSeenAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **project** | [**ProjectDeviceAuthorizationProject**](ProjectDeviceAuthorizationProject.md) |  |  |
| **projectId** | **kotlin.String** |  |  |
| **status** | [**inline**](#Status) |  |  |
| **timezone** | **kotlin.String** |  |  |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  |
| **deletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |


<a id="Type"></a>
## Enum: _type
| Name | Value |
| ---- | ----- |
| type | project_device |


<a id="AssetType"></a>
## Enum: asset_type
| Name | Value |
| ---- | ----- |
| assetType | video, audio, data |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | online, offline, paused |



