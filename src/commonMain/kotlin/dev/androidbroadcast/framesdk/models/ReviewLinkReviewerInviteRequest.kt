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
 * @param email Email
 * @param message 
 */
@Serializable

data class ReviewLinkReviewerInviteRequest (

    /* Email */
    @SerialName(value = "email") @Required val email: kotlin.String,

    @SerialName(value = "message") val message: kotlin.String? = null

) {


}

