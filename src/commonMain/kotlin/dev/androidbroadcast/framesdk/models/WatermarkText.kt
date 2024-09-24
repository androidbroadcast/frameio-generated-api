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
 * @param alpha 
 * @param lines 
 * @param position 
 */
@Serializable

data class WatermarkText (

    @SerialName(value = "alpha") val alpha: kotlin.Double? = (0.5).toDouble(),

    @SerialName(value = "lines") val lines: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "position") val position: WatermarkText.Position? = Position.top

) {

    /**
     * 
     *
     * Values: top,center,bottom
     */
    @Serializable
    enum class Position(val value: kotlin.String) {
        @SerialName(value = "top") top("top"),
        @SerialName(value = "center") center("center"),
        @SerialName(value = "bottom") bottom("bottom");
    }

}

