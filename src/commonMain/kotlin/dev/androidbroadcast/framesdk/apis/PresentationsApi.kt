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

package dev.androidbroadcast.framesdk.apis

import dev.androidbroadcast.framesdk.models.CreatePresentationRequest
import dev.androidbroadcast.framesdk.models.HTTPError
import dev.androidbroadcast.framesdk.models.Presentation
import dev.androidbroadcast.framesdk.models.UpdatePresentationRequest

import dev.androidbroadcast.framesdk.infrastructure.*
import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

open class PresentationsApi : ApiClient {

    constructor(
        baseUrl: String = ApiClient.BASE_URL,
        httpClientEngine: HttpClientEngine? = null,
        httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
        jsonSerializer: Json = ApiClient.JSON_DEFAULT
    ) : super(baseUrl = baseUrl, httpClientEngine = httpClientEngine, httpClientConfig = httpClientConfig, jsonBlock = jsonSerializer)

    constructor(
        baseUrl: String,
        httpClient: HttpClient
    ): super(baseUrl = baseUrl, httpClient = httpClient)

    /**
     * Create a Presentation Link for an asset
     * Create a new Presentation Link
     * @param assetId Asset ID
     * @param createPresentationRequest Presentation to create (optional)
     * @return Presentation
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun createPresentation(assetId: kotlin.String, createPresentationRequest: CreatePresentationRequest? = null): HttpResponse<Presentation> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = createPresentationRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/v2/assets/{asset_id}/presentations".replace("{" + "asset_id" + "}", "$assetId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * Delete a Presentation
     * Delete a given Presentation Link
     * @param presentationId Presentation Link ID
     * @return Presentation
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun deletePresentation(presentationId: kotlin.String): HttpResponse<Presentation> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/v2/presentations/{presentation_id}".replace("{" + "presentation_id" + "}", "$presentationId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get Presentation Links for a particular asset
     * Get a paginated list of Presentation Links attached to a particular asset ID
     * @param assetId Asset ID
     * @return kotlin.collections.List<Presentation>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getAssetPresentations(assetId: kotlin.String): HttpResponse<kotlin.collections.List<Presentation>> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/assets/{asset_id}/presentations".replace("{" + "asset_id" + "}", "$assetId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetAssetPresentationsResponse>().map { value }
    }

    @Serializable(GetAssetPresentationsResponse.Companion::class)
    private class GetAssetPresentationsResponse(val value: List<Presentation>) {
        companion object : KSerializer<GetAssetPresentationsResponse> {
            private val serializer: KSerializer<List<Presentation>> = serializer<List<Presentation>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetAssetPresentationsResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetAssetPresentationsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Get a paginated list of Presentations
     * Get a paginated list of Presentations
     * @param projectId Project ID
     * @return kotlin.collections.List<Presentation>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getProjectPresentations(projectId: kotlin.String): HttpResponse<kotlin.collections.List<Presentation>> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/projects/{project_id}/presentations".replace("{" + "project_id" + "}", "$projectId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetProjectPresentationsResponse>().map { value }
    }

    @Serializable(GetProjectPresentationsResponse.Companion::class)
    private class GetProjectPresentationsResponse(val value: List<Presentation>) {
        companion object : KSerializer<GetProjectPresentationsResponse> {
            private val serializer: KSerializer<List<Presentation>> = serializer<List<Presentation>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetProjectPresentationsResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetProjectPresentationsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Get global presentation links
     * Get recently created Presentation Links across a user&#39;s account
     * @return kotlin.collections.List<Presentation>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUserPresentations(): HttpResponse<kotlin.collections.List<Presentation>> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/presentations",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetUserPresentationsResponse>().map { value }
    }

    @Serializable(GetUserPresentationsResponse.Companion::class)
    private class GetUserPresentationsResponse(val value: List<Presentation>) {
        companion object : KSerializer<GetUserPresentationsResponse> {
            private val serializer: KSerializer<List<Presentation>> = serializer<List<Presentation>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetUserPresentationsResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetUserPresentationsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Show a Presentation
     * Fetch a particular presentaiton link&#39;s id
     * @param presentationId Presentation Link ID
     * @return Presentation
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun showPresentation(presentationId: kotlin.String): HttpResponse<Presentation> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/presentations/{presentation_id}".replace("{" + "presentation_id" + "}", "$presentationId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Update a Presentation
     * Update a Presentation Link via it&#39;s ID
     * @param presentationId Presentation Link ID
     * @param updatePresentationRequest Presentation to update (optional)
     * @return Presentation
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun updatePresentation(presentationId: kotlin.String, updatePresentationRequest: UpdatePresentationRequest? = null): HttpResponse<Presentation> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = updatePresentationRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/v2/presentations/{presentation_id}".replace("{" + "presentation_id" + "}", "$presentationId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



}
