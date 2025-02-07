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
 * @param order 
 * @param type 
 * @param `value` 
 */
@Serializable

data class SessionWatermarkDataPoint (

    @SerialName(value = "order") val order: kotlin.Int? = null,

    @SerialName(value = "type") val type: SessionWatermarkDataPoint.Type? = null,

    @SerialName(value = "value") val `value`: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: email,username,ip_address,timestamp,custom_text,user_input
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "email") email("email"),
        @SerialName(value = "username") username("username"),
        @SerialName(value = "ip_address") ip_address("ip_address"),
        @SerialName(value = "timestamp") timestamp("timestamp"),
        @SerialName(value = "custom_text") custom_text("custom_text"),
        @SerialName(value = "user_input") user_input("user_input");
    }

}

