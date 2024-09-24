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
 * @param canDownload 
 * @param canModifyTemplate 
 * @param canPublicSharePresentation 
 * @param canPublicShareReviewLink 
 * @param canShareDownloadablePresentation 
 * @param canShareDownloadableReviewLink 
 * @param canShareUnwatermarkedPresentation 
 * @param canShareUnwatermarkedReviewLink 
 */
@Serializable

data class UserPermissions (

    @SerialName(value = "can_download") val canDownload: kotlin.Boolean? = null,

    @SerialName(value = "can_modify_template") val canModifyTemplate: kotlin.Boolean? = null,

    @SerialName(value = "can_public_share_presentation") val canPublicSharePresentation: kotlin.Boolean? = null,

    @SerialName(value = "can_public_share_review_link") val canPublicShareReviewLink: kotlin.Boolean? = null,

    @SerialName(value = "can_share_downloadable_presentation") val canShareDownloadablePresentation: kotlin.Boolean? = null,

    @SerialName(value = "can_share_downloadable_review_link") val canShareDownloadableReviewLink: kotlin.Boolean? = null,

    @SerialName(value = "can_share_unwatermarked_presentation") val canShareUnwatermarkedPresentation: kotlin.Boolean? = null,

    @SerialName(value = "can_share_unwatermarked_review_link") val canShareUnwatermarkedReviewLink: kotlin.Boolean? = null

) {


}

