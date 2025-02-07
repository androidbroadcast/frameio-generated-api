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

package dev.androidbroadcast.framesdk.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import dev.androidbroadcast.framesdk.models.CreateRealtimeUploadPartsRequest
import dev.androidbroadcast.framesdk.models.CreateRealtimeUploadPartsRequestPartsInner

class CreateRealtimeUploadPartsRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateRealtimeUploadPartsRequest
        //val modelInstance = CreateRealtimeUploadPartsRequest()

        // to test the property `parts` - List of file upload parts to register with Frame.
        should("test parts") {
            // uncomment below to test the property
            //modelInstance.parts shouldBe ("TODO")
        }

        // to test the property `assetName` - Updates the asset name if only `extension` was supplied to assetCreate, and the default name is still in use.  Otherwise, will be ignored.
        should("test assetName") {
            // uncomment below to test the property
            //modelInstance.assetName shouldBe ("TODO")
        }

        // to test the property `assetFilesize` - The full filesize for the upload in bytes. This field is required when an object in `parts` has `is_final` set to `true`.  Must be no more than 5 TiB.
        should("test assetFilesize") {
            // uncomment below to test the property
            //modelInstance.assetFilesize shouldBe ("TODO")
        }

    }
}
