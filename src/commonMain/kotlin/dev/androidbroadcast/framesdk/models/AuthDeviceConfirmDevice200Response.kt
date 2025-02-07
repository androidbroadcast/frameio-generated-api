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
 * @param accessToken This is your key to the rest of the Frame.io backend. We will need to add this to the header of the rest of the requests we are going to make in these tutorials.
 * @param expiresIn The number of seconds until `access_token` expires. After the token's time is up, it will need to be refreshed, which we will go over in a future tutorial.
 * @param refreshToken A token we can use to manage our access_token. It will most commonly be used to refresh our authorization, but it can also be used to revoke it.
 * @param tokenType Will always be bearer for the C2C API, and is not actionable.
 */
@Serializable

data class AuthDeviceConfirmDevice200Response (

    /* This is your key to the rest of the Frame.io backend. We will need to add this to the header of the rest of the requests we are going to make in these tutorials. */
    @SerialName(value = "access_token") @Required val accessToken: kotlin.String,

    /* The number of seconds until `access_token` expires. After the token's time is up, it will need to be refreshed, which we will go over in a future tutorial. */
    @SerialName(value = "expires_in") @Required val expiresIn: kotlin.Double,

    /* A token we can use to manage our access_token. It will most commonly be used to refresh our authorization, but it can also be used to revoke it. */
    @SerialName(value = "refresh_token") @Required val refreshToken: kotlin.String,

    /* Will always be bearer for the C2C API, and is not actionable. */
    @SerialName(value = "token_type") @Required val tokenType: AuthDeviceConfirmDevice200Response.TokenType

) {

    /**
     * Will always be bearer for the C2C API, and is not actionable.
     *
     * Values: bearer
     */
    @Serializable
    enum class TokenType(val value: kotlin.String) {
        @SerialName(value = "bearer") bearer("bearer");
    }

}

