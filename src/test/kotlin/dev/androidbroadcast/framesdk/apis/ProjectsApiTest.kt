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

import dev.androidbroadcast.framesdk.apis.ProjectsApi
import dev.androidbroadcast.framesdk.models.AddCollaboratorToProjectRequest
import dev.androidbroadcast.framesdk.models.BatchCreateCollaborators200Response
import dev.androidbroadcast.framesdk.models.BatchDeleteCollaboratorsRequest
import dev.androidbroadcast.framesdk.models.BatchInviteParams
import dev.androidbroadcast.framesdk.models.Collaborator
import dev.androidbroadcast.framesdk.models.CreateProjectRequest
import dev.androidbroadcast.framesdk.models.GetProjectCollaborators201ResponseInner
import dev.androidbroadcast.framesdk.models.HTTPError
import dev.androidbroadcast.framesdk.models.Project
import dev.androidbroadcast.framesdk.models.ProjectMembership

class ProjectsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProjectsApi
        //val apiInstance = ProjectsApi()

        // to test addCollaboratorToProject
        should("test addCollaboratorToProject") {
            // uncomment below to test addCollaboratorToProject
            //val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
            //val include : kotlin.String = project_role // kotlin.String | Include additional \"pre-loads\" for this resource
            //val addCollaboratorToProjectRequest : AddCollaboratorToProjectRequest =  // AddCollaboratorToProjectRequest | Collaborator to create or update
            //val result : Collaborator = apiInstance.addCollaboratorToProject(projectId, include, addCollaboratorToProjectRequest)
            //result shouldBe ("TODO")
        }

        // to test batchCreateCollaborators
        should("test batchCreateCollaborators") {
            // uncomment below to test batchCreateCollaborators
            //val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
            //val batchInviteParams : BatchInviteParams = {"batch":[{"message":"Please review this!","user_id":"aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa"},{"user_id":"bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb"},{"user_group_id":"cccccccc-cccc-cccc-cccc-cccccccccccc"},{"email":"testing@foobar.biz"}],"default_message":"Welcome!"} // BatchInviteParams | An array of batch operations
            //val result : BatchCreateCollaborators200Response = apiInstance.batchCreateCollaborators(projectId, batchInviteParams)
            //result shouldBe ("TODO")
        }

        // to test batchDeleteCollaborators
        should("test batchDeleteCollaborators") {
            // uncomment below to test batchDeleteCollaborators
            //val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
            //val batchDeleteCollaboratorsRequest : BatchDeleteCollaboratorsRequest =  // BatchDeleteCollaboratorsRequest | 
            //val result : BatchCreateCollaborators200Response = apiInstance.batchDeleteCollaborators(projectId, batchDeleteCollaboratorsRequest)
            //result shouldBe ("TODO")
        }

        // to test createProject
        should("test createProject") {
            // uncomment below to test createProject
            //val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
            //val createProjectRequest : CreateProjectRequest =  // CreateProjectRequest | Project to create or update
            //val result : Project = apiInstance.createProject(teamId, createProjectRequest)
            //result shouldBe ("TODO")
        }

        // to test deleteProject
        should("test deleteProject") {
            // uncomment below to test deleteProject
            //val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
            //val result : Project = apiInstance.deleteProject(projectId)
            //result shouldBe ("TODO")
        }

        // to test getProject
        should("test getProject") {
            // uncomment below to test getProject
            //val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
            //val include : kotlin.String = include_example // kotlin.String | 
            //val result : Project = apiInstance.getProject(projectId, include)
            //result shouldBe ("TODO")
        }

        // to test getProjectCollaborators
        should("test getProjectCollaborators") {
            // uncomment below to test getProjectCollaborators
            //val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
            //val result : Project = apiInstance.getProjectCollaborators(projectId)
            //result shouldBe ("TODO")
        }

        // to test getProjectMembership
        should("test getProjectMembership") {
            // uncomment below to test getProjectMembership
            //val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
            //val userId : kotlin.String = userId_example // kotlin.String | 
            //val result : ProjectMembership = apiInstance.getProjectMembership(projectId, userId)
            //result shouldBe ("TODO")
        }

        // to test getProjectsByTeam
        should("test getProjectsByTeam") {
            // uncomment below to test getProjectsByTeam
            //val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
            //val filterArchived : kotlin.String = all // kotlin.String | Add this query param with the value `all` to return both archived and non-archived projects
            //val result : kotlin.collections.List<Project> = apiInstance.getProjectsByTeam(teamId, filterArchived)
            //result shouldBe ("TODO")
        }

        // to test updateProject
        should("test updateProject") {
            // uncomment below to test updateProject
            //val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
            //val createProjectRequest : CreateProjectRequest =  // CreateProjectRequest | Project to create or update
            //val result : Project = apiInstance.updateProject(projectId, createProjectRequest)
            //result shouldBe ("TODO")
        }

    }
}
