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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import dev.androidbroadcast.framesdk.apis.TeamsApi
import dev.androidbroadcast.framesdk.models.AddTeamMember200Response
import dev.androidbroadcast.framesdk.models.AddTeamMemberRequest
import dev.androidbroadcast.framesdk.models.CreateTeamRequest
import dev.androidbroadcast.framesdk.models.GetMembershipByTeam200Response
import dev.androidbroadcast.framesdk.models.HTTPError
import dev.androidbroadcast.framesdk.models.Team

class TeamsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TeamsApi
        //val apiInstance = TeamsApi()

        // to test addTeamMember
        should("test addTeamMember") {
            // uncomment below to test addTeamMember
            //val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
            //val addTeamMemberRequest : AddTeamMemberRequest =  // AddTeamMemberRequest | Team member to create or update
            //val result : AddTeamMember200Response = apiInstance.addTeamMember(teamId, addTeamMemberRequest)
            //result shouldBe ("TODO")
        }

        // to test createTeam
        should("test createTeam") {
            // uncomment below to test createTeam
            //val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Account ID
            //val createTeamRequest : CreateTeamRequest =  // CreateTeamRequest | Team create or update request
            //val result : Team = apiInstance.createTeam(accountId, createTeamRequest)
            //result shouldBe ("TODO")
        }

        // to test getMembershipByTeam
        should("test getMembershipByTeam") {
            // uncomment below to test getMembershipByTeam
            //val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
            //val result : GetMembershipByTeam200Response = apiInstance.getMembershipByTeam(teamId)
            //result shouldBe ("TODO")
        }

        // to test getTeam
        should("test getTeam") {
            // uncomment below to test getTeam
            //val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
            //val include : kotlin.String = include_example // kotlin.String | 
            //val result : Team = apiInstance.getTeam(teamId, include)
            //result shouldBe ("TODO")
        }

        // to test getTeamMembers
        should("test getTeamMembers") {
            // uncomment below to test getTeamMembers
            //val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
            //val result : Team = apiInstance.getTeamMembers(teamId)
            //result shouldBe ("TODO")
        }

        // to test getTeams
        should("test getTeams") {
            // uncomment below to test getTeams
            //val result : kotlin.collections.List<Team> = apiInstance.getTeams()
            //result shouldBe ("TODO")
        }

        // to test getTeamsByAccount
        should("test getTeamsByAccount") {
            // uncomment below to test getTeamsByAccount
            //val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Account ID
            //val include : kotlin.String = include_example // kotlin.String | 
            //val result : kotlin.collections.List<Team> = apiInstance.getTeamsByAccount(accountId, include)
            //result shouldBe ("TODO")
        }

    }
}
