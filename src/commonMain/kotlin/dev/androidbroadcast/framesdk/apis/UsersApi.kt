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

import dev.androidbroadcast.framesdk.models.HTTPError
import dev.androidbroadcast.framesdk.models.Project
import dev.androidbroadcast.framesdk.models.User

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

open class UsersApi : ApiClient {

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
     * Get the current authenticated User
     * Get information about the currently authenticated user
     * @return User
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getMe(): HttpResponse<User> {

        val localVariableAuthNames = listOf<String>("C2COAuth2", "OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/me",
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
     * Get Projects where User is a Collaborator
     * Fetch all of the Projects that a User has Collaborator access to (not team-member)
     * @param filterAccountId Filter projects to those belonging to the specified account (optional)
     * @param filterArchived Filter projects by archival status (optional, default to false)
     * @param filterName Filter projects by name (optional)
     * @param page The current page number in this Paginated Response (optional)
     * @param pageSize Number of pages in this Paginated Response (optional)
     * @return kotlin.collections.List<Project>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getSharedProjects(filterAccountId: kotlin.String? = null, filterArchived: kotlin.Boolean? = false, filterName: kotlin.String? = null, page: kotlin.Double? = null, pageSize: kotlin.Double? = null): HttpResponse<kotlin.collections.List<Project>> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        filterAccountId?.apply { localVariableQuery["filter[account_id]"] = listOf("$filterAccountId") }
        filterArchived?.apply { localVariableQuery["filter[archived]"] = listOf("$filterArchived") }
        filterName?.apply { localVariableQuery["filter[name]"] = listOf("$filterName") }
        page?.apply { localVariableQuery["page"] = listOf("$page") }
        pageSize?.apply { localVariableQuery["page_size"] = listOf("$pageSize") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/projects/shared",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetSharedProjectsResponse>().map { value }
    }

    @Serializable(GetSharedProjectsResponse.Companion::class)
    private class GetSharedProjectsResponse(val value: List<Project>) {
        companion object : KSerializer<GetSharedProjectsResponse> {
            private val serializer: KSerializer<List<Project>> = serializer<List<Project>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetSharedProjectsResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetSharedProjectsResponse(serializer.deserialize(decoder))
        }
    }

}
