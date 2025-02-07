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

import dev.androidbroadcast.framesdk.models.AddTeamMember200Response
import dev.androidbroadcast.framesdk.models.AddTeamMemberRequest
import dev.androidbroadcast.framesdk.models.CreateTeamRequest
import dev.androidbroadcast.framesdk.models.GetMembershipByTeam200Response
import dev.androidbroadcast.framesdk.models.HTTPError
import dev.androidbroadcast.framesdk.models.Team

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

open class TeamsApi : ApiClient {

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
     * Add a Team member
     * Add a Team member to a given Team
     * @param teamId Team ID
     * @param addTeamMemberRequest Team member to create or update (optional)
     * @return AddTeamMember200Response
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun addTeamMember(teamId: kotlin.String, addTeamMemberRequest: AddTeamMemberRequest? = null): HttpResponse<AddTeamMember200Response> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = addTeamMemberRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/v2/teams/{team_id}/members".replace("{" + "team_id" + "}", "$teamId"),
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
     * Create a Team for the given Account
     * Create a new Team inside the given Account.   _Limited to Pro and Enterprise plans_
     * @param accountId Account ID
     * @param createTeamRequest Team create or update request (optional)
     * @return Team
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun createTeam(accountId: kotlin.String, createTeamRequest: CreateTeamRequest? = null): HttpResponse<Team> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = createTeamRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/v2/accounts/{account_id}/teams".replace("{" + "account_id" + "}", "$accountId"),
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
     * Get user membership for team
     * Get currently authed User&#39;s membership within a particular Team
     * @param teamId Team ID
     * @return GetMembershipByTeam200Response
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getMembershipByTeam(teamId: kotlin.String): HttpResponse<GetMembershipByTeam200Response> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/teams/{team_id}/membership".replace("{" + "team_id" + "}", "$teamId"),
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
     * enum for parameter include
     */
    @Serializable
    enum class IncludeGetTeam(val value: kotlin.String) {
        
        @SerialName(value = "account")
        account("account"),
        
        @SerialName(value = "user_role")
        user_role("user_role")
        
    }

    /**
     * Get a Team
     * Fetch a given Team&#39;s information by ID
     * @param teamId Team ID
     * @param include  (optional)
     * @return Team
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getTeam(teamId: kotlin.String, include: IncludeGetTeam? = null): HttpResponse<Team> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        include?.apply { localVariableQuery["include"] = listOf("${ include.value }") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/teams/{team_id}".replace("{" + "team_id" + "}", "$teamId"),
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
     * Get Team Members
     * List the members on a given Team
     * @param teamId Team ID
     * @return Team
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getTeamMembers(teamId: kotlin.String): HttpResponse<Team> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/teams/{team_id}/members".replace("{" + "team_id" + "}", "$teamId"),
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
     * Get Teams for User
     * Return an array of all the Teams a user has access to
     * @return kotlin.collections.List<Team>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getTeams(): HttpResponse<kotlin.collections.List<Team>> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/teams",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetTeamsResponse>().map { value }
    }

    @Serializable(GetTeamsResponse.Companion::class)
    private class GetTeamsResponse(val value: List<Team>) {
        companion object : KSerializer<GetTeamsResponse> {
            private val serializer: KSerializer<List<Team>> = serializer<List<Team>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetTeamsResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetTeamsResponse(serializer.deserialize(decoder))
        }
    }


    /**
     * enum for parameter include
     */
    @Serializable
    enum class IncludeGetTeamsByAccount(val value: kotlin.String) {
        
        @SerialName(value = "user_role")
        user_role("user_role")
        
    }

    /**
     * Get all Teams on an Account
     * Return an array of all of the Teams accessible via a given Account
     * @param accountId Account ID
     * @param include  (optional)
     * @return kotlin.collections.List<Team>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getTeamsByAccount(accountId: kotlin.String, include: IncludeGetTeamsByAccount? = null): HttpResponse<kotlin.collections.List<Team>> {

        val localVariableAuthNames = listOf<String>("OAuth2", "OAuth2", "JWT", "DeveloperToken")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        include?.apply { localVariableQuery["include"] = listOf("${ include.value }") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/v2/accounts/{account_id}/teams".replace("{" + "account_id" + "}", "$accountId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetTeamsByAccountResponse>().map { value }
    }

    @Serializable(GetTeamsByAccountResponse.Companion::class)
    private class GetTeamsByAccountResponse(val value: List<Team>) {
        companion object : KSerializer<GetTeamsByAccountResponse> {
            private val serializer: KSerializer<List<Team>> = serializer<List<Team>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetTeamsByAccountResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetTeamsByAccountResponse(serializer.deserialize(decoder))
        }
    }

}
