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
 * @param id The ID for this asset, can be used in places like `https://app.frame.io/player/:id` to go directly to an asset.
 * @param name Represents the name of the asset (filename).
 */
@Serializable

data class RealtimeAssetResponse (

    /* The ID for this asset, can be used in places like `https://app.frame.io/player/:id` to go directly to an asset. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* Represents the name of the asset (filename). */
    @SerialName(value = "name") @Required val name: kotlin.String

) {


}

