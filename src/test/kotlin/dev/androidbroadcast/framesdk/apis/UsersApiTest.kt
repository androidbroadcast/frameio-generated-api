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

import dev.androidbroadcast.framesdk.apis.UsersApi
import dev.androidbroadcast.framesdk.models.HTTPError
import dev.androidbroadcast.framesdk.models.Project
import dev.androidbroadcast.framesdk.models.User

class UsersApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UsersApi
        //val apiInstance = UsersApi()

        // to test getMe
        should("test getMe") {
            // uncomment below to test getMe
            //val result : User = apiInstance.getMe()
            //result shouldBe ("TODO")
        }

        // to test getSharedProjects
        should("test getSharedProjects") {
            // uncomment below to test getSharedProjects
            //val filterAccountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter projects to those belonging to the specified account
            //val filterArchived : kotlin.Boolean = true // kotlin.Boolean | Filter projects by archival status
            //val filterName : kotlin.String = filterName_example // kotlin.String | Filter projects by name
            //val page : kotlin.Double = 8.14 // kotlin.Double | The current page number in this Paginated Response
            //val pageSize : kotlin.Double = 8.14 // kotlin.Double | Number of pages in this Paginated Response
            //val result : kotlin.collections.List<Project> = apiInstance.getSharedProjects(filterAccountId, filterArchived, filterName, page, pageSize)
            //result shouldBe ("TODO")
        }

    }
}
