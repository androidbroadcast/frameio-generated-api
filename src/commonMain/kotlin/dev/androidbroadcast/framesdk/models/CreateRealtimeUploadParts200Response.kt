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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param uploadUrls Array of AWS S3 presigned upload PUT URLs.  Returned in the same order as the `parts` field of the request.
 */
@Serializable

data class CreateRealtimeUploadParts200Response (

    /* Array of AWS S3 presigned upload PUT URLs.  Returned in the same order as the `parts` field of the request. */
    @SerialName(value = "upload_urls") @Required val uploadUrls: kotlin.collections.List<kotlin.String>

) {


}

