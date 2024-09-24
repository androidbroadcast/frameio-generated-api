
# Project

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **archiveStatus** | [**inline**](#ArchiveStatus) | Archival status for this Project |  [optional] |
| **archivedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | When a Project was archived |  [optional] |
| **archivedFileCount** | **kotlin.Int** |  |  [optional] |
| **archivedStorage** | **kotlin.Int** |  |  [optional] |
| **collaboratorCount** | **kotlin.Int** |  |  [optional] |
| **deletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | If deleted, when this Project was deleted |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **fileCount** | **kotlin.Int** |  |  [optional] |
| **folderCount** | **kotlin.Int** |  |  [optional] |
| **id** | **kotlin.String** |  |  [optional] |
| **ignoreArchive** | **kotlin.Boolean** |  |  [optional] |
| **insertedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | When was this Project created |  [optional] |
| **inviteUrl** | **kotlin.String** |  |  [optional] |
| **name** | **kotlin.String** | Name of this Project |  [optional] |
| **ownerId** | **kotlin.String** |  |  [optional] |
| **&#x60;private&#x60;** | **kotlin.Boolean** |  |  [optional] |
| **projectPreferences** | [**ProjectPreferences**](ProjectPreferences.md) |  |  [optional] |
| **readOnly** | **kotlin.Boolean** |  |  [optional] |
| **rootAsset** | [**Asset**](Asset.md) |  |  [optional] |
| **rootAssetId** | **kotlin.String** |  |  [optional] |
| **shared** | **kotlin.Boolean** |  |  [optional] |
| **storage** | **kotlin.Int** |  |  [optional] |
| **team** | [**Team**](Team.md) |  |  [optional] |
| **teamId** | **kotlin.String** |  |  [optional] |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **userPermissions** | [**UserPermissions**](UserPermissions.md) |  |  [optional] |
| **userPreferences** | [**ProjectPreferences**](ProjectPreferences.md) |  |  [optional] |
| **watermark** | [**Watermark**](Watermark.md) |  |  [optional] |


<a id="ArchiveStatus"></a>
## Enum: archive_status
| Name | Value |
| ---- | ----- |
| archiveStatus | standard, archiving, unarchiving, archived |



