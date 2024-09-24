
# ProjectDeviceChannel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | **kotlin.String** |  |  [optional] |
| **id** | **kotlin.String** |  |  [optional] |
| **actorId** | **kotlin.String** |  |  [optional] |
| **assetType** | [**inline**](#AssetType) |  |  [optional] |
| **deviceId** | **kotlin.String** |  |  [optional] |
| **externalIndex** | **kotlin.Double** |  |  [optional] |
| **insertedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **name** | **kotlin.String** | Auto-generated name, based on the device model |  [optional] |
| **projectId** | **kotlin.String** | The Project ID that this device is linked to |  [optional] |
| **projectDeviceId** | **kotlin.String** |  |  [optional] |
| **realTimeLoggingCapable** | **kotlin.Boolean** |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |


<a id="AssetType"></a>
## Enum: asset_type
| Name | Value |
| ---- | ----- |
| assetType | audio, video, data |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | offline, online |



