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
 * @param status 
 */
@Serializable

data class HealthCheck200Response (

    @SerialName(value = "status") @Required val status: HealthCheck200Response.Status

) {

    /**
     * 
     *
     * Values: ok
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "ok") ok("ok");
    }

}

