# ProjectsApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addCollaboratorToProject**](ProjectsApi.md#addCollaboratorToProject) | **POST** /v2/projects/{project_id}/collaborators | Add a Collaborator to a Project |
| [**batchCreateCollaborators**](ProjectsApi.md#batchCreateCollaborators) | **POST** /v2/batch/projects/{project_id}/collaborators | Batch create Collaborators and PendingCollaborators within a Project |
| [**batchDeleteCollaborators**](ProjectsApi.md#batchDeleteCollaborators) | **DELETE** /v2/batch/projects/{project_id}/collaborators | Batch delete Collaborators and PendingCollaborators for a Project |
| [**createProject**](ProjectsApi.md#createProject) | **POST** /v2/teams/{team_id}/projects | Create a Project |
| [**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /v2/projects/{project_id} | Delete Project by ID |
| [**getProject**](ProjectsApi.md#getProject) | **GET** /v2/projects/{project_id} | Get Project by ID |
| [**getProjectCollaborators**](ProjectsApi.md#getProjectCollaborators) | **GET** /v2/projects/{project_id}/collaborators | Get Project Collaborators |
| [**getProjectMembership**](ProjectsApi.md#getProjectMembership) | **GET** /v2/projects/{project_id}/membership | Get current User(s) membership for a Project |
| [**getProjectsByTeam**](ProjectsApi.md#getProjectsByTeam) | **GET** /v2/teams/{team_id}/projects | Get Projects by Team |
| [**updateProject**](ProjectsApi.md#updateProject) | **PUT** /v2/projects/{project_id} | Update a Project |


<a id="addCollaboratorToProject"></a>
# **addCollaboratorToProject**
> Collaborator addCollaboratorToProject(projectId, include, addCollaboratorToProjectRequest)

Add a Collaborator to a Project

Add a new Collaborator to a Project

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
val include : kotlin.String = project_role // kotlin.String | Include additional \"pre-loads\" for this resource
val addCollaboratorToProjectRequest : AddCollaboratorToProjectRequest =  // AddCollaboratorToProjectRequest | Collaborator to create or update
try {
    val result : Collaborator = apiInstance.addCollaboratorToProject(projectId, include, addCollaboratorToProjectRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#addCollaboratorToProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#addCollaboratorToProject")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project ID | |
| **include** | **kotlin.String**| Include additional \&quot;pre-loads\&quot; for this resource | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addCollaboratorToProjectRequest** | [**AddCollaboratorToProjectRequest**](AddCollaboratorToProjectRequest.md)| Collaborator to create or update | [optional] |

### Return type

[**Collaborator**](Collaborator.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="batchCreateCollaborators"></a>
# **batchCreateCollaborators**
> BatchCreateCollaborators200Response batchCreateCollaborators(projectId, batchInviteParams)

Batch create Collaborators and PendingCollaborators within a Project

Submit a list of Collaborators to add to the given Project as Collaborators

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
val batchInviteParams : BatchInviteParams = {"batch":[{"message":"Please review this!","user_id":"aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa"},{"user_id":"bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb"},{"user_group_id":"cccccccc-cccc-cccc-cccc-cccccccccccc"},{"email":"testing@foobar.biz"}],"default_message":"Welcome!"} // BatchInviteParams | An array of batch operations
try {
    val result : BatchCreateCollaborators200Response = apiInstance.batchCreateCollaborators(projectId, batchInviteParams)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#batchCreateCollaborators")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#batchCreateCollaborators")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchInviteParams** | [**BatchInviteParams**](BatchInviteParams.md)| An array of batch operations | [optional] |

### Return type

[**BatchCreateCollaborators200Response**](BatchCreateCollaborators200Response.md)

### Authorization


Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="batchDeleteCollaborators"></a>
# **batchDeleteCollaborators**
> BatchCreateCollaborators200Response batchDeleteCollaborators(projectId, batchDeleteCollaboratorsRequest)

Batch delete Collaborators and PendingCollaborators for a Project

Submit a list of Collaborators you wish to remove from a given Project

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
val batchDeleteCollaboratorsRequest : BatchDeleteCollaboratorsRequest =  // BatchDeleteCollaboratorsRequest | 
try {
    val result : BatchCreateCollaborators200Response = apiInstance.batchDeleteCollaborators(projectId, batchDeleteCollaboratorsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#batchDeleteCollaborators")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#batchDeleteCollaborators")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchDeleteCollaboratorsRequest** | [**BatchDeleteCollaboratorsRequest**](BatchDeleteCollaboratorsRequest.md)|  | [optional] |

### Return type

[**BatchCreateCollaborators200Response**](BatchCreateCollaborators200Response.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createProject"></a>
# **createProject**
> Project createProject(teamId, createProjectRequest)

Create a Project

Create a new Project belonging to a Team

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ProjectsApi()
val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
val createProjectRequest : CreateProjectRequest =  // CreateProjectRequest | Project to create or update
try {
    val result : Project = apiInstance.createProject(teamId, createProjectRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#createProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#createProject")
    e.printStackTrace()
}
```

### Parameters
| **teamId** | **kotlin.String**| Team ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createProjectRequest** | [**CreateProjectRequest**](CreateProjectRequest.md)| Project to create or update | [optional] |

### Return type

[**Project**](Project.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteProject"></a>
# **deleteProject**
> Project deleteProject(projectId)

Delete Project by ID

Delete a Project via its ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
try {
    val result : Project = apiInstance.deleteProject(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#deleteProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#deleteProject")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectId** | **kotlin.String**| Project ID | |

### Return type

[**Project**](Project.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProject"></a>
# **getProject**
> Project getProject(projectId, include)

Get Project by ID

Fetch a Project via its ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
val include : kotlin.String = include_example // kotlin.String | 
try {
    val result : Project = apiInstance.getProject(projectId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProject")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | **kotlin.String**|  | [optional] |

### Return type

[**Project**](Project.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectCollaborators"></a>
# **getProjectCollaborators**
> Project getProjectCollaborators(projectId)

Get Project Collaborators

Fetch the list of Collaborators with access to a Project.

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
try {
    val result : Project = apiInstance.getProjectCollaborators(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectCollaborators")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectCollaborators")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectId** | **kotlin.String**| Project ID | |

### Return type

[**Project**](Project.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectMembership"></a>
# **getProjectMembership**
> ProjectMembership getProjectMembership(projectId, userId)

Get current User(s) membership for a Project

Get the Membership context for a given user within a Project via its ID

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : ProjectMembership = apiInstance.getProjectMembership(projectId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectMembership")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectMembership")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String**|  | [optional] |

### Return type

[**ProjectMembership**](ProjectMembership.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectsByTeam"></a>
# **getProjectsByTeam**
> kotlin.collections.List&lt;Project&gt; getProjectsByTeam(teamId, filterArchived)

Get Projects by Team

Fetch a paginated list of all Projects belonging to a Team

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ProjectsApi()
val teamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Team ID
val filterArchived : kotlin.String = all // kotlin.String | Add this query param with the value `all` to return both archived and non-archived projects
try {
    val result : kotlin.collections.List<Project> = apiInstance.getProjectsByTeam(teamId, filterArchived)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectsByTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectsByTeam")
    e.printStackTrace()
}
```

### Parameters
| **teamId** | **kotlin.String**| Team ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterArchived** | **kotlin.String**| Add this query param with the value &#x60;all&#x60; to return both archived and non-archived projects | [optional] |

### Return type

[**kotlin.collections.List&lt;Project&gt;**](Project.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateProject"></a>
# **updateProject**
> Project updateProject(projectId, createProjectRequest)

Update a Project

Update a Project ID with only the fields provided (overwrite)

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = eefb57e0-79f2-4bc7-9b70-99fbc175175c // kotlin.String | Project ID
val createProjectRequest : CreateProjectRequest =  // CreateProjectRequest | Project to create or update
try {
    val result : Project = apiInstance.updateProject(projectId, createProjectRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#updateProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#updateProject")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createProjectRequest** | [**CreateProjectRequest**](CreateProjectRequest.md)| Project to create or update | [optional] |

### Return type

[**Project**](Project.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure OAuth2:
    ApiClient.accessToken = ""
Configure JWT:
    ApiClient.accessToken = ""
Configure DeveloperToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

