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

import dev.androidbroadcast.framesdk.models.SMPTETimeRepresentationRate

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param smpteTimecode Timecode represented as a SMPTE string,    Learn more about timecode [here](https://workflow.frame.io/guide/timecode)!
 * @param rate 
 */
@Serializable

data class SMPTETimeRepresentation (

    /* Timecode represented as a SMPTE string,    Learn more about timecode [here](https://workflow.frame.io/guide/timecode)! */
    @SerialName(value = "smpte_timecode") val smpteTimecode: kotlin.String? = null,

    @SerialName(value = "rate") val rate: SMPTETimeRepresentationRate? = null

) {


}

