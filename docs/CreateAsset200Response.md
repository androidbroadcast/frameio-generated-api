
# CreateAsset200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The ID for this asset, can be used in places like &#x60;https://app.frame.io/player/:id&#x60; to go directly to an asset. |  |
| **name** | **kotlin.String** | Represents the name of the asset (filename). |  |
| **accountId** | **kotlin.String** | Account ID this asset belongs to |  [optional] |
| **archiveFrom** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **archiveScheduledAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **archiveStatus** | **kotlin.String** |  |  [optional] |
| **archivedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **assetType** | [**inline**](#AssetType) |  |  [optional] |
| **bundle** | **kotlin.Boolean** |  |  [optional] |
| **bundleView** | **kotlin.String** |  |  [optional] |
| **coverAssetId** | **kotlin.String** |  |  [optional] |
| **creator** | [**User**](User.md) |  |  [optional] |
| **frames** | **kotlin.Int** | The number of frames in this asset (really only useful for videos) |  [optional] |
| **hardDeletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Indicates the datetime this asset was hard deleted (30 days after soft-deletion) |  [optional] |
| **index** | **kotlin.Float** | Represented within the Frame.io UI as the \&quot;custom sort order\&quot; within the grid view |  [optional] |
| **isBundleChild** | **kotlin.Boolean** | Indicates whether an asset is the child of a bundle asset |  [optional] |
| **isHlsRequired** | **kotlin.Boolean** | Indicates whether HLS is required to playback this asset |  [optional] |
| **isSessionWatermarked** | **kotlin.Boolean** | Indicates if this asset is subject to Session Based Watermarking (WMID) |  [optional] |
| **itemCount** | **kotlin.Int** | Applies only to folders and version stacks, indicates the number of items in that container |  [optional] |
| **label** | [**AssetLabel**](AssetLabel.md) |  |  [optional] |
| **metadata** | **kotlin.String** |  |  [optional] |
| **metadataFlags** | [**MetadataFlags**](MetadataFlags.md) |  |  [optional] |
| **original** | **kotlin.String** | This is a URL to download the original asset, or in the event it&#39;s subject to watermarking but you still have permission to download - an asset that will be watermarked just-in-time as you download it |  [optional] |
| **parentAssetId** | **kotlin.String** | The folder that this asset is in |  [optional] |
| **projectId** | **kotlin.String** | The project ID that this asset belongs to |  [optional] |
| **properties** | [**OneOfLessThanGreaterThan**](.md) | Accepts arbitrary key/value pairs for storing information on an asset |  [optional] |
| **requiredTranscodes** | [**RequiredTranscodes**](RequiredTranscodes.md) |  |  [optional] |
| **teamId** | **kotlin.String** |  |  [optional] |
| **userPermissions** | [**UserPermissions**](UserPermissions.md) |  |  [optional] |
| **type** | [**inline**](#Type) |  |  [optional] |
| **viewCount** | **kotlin.Int** | Not a very helpful number, this really just represents the number of times this asset has been requested via the API |  [optional] |


<a id="AssetType"></a>
## Enum: asset_type
| Name | Value |
| ---- | ----- |
| assetType | document, image, stream |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | file, folder, version_stack, bundle |



