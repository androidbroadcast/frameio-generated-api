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
 * @param number The part number/index, starting at 1. Part numbers may be skipped, and may be uploaded in any order, but will be used to concatinate the final file in sequentual order.   Cannot be greater than 10,000 (the maximum number of parts that AWS allows).
 * @param propertySize The size of the part in bytes. If the size does not abide by the [AWS Multi-Part upload restrictions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/qfacts.html), an error will be returned.  For instance, must be greater than or equal to 5 MiB, (5,242,880 bytes) is `is_final` is not t`true`.
 * @param isFinal Whether this is the final part of the file.
 */
@Serializable

data class CreateRealtimeUploadPartsRequestPartsInner (

    /* The part number/index, starting at 1. Part numbers may be skipped, and may be uploaded in any order, but will be used to concatinate the final file in sequentual order.   Cannot be greater than 10,000 (the maximum number of parts that AWS allows). */
    @SerialName(value = "number") @Required val number: kotlin.Int,

    /* The size of the part in bytes. If the size does not abide by the [AWS Multi-Part upload restrictions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/qfacts.html), an error will be returned.  For instance, must be greater than or equal to 5 MiB, (5,242,880 bytes) is `is_final` is not t`true`. */
    @SerialName(value = "size") @Required val propertySize: kotlin.Int,

    /* Whether this is the final part of the file. */
    @SerialName(value = "is_final") @Required val isFinal: kotlin.Boolean

) {


}

