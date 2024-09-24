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
 * @param accountRead 
 * @param actionCreate 
 * @param actionDelete 
 * @param actionRead 
 * @param actionUpdate 
 * @param assetCreate 
 * @param assetDelete 
 * @param assetRead 
 * @param assetUpdate 
 * @param auditlogRead 
 * @param commentCreate 
 * @param commentDelete 
 * @param commentRead 
 * @param commentUpdate 
 * @param deviceConnect 
 * @param id 
 * @param offline 
 * @param presentationCreate 
 * @param presentationDelete 
 * @param presentationRead 
 * @param presentationUpdate 
 * @param projectCreate 
 * @param projectDelete 
 * @param projectRead 
 * @param projectUpdate 
 * @param reviewlinkCreate 
 * @param reviewlinkDelete 
 * @param reviewlinkRead 
 * @param reviewlinkUpdate 
 * @param teamCreate 
 * @param teamRead 
 * @param teamUpdate 
 * @param webhookCreate 
 * @param webhookDelete 
 * @param webhookRead 
 * @param webhookUpdate 
 */
@Serializable

data class ProjectDeviceAuthorizationAuthorizationScopes (

    @SerialName(value = "account_read") @Required val accountRead: kotlin.Boolean,

    @SerialName(value = "action_create") @Required val actionCreate: kotlin.Boolean,

    @SerialName(value = "action_delete") @Required val actionDelete: kotlin.Boolean,

    @SerialName(value = "action_read") @Required val actionRead: kotlin.Boolean,

    @SerialName(value = "action_update") @Required val actionUpdate: kotlin.Boolean,

    @SerialName(value = "asset_create") @Required val assetCreate: kotlin.Boolean,

    @SerialName(value = "asset_delete") @Required val assetDelete: kotlin.Boolean,

    @SerialName(value = "asset_read") @Required val assetRead: kotlin.Boolean,

    @SerialName(value = "asset_update") @Required val assetUpdate: kotlin.Boolean,

    @SerialName(value = "auditlog_read") @Required val auditlogRead: kotlin.Boolean,

    @SerialName(value = "comment_create") @Required val commentCreate: kotlin.Boolean,

    @SerialName(value = "comment_delete") @Required val commentDelete: kotlin.Boolean,

    @SerialName(value = "comment_read") @Required val commentRead: kotlin.Boolean,

    @SerialName(value = "comment_update") @Required val commentUpdate: kotlin.Boolean,

    @SerialName(value = "device_connect") @Required val deviceConnect: kotlin.Boolean,

    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "offline") @Required val offline: kotlin.Boolean,

    @SerialName(value = "presentation_create") @Required val presentationCreate: kotlin.Boolean,

    @SerialName(value = "presentation_delete") @Required val presentationDelete: kotlin.Boolean,

    @SerialName(value = "presentation_read") @Required val presentationRead: kotlin.Boolean,

    @SerialName(value = "presentation_update") @Required val presentationUpdate: kotlin.Boolean,

    @SerialName(value = "project_create") @Required val projectCreate: kotlin.Boolean,

    @SerialName(value = "project_delete") @Required val projectDelete: kotlin.Boolean,

    @SerialName(value = "project_read") @Required val projectRead: kotlin.Boolean,

    @SerialName(value = "project_update") @Required val projectUpdate: kotlin.Boolean,

    @SerialName(value = "reviewlink_create") @Required val reviewlinkCreate: kotlin.Boolean,

    @SerialName(value = "reviewlink_delete") @Required val reviewlinkDelete: kotlin.Boolean,

    @SerialName(value = "reviewlink_read") @Required val reviewlinkRead: kotlin.Boolean,

    @SerialName(value = "reviewlink_update") @Required val reviewlinkUpdate: kotlin.Boolean,

    @SerialName(value = "team_create") @Required val teamCreate: kotlin.Boolean,

    @SerialName(value = "team_read") @Required val teamRead: kotlin.Boolean,

    @SerialName(value = "team_update") @Required val teamUpdate: kotlin.Boolean,

    @SerialName(value = "webhook_create") @Required val webhookCreate: kotlin.Boolean,

    @SerialName(value = "webhook_delete") @Required val webhookDelete: kotlin.Boolean,

    @SerialName(value = "webhook_read") @Required val webhookRead: kotlin.Boolean,

    @SerialName(value = "webhook_update") @Required val webhookUpdate: kotlin.Boolean

) {


}

