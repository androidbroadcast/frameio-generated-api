
# GetGroupedNotifications200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] [readonly] |
| **linkTo** | [**kotlin.collections.List&lt;GetGroupedNotifications200ResponseLinkToInner&gt;**](GetGroupedNotifications200ResponseLinkToInner.md) |  |  [optional] |
| **userCount** | **kotlin.Int** |  |  [optional] |
| **notificationIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **id** | **kotlin.String** | First notification id |  [optional] |
| **textElements** | [**GetGroupedNotifications200ResponseTextElements**](GetGroupedNotifications200ResponseTextElements.md) |  |  [optional] |
| **thumbs** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **status** | [**inline**](#Status) | Notification status |  [optional] |
| **assetType** | [**inline**](#AssetType) |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | read, unread |


<a id="AssetType"></a>
## Enum: asset_type
| Name | Value |
| ---- | ----- |
| assetType | DocumentAsset, VideoAsset |



