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

import dev.androidbroadcast.framesdk.models.User

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param `annotation` 
 * @param completed 
 * @param completedAt 
 * @param completerId 
 * @param hasReplies 
 * @param id 
 * @param likeCount 
 * @param owner 
 * @param ownerId 
 * @param text 
 * @param timestamp 
 */
@Serializable

data class Comment (

    @SerialName(value = "annotation") val `annotation`: kotlin.String? = null,

    @SerialName(value = "completed") val completed: kotlin.Boolean? = null,

    @SerialName(value = "completed_at") val completedAt: kotlin.String? = null,

    @SerialName(value = "completer_id") val completerId: kotlin.String? = null,

    @SerialName(value = "has_replies") val hasReplies: kotlin.Boolean? = null,

    @SerialName(value = "id") val id: kotlin.String? = null,

    @SerialName(value = "like_count") val likeCount: kotlin.Int? = null,

    @SerialName(value = "owner") val owner: User? = null,

    @SerialName(value = "owner_id") val ownerId: kotlin.String? = null,

    @SerialName(value = "text") val text: kotlin.String? = null,

    @SerialName(value = "timestamp") val timestamp: kotlin.Int? = null

) {


}

