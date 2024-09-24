
# ReviewLink

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Name of the Review Link |  |
| **accessControl** | [**ShareableEntityAccessControl**](ShareableEntityAccessControl.md) |  |  [optional] |
| **availableFeatures** | **kotlin.String** |  |  [optional] [readonly] |
| **allowApprovals** | **kotlin.Boolean** | Enable/disable changing an Asset&#39;s status by non-Collaborator/Team Members via the Review Link. |  [optional] |
| **bundleCount** | **kotlin.Int** |  |  [optional] [readonly] |
| **currentVersionOnly** | **kotlin.Boolean** | Show **only** the most recent version of Assets in the Review Link |  [optional] |
| **deletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Deletion time of the Review Link |  [optional] [readonly] |
| **enableDownloading** | **kotlin.Boolean** | Enable or disable downloading on this Review Link. The default depends on whether the auth used to create this review link allows for this or not. |  [optional] |
| **expiresAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Expiration time of the Review Link |  [optional] [readonly] |
| **enableComments** | **kotlin.Boolean** |  |  [optional] |
| **folderItemCount** | **kotlin.Int** |  |  [optional] [readonly] |
| **isActive** | **kotlin.Boolean** | Disable an Review Link by switching this from &#x60;true&#x60; -&gt; &#x60;false&#x60;, and vice-versa. |  [optional] |
| **notifyOnView** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **password** | **kotlin.String** | Actually a &#x60;passphrase&#x60;, this is an additional security measure for a second layer of security on your Review Links.    Supports alphanumeric input. |  [optional] |
| **hasPassword** | **kotlin.Boolean** | If false, the Review Link has no passphrase |  [optional] [readonly] |
| **id** | **kotlin.String** | UUID of the Review Link |  [optional] [readonly] |
| **insertedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] [readonly] |
| **isAutoplay** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **itemCount** | **kotlin.Int** | Number of items included at the root of the Review Link |  [optional] [readonly] |
| **items** | [**kotlin.collections.List&lt;ReviewLinkItem&gt;**](ReviewLinkItem.md) |  |  [optional] [readonly] |
| **ownerId** | **kotlin.String** |  |  [optional] [readonly] |
| **projectId** | **kotlin.String** |  |  [optional] [readonly] |
| **reviewerCount** | **kotlin.Int** |  |  [optional] [readonly] |
| **shortUrl** | **kotlin.String** |  |  [optional] [readonly] |
| **owner** | [**User**](User.md) |  |  [optional] |
| **project** | [**Project**](Project.md) |  |  [optional] |
| **team** | [**Team**](Team.md) |  |  [optional] |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] [readonly] |
| **viewCount** | **kotlin.Int** |  |  [optional] [readonly] |
| **watermarkUserInput** | **kotlin.String** |  |  [optional] |



