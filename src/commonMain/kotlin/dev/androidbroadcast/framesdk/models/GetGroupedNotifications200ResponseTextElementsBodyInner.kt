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
 * @param format 
 * @param `value` 
 * @param status 
 */
@Serializable

data class GetGroupedNotifications200ResponseTextElementsBodyInner (

    @SerialName(value = "type") val type: GetGroupedNotifications200ResponseTextElementsBodyInner.Type? = null,

    @SerialName(value = "format") val format: GetGroupedNotifications200ResponseTextElementsBodyInner.Format? = null,

    @SerialName(value = "value") val `value`: GetGroupedNotifications200ResponseTextElementsBodyInner.`Value`? = null,

    @SerialName(value = "status") val status: GetGroupedNotifications200ResponseTextElementsBodyInner.Status? = null

) {

    /**
     * 
     *
     * Values: status
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "status") status("status");
    }
    /**
     * 
     *
     * Values: plain_text,strong
     */
    @Serializable
    enum class Format(val value: kotlin.String) {
        @SerialName(value = "plain_text") plain_text("plain_text"),
        @SerialName(value = "strong") strong("strong");
    }
    /**
     * 
     *
     * Values: In_Progress,Approved,Needs_Review
     */
    @Serializable
    enum class `Value`(val value: kotlin.String) {
        @SerialName(value = "In Progress") In_Progress("In Progress"),
        @SerialName(value = "Approved") Approved("Approved"),
        @SerialName(value = "Needs Review") Needs_Review("Needs Review");
    }
    /**
     * 
     *
     * Values: in_progress,approved,needs_review
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "status_in_progress") in_progress("status_in_progress"),
        @SerialName(value = "status_approved") approved("status_approved"),
        @SerialName(value = "status_needs_review") needs_review("status_needs_review");
    }

}

