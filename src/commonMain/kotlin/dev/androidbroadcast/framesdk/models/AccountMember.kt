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
 * @param acceptedAt 
 * @param accountId 
 * @param declinedAt 
 * @param deletedAt 
 * @param insertedAt 
 * @param role 
 * @param updatedAt 
 * @param userId 
 */
@Serializable

data class AccountMember (

    @SerialName(value = "accepted_at") val acceptedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "account_id") val accountId: kotlin.String? = null,

    @SerialName(value = "declined_at") val declinedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "deleted_at") val deletedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "inserted_at") val insertedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "role") val role: AccountMember.Role? = null,

    @SerialName(value = "updated_at") val updatedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "user_id") val userId: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: admin,billing_manager,account_manager,member
     */
    @Serializable
    enum class Role(val value: kotlin.String) {
        @SerialName(value = "admin") admin("admin"),
        @SerialName(value = "billing_manager") billing_manager("billing_manager"),
        @SerialName(value = "account_manager") account_manager("account_manager"),
        @SerialName(value = "member") member("member");
    }

}

