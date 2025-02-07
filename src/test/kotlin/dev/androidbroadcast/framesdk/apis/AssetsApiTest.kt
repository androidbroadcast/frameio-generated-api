/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dev.androidbroadcast.framesdk.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import dev.androidbroadcast.framesdk.apis.AssetsApi
import dev.androidbroadcast.framesdk.models.AddVersionToAssetRequest
import dev.androidbroadcast.framesdk.models.Asset
import dev.androidbroadcast.framesdk.models.AssetAudio
import dev.androidbroadcast.framesdk.models.AssetSearch
import dev.androidbroadcast.framesdk.models.AssetSearchGetTeamIdParameter
import dev.androidbroadcast.framesdk.models.AssetSubtitle
import dev.androidbroadcast.framesdk.models.BatchCopyAsset200Response
import dev.androidbroadcast.framesdk.models.BatchCopyAssetRequest
import dev.androidbroadcast.framesdk.models.BatchCreateCollaborators200Response
import dev.androidbroadcast.framesdk.models.BatchDeleteAssetRequest
import dev.androidbroadcast.framesdk.models.CopyAssetRequest
import dev.androidbroadcast.framesdk.models.CreateAsset200Response
import dev.androidbroadcast.framesdk.models.CreateAssetRequest
import dev.androidbroadcast.framesdk.models.CreateRealtimeUploadParts200Response
import dev.androidbroadcast.framesdk.models.CreateRealtimeUploadPartsRequest
import dev.androidbroadcast.framesdk.models.DeviceAssetCreateDeprecated409Response
import dev.androidbroadcast.framesdk.models.DeviceAssetCreateDeprecatedRequest
import dev.androidbroadcast.framesdk.models.DeviceAssetCreateDeprecatedRequest1
import dev.androidbroadcast.framesdk.models.GetAssetTypeParameter
import dev.androidbroadcast.framesdk.models.HTTPError
import dev.androidbroadcast.framesdk.models.LibrarySearch

class AssetsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AssetsApi
        //val apiInstance = AssetsApi()

        // to test addVersionToAsset
        should("test addVersionToAsset") {
            // uncomment below to test addVersionToAsset
            //val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
            //val addVersionToAssetRequest : AddVersionToAssetRequest =  // AddVersionToAssetRequest | 
            //val result : Asset = apiInstance.addVersionToAsset(assetId, addVersionToAssetRequest)
            //result shouldBe ("TODO")
        }

        // to test assetSearchGet
        should("test assetSearchGet") {
            // uncomment below to test assetSearchGet
            //val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
            //val filter : kotlin.String = Object // kotlin.String | Custom ES filters to apply to your query
            //val include : kotlin.String = include_example // kotlin.String | 
            //val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Flag to include soft-deleted records in results
            //val opts : kotlin.String = Object // kotlin.String | Additional request options
            //val page : kotlin.Int = 56 // kotlin.Int | The page to retrieve
            //val pageSize : kotlin.Int = 56 // kotlin.Int | The number of results to include in the page
            //val projectId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
            //val properties : kotlin.String = Object // kotlin.String | 
            //val q : kotlin.String = q_example // kotlin.String | Search text
            //val query : kotlin.String = query_example // kotlin.String | Search text
            //val sharedProjects : kotlin.Boolean = true // kotlin.Boolean | 
            //val sort : kotlin.String = sort_example // kotlin.String | Sorting parameters
            //val teamId : AssetSearchGetTeamIdParameter =  // AssetSearchGetTeamIdParameter | 
            //val type : kotlin.String = type_example // kotlin.String | 
            //val result : kotlin.collections.List<Asset> = apiInstance.assetSearchGet(accountId, filter, include, includeDeleted, opts, page, pageSize, projectId, properties, q, query, sharedProjects, sort, teamId, type)
            //result shouldBe ("TODO")
        }

        // to test assetSearchPost
        should("test assetSearchPost") {
            // uncomment below to test assetSearchPost
            //val assetSearch : AssetSearch =  // AssetSearch | Asset search
            //val result : kotlin.collections.List<Asset> = apiInstance.assetSearchPost(assetSearch)
            //result shouldBe ("TODO")
        }

        // to test batchCopyAsset
        should("test batchCopyAsset") {
            // uncomment below to test batchCopyAsset
            //val destinationId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Destination folder `id` - must be in the same folder
            //val batchCopyAssetRequest : BatchCopyAssetRequest = {"batch":[{"id":1},{"id":2}],"copy_comments":"none"} // BatchCopyAssetRequest | An array of batch operations
            //val result : BatchCopyAsset200Response = apiInstance.batchCopyAsset(destinationId, batchCopyAssetRequest)
            //result shouldBe ("TODO")
        }

        // to test batchDeleteAsset
        should("test batchDeleteAsset") {
            // uncomment below to test batchDeleteAsset
            //val batchDeleteAssetRequest : BatchDeleteAssetRequest =  // BatchDeleteAssetRequest | Delete a list of Assets by their ID's
            //val result : BatchCreateCollaborators200Response = apiInstance.batchDeleteAsset(batchDeleteAssetRequest)
            //result shouldBe ("TODO")
        }

        // to test copyAsset
        should("test copyAsset") {
            // uncomment below to test copyAsset
            //val destinationFolder : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Destination folder `id`
            //val copyAssetRequest : CopyAssetRequest =  // CopyAssetRequest | Asset copy request
            //val result : Asset = apiInstance.copyAsset(destinationFolder, copyAssetRequest)
            //result shouldBe ("TODO")
        }

        // to test createAsset
        should("test createAsset") {
            // uncomment below to test createAsset
            //val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
            //val createAssetRequest : CreateAssetRequest = {"name":"my_movie","type":"file","filetype":"video/mp4","auto_version_id":"4386e276-6317-4d8d-b82c-8a16df9b66d2","filesize":80000000} // CreateAssetRequest | While supported, we encourage you to switch from `application/x-ww-form-urlencoded` to `application/json` in order to support future workflows that will only be supported through JSON.  When `is_realtime_upload` is `true`, call must be made in `application/json`.
            //val result : CreateAsset200Response = apiInstance.createAsset(assetId, createAssetRequest)
            //result shouldBe ("TODO")
        }

        // to test createRealtimeUploadParts
        should("test createRealtimeUploadParts") {
            // uncomment below to test createRealtimeUploadParts
            //val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Asset ID
            //val createRealtimeUploadPartsRequest : CreateRealtimeUploadPartsRequest = {"parts":[{"number":1,"size":2000000000,"is_final":false},{"number":2,"size":1500000000,"is_final":false}]} // CreateRealtimeUploadPartsRequest | Enumerates parts that upload URLs should be created for.
            //val result : CreateRealtimeUploadParts200Response = apiInstance.createRealtimeUploadParts(assetId, createRealtimeUploadPartsRequest)
            //result shouldBe ("TODO")
        }

        // to test deleteAsset
        should("test deleteAsset") {
            // uncomment below to test deleteAsset
            //val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
            //val result : Asset = apiInstance.deleteAsset(assetId)
            //result shouldBe ("TODO")
        }

        // to test deviceAssetCreate
        should("test deviceAssetCreate") {
            // uncomment below to test deviceAssetCreate
            //val xClientVersion : kotlin.String = 2.16.4 // kotlin.String | Firmware or software version of a C2C integration. Will be used to determine the correct Device Model configuration for the device when multiple are available. Must be a valid semantic version.    For more on semantic versions, see here: https://semver.org/
            //val deviceAssetCreateDeprecatedRequest : DeviceAssetCreateDeprecatedRequest = {"name":"my_video.mp4","filetype":"video/mp4","is_realtime_upload":true,"channel":0,"offset":-10} // DeviceAssetCreateDeprecatedRequest | While supported, we encourage you to switch from `application/x-ww-form-urlencoded` to `application/json` in order to support future workflows that will only be supported through JSON.  When `is_realtime_upload` is `true`, call must be made in `application/json`.
            //val result : CreateAsset200Response = apiInstance.deviceAssetCreate(xClientVersion, deviceAssetCreateDeprecatedRequest)
            //result shouldBe ("TODO")
        }

        // to test deviceAssetCreateDeprecated
        should("test deviceAssetCreateDeprecated") {
            // uncomment below to test deviceAssetCreateDeprecated
            //val xClientVersion : kotlin.String = 2.16.4 // kotlin.String | Firmware or software version of a C2C integration. Will be used to determine the correct Device Model configuration for the device when multiple are available. Must be a valid semantic version.    For more on semantic versions, see here: https://semver.org/
            //val deviceAssetCreateDeprecatedRequest : DeviceAssetCreateDeprecatedRequest = {"name":"my_video.mp4","filetype":"video/mp4","is_realtime_upload":true,"channel":0,"offset":-10} // DeviceAssetCreateDeprecatedRequest | While supported, we encourage you to switch from `application/x-ww-form-urlencoded` to `application/json` in order to support future workflows that will only be supported through JSON.  When `is_realtime_upload` is `true`, call must be made in `application/json`.
            //val result : CreateAsset200Response = apiInstance.deviceAssetCreateDeprecated(xClientVersion, deviceAssetCreateDeprecatedRequest)
            //result shouldBe ("TODO")
        }

        // to test getAsset
        should("test getAsset") {
            // uncomment below to test getAsset
            //val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
            //val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
            //val type : GetAssetTypeParameter =  // GetAssetTypeParameter | 
            //val result : Asset = apiInstance.getAsset(assetId, includeDeleted, type)
            //result shouldBe ("TODO")
        }

        // to test getAssets
        should("test getAssets") {
            // uncomment below to test getAssets
            //val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
            //val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Include deleted files by passing `true`
            //val include : kotlin.String = include_example // kotlin.String | Include additional \"pre-loads\" for related resources
            //val sort : kotlin.String = sort_example // kotlin.String | The sorting order for the returned list of Assets. Supporting chaining like `comment_count,id`. Also supports reversing the order with `-` i.e. `-comment_count,id` or `filetype,-id`.
            //val page : kotlin.Double = 8.14 // kotlin.Double | The current page number in this Paginated Response
            //val pageSize : kotlin.Double = 8.14 // kotlin.Double | Number of pages in this Paginated Response
            //val result : kotlin.collections.List<Asset> = apiInstance.getAssets(assetId, includeDeleted, include, sort, page, pageSize)
            //result shouldBe ("TODO")
        }

        // to test getAudio
        should("test getAudio") {
            // uncomment below to test getAudio
            //val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
            //val result : AssetAudio = apiInstance.getAudio(assetId)
            //result shouldBe ("TODO")
        }

        // to test getSubtitles
        should("test getSubtitles") {
            // uncomment below to test getSubtitles
            //val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
            //val result : AssetSubtitle = apiInstance.getSubtitles(assetId)
            //result shouldBe ("TODO")
        }

        // to test librarySearchGet
        should("test librarySearchGet") {
            // uncomment below to test librarySearchGet
            //val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
            //val filter : kotlin.String = Object // kotlin.String | Custom ES filters to apply to your query
            //val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Flag to include soft-deleted records in results
            //val opts : kotlin.String = Object // kotlin.String | Additional request options
            //val page : kotlin.Int = 56 // kotlin.Int | The page to retrieve
            //val pageSize : kotlin.Int = 56 // kotlin.Int | The number of results to include in the page
            //val q : kotlin.String = q_example // kotlin.String | Search text
            //val query : kotlin.String = query_example // kotlin.String | Search text
            //val sort : kotlin.String = sort_example // kotlin.String | Sorting parameters
            //val result : kotlin.collections.List<Asset> = apiInstance.librarySearchGet(accountId, filter, includeDeleted, opts, page, pageSize, q, query, sort)
            //result shouldBe ("TODO")
        }

        // to test librarySearchPost
        should("test librarySearchPost") {
            // uncomment below to test librarySearchPost
            //val librarySearch : LibrarySearch =  // LibrarySearch | Advanced asset search
            //val result : kotlin.collections.List<Asset> = apiInstance.librarySearchPost(librarySearch)
            //result shouldBe ("TODO")
        }

        // to test moveAsset
        should("test moveAsset") {
            // uncomment below to test moveAsset
            //val destinationFolder : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Destination folder `id`
            //val copyAssetRequest : CopyAssetRequest =  // CopyAssetRequest | Asset copy request
            //val result : Asset = apiInstance.moveAsset(destinationFolder, copyAssetRequest)
            //result shouldBe ("TODO")
        }

        // to test unversionAsset
        should("test unversionAsset") {
            // uncomment below to test unversionAsset
            //val assetId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | 
            //val result : Asset = apiInstance.unversionAsset(assetId)
            //result shouldBe ("TODO")
        }

        // to test updateAsset
        should("test updateAsset") {
            // uncomment below to test updateAsset
            //val assetId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Asset ID
            //val result : Asset = apiInstance.updateAsset(assetId)
            //result shouldBe ("TODO")
        }

    }
}
