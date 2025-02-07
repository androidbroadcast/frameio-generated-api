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
 * @param archivalStorage 
 * @param customBrandedEmails 
 * @param customBrandedPresentations 
 * @param reelPlayer 
 * @param secureSharing 
 * @param sessionBasedWatermarking 
 * @param teamOnlyComments 
 */
@Serializable

data class AvailableFeatures (

    @SerialName(value = "archival_storage") val archivalStorage: kotlin.Boolean? = null,

    @SerialName(value = "custom_branded_emails") val customBrandedEmails: kotlin.Boolean? = null,

    @SerialName(value = "custom_branded_presentations") val customBrandedPresentations: kotlin.Boolean? = null,

    @SerialName(value = "reel_player") val reelPlayer: kotlin.Boolean? = null,

    @SerialName(value = "secure_sharing") val secureSharing: kotlin.Boolean? = null,

    @SerialName(value = "session_based_watermarking") val sessionBasedWatermarking: kotlin.Boolean? = null,

    @SerialName(value = "team_only_comments") val teamOnlyComments: kotlin.Boolean? = null

) {


}

