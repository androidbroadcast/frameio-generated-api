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
 * @param type 
 * @param id 
 * @param subtitleTracks 
 */
@Serializable

data class AssetSubtitle (

    @SerialName(value = "_type") val type: AssetSubtitle.Type? = null,

    @SerialName(value = "id") val id: kotlin.String? = null,

    @SerialName(value = "subtitle_tracks") val subtitleTracks: kotlin.collections.List<kotlin.String>? = null

) {

    /**
     * 
     *
     * Values: asset_subtitle
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "asset_subtitle") asset_subtitle("asset_subtitle");
    }

}

