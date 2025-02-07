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

import dev.androidbroadcast.framesdk.models.ProjectDeviceAuthorizationAuthorization
import dev.androidbroadcast.framesdk.models.ProjectDeviceAuthorizationProject
import dev.androidbroadcast.framesdk.models.ProjectDeviceChannel

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param type 
 * @param assetType 
 * @param authorization 
 * @param channels 
 * @param creatorId 
 * @param deviceId 
 * @param id 
 * @param insertedAt 
 * @param lastSeenAt 
 * @param name 
 * @param project 
 * @param projectId 
 * @param status 
 * @param timezone 
 * @param updatedAt 
 * @param deletedAt 
 */
@Serializable

data class ProjectDeviceAuthorization (

    @SerialName(value = "_type") @Required val type: ProjectDeviceAuthorization.Type,

    @SerialName(value = "asset_type") @Required val assetType: ProjectDeviceAuthorization.AssetType,

    @SerialName(value = "authorization") @Required val authorization: ProjectDeviceAuthorizationAuthorization,

    @SerialName(value = "channels") @Required val channels: kotlin.collections.Set<ProjectDeviceChannel>,

    @SerialName(value = "creator_id") @Required val creatorId: kotlin.String,

    @SerialName(value = "device_id") @Required val deviceId: kotlin.String,

    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "inserted_at") @Required val insertedAt: kotlinx.datetime.Instant,

    @SerialName(value = "last_seen_at") @Required val lastSeenAt: kotlinx.datetime.Instant,

    @SerialName(value = "name") @Required val name: kotlin.String,

    @SerialName(value = "project") @Required val project: ProjectDeviceAuthorizationProject,

    @SerialName(value = "project_id") @Required val projectId: kotlin.String,

    @SerialName(value = "status") @Required val status: ProjectDeviceAuthorization.Status,

    @SerialName(value = "timezone") @Required val timezone: kotlin.String,

    @SerialName(value = "updated_at") @Required val updatedAt: kotlinx.datetime.Instant,

    @SerialName(value = "deleted_at") val deletedAt: kotlinx.datetime.Instant? = null

) {

    /**
     * 
     *
     * Values: project_device
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "project_device") project_device("project_device");
    }
    /**
     * 
     *
     * Values: video,audio,`data`
     */
    @Serializable
    enum class AssetType(val value: kotlin.String) {
        @SerialName(value = "video") video("video"),
        @SerialName(value = "audio") audio("audio"),
        @SerialName(value = "data") `data`("data");
    }
    /**
     * 
     *
     * Values: online,offline,paused
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "online") online("online"),
        @SerialName(value = "offline") offline("offline"),
        @SerialName(value = "paused") paused("paused");
    }

}

