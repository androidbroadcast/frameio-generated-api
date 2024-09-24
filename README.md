# dev.androidbroadcast.framesdk - Kotlin client library for Frame.io API

## Frame.io Developer Platform
Not every creative team, process, or software stack is exactly the same. That's where our Developer Platform comes in. The Frame.io Developer Platform allows you to handle common tasks using our API. Some popular use cases developers have used our API for include automatically adding existing files or folders to the Frame.io app, uploading new content, and managing teams.

## Camera to Cloud (C2C) Program
Camera to Cloud is a unique type of integration. These integrations are purpose built for any device or application that is generating data. If you are building a C2C integration then you will want to use the [C2C Integration guides](/device-integrations/getting-started-with-cloud-device-integrations). There you can find all the information you need to get started connecting to the cloud with Frame.io!

## Frame.io Official SDKs
* [Python SDK](https://github.com/Frameio/python-frameio-client): Frame.io offers an SDK in Python to make getting started with our API easier, including abstraction of key concepts like pagination and rate limiting. This project is available on PyPI, so `pip install frameioclient` and off you go!
* [Python CLI](https://github.com/Frameio/fioctl): If you'd prefer to work from the command line FIOCTL is also available on PyPI.

## Quick Start Guide
If you want to get started right away, just click this button to bring our API into Postman!

[![Run in Postman](https://run.pstmn.io/button.svg)](https://www.getpostman.com/collections/c2dfffb88990a9dc34c2)

Otherwise, read on. As a starting point, you'll need to ensure that you have a Frame.io account that you can sign in with.

From there:
* [Sign into the Developer Portal](https://developer.frame.io) using your Frame.io credentials
* [Create a Developer Token](/getting-started/authentication#developer-tokens)

To confirm that your token is working, go ahead and make a test call using a language, tool, or proxy of your choice:

```curl
curl --request GET \\
    --url https://api.frame.io/v2/me \\
    --header 'authorization: Bearer <DEV_TOKEN>'
```
```python
import requests

url = \"https://api.frame.io/v2/me\"
headers = {
\"Authorization\": \"Bearer <DEV_TOKEN>\"
}

requests.GET(url,headers=headers)
```
In response, you should see your user information.

## Error codes
The Frame.io API may return the following common errors:

| HTTP Status       | Details     | Reason(s) |
| ---------- | ---------- | ---------- |
| `401`      | **Unauthorized** | Invalid API token. Check to make sure you're using Bearer Token authentication, and passing your token via the Authorization header.       |
| `402`      | **Usage exceeded** | You have gone over your Frame.io plan limits.  |
| `403`      | **Forbidden** | You do not have access to that resource. Returned for both user access and token scope.  |
| `404`      | **Not Found** | Resource has been moved or deleted.|
| `409`      | **Conflict** | That resource already exists. |
| `422`      | **Invalid arguments** | One or more parameters supplied were invalid. |
| `429`      | **Rate Limited** | You have hit the rate limit for the API. |
| `500`       | **Server Error** | Our server doesn't know how to interpret your request, or was unable to complete your request within the available timeframe (30 seconds). |

## Troubleshooting common errors
When using a valid API token to perform common tasks, the most common errors are `403`, `404` and `500`.

A **403** error will usually indicate one of three scenarios:

1. The token used in the request, and/or the User to which the token belongs, does not have sufficient access to the area of the Frame.io Account where the resource was requested.
2. The token does not have sufficient [Scopes]() for the resource requested. For example: calling `GET /comments/` without the `comments.read` scope.
3. A network traffic problem is preventing the Frame.io API from processing the request.  *If you suspect your requests are being blocked by a network traffic problem, please contact Customer Support.*

A **404** error will usually indicate a resource no longer exists -- it has been moved or deleted.

A **500** error usually indicates a malformed request URL or body, but could also happen when we're unable to complete the request within the available timeframe (30s).

## Rate limits
Whether you're using a Developer Token, accessing via an OAuth App, or you're interacting with our API using any of our internal apps, **all API calls to Frame.io are rate limited.**

Rate limits apply are applied across any and all API requests from an individual user (irrespective of which token or auth method is used), are depleted and refilled progressively, and are reflected in the response headers of every request made to the Frame.io API. Each endpoint is configured with its own limits, which range from as low as `10` requests/minute, to as high as `100` requests/second.

Requests that have exceeded the rate limit for a particular endpoint will receive a `429` HTTP error in response.

### Limit depletion and refill
The Frame.io API uses a [leaky bucket](https://wikipedia.org/wiki/Leaky_bucket) strategy of progressive rate limiting, in which limits refresh gradually during their allotted time window. In other words, there is not a concept of any hard cutoff after which limits refresh for a particular resource (i.e. \"fixed\" and \"sliding window\" enforcement strategies). Rather, remaining limits are constantly refreshing at a pace relative to a resource's limit and time window.

### Exponential backoff
Our recommended strategy for managing rate limits is usually referred to as \"exponential backoff.\"

In short:

* When receiving a `429`, pause for a period (normally one second)
* If another `429`  is received, exponentially increase the wait period until normal function resumes

### Headers
Responses to API requests will always include the following three headers that should be utilized to limit your outbound requests:

| Header     | Value     |
| ---------- | ---------- |
| `x-ratelimit-limit`       | The rate limit for this resource path, measured in requests.       |
| `x-ratelimit-remaining`       | The number of requests remaining in the current time window.       |
| `x-ratelimit-window`       | The time window for this resource path's limits, measured in milliseconds (ms).       |

### Example
The following example is from the response to `GET v2/assets/:id/children`, to fetch the child assets of a Project root, folder, or Version Stack. The limit for that path is 40 requests per 60,000 ms (one minute), and there are 39 requests remaining after one has been made.

```
x-ratelimit-limit → 40
x-ratelimit-remaining → 39
x-ratelimit-window → 60000
```

### Details
Rate limits vary greatly across resource paths in the Frame.io API. Below are some select details, expressed for readability as resource and action (e.g. \"Assets -- Update\" instead of `PUT /assets/:id`).

As a general rule, resource paths that create new data are limited at or below 100 calls per minute, and resource paths that fetch lists of assets are limited to 200 calls per minute.

| Resource     | Action     | Limit (requests)     | Limit window (ms)     |
| ---------- | ---------- | ---------- | ---------- |
| **Assets**       | `create`     | `5`       | 1,000       |
| **Assets**       | `update`     | `10`      | 1,000
| **Assets**       | `read`       | `5`       | 1,000       |
| **Comments<br />Presentations<br />Projects<br />Review Links<br />Teams<br />Team Members**       | `create`       | `100`       | 60,000       |
| **Search**       | `read`       | `200`       | 60,000       |


## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 2.0.0
- Package version: 
- Generator version: 7.8.0
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen
For more information, please visit [http://developer.frame.io](http://developer.frame.io)

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.frame.io*

| Class | Method | HTTP request | Description |
| ------------ | ------------- | ------------- | ------------- |
| *AccountsApi* | [**deviceIdentify**](docs/AccountsApi.md#deviceidentify) | **GET** /v2/devices/me | Device Information |
| *AccountsApi* | [**deviceListAccounts**](docs/AccountsApi.md#devicelistaccounts) | **GET** /v2/devices/accounts | List accounts |
| *AccountsApi* | [**getAccount**](docs/AccountsApi.md#getaccount) | **GET** /v2/accounts/{account_id} | Get Account |
| *AccountsApi* | [**getAccountMembership**](docs/AccountsApi.md#getaccountmembership) | **GET** /v2/accounts/{account_id}/membership | Get Account membership |
| *AccountsApi* | [**getAccounts**](docs/AccountsApi.md#getaccounts) | **GET** /v2/accounts | Get Accounts for User |
| *AssetsApi* | [**addVersionToAsset**](docs/AssetsApi.md#addversiontoasset) | **POST** /v2/assets/{asset_id}/version | Version an Asset |
| *AssetsApi* | [**assetSearchGet**](docs/AssetsApi.md#assetsearchget) | **GET** /v2/search/assets | Search for Assets |
| *AssetsApi* | [**assetSearchPost**](docs/AssetsApi.md#assetsearchpost) | **POST** /v2/search/assets | Search for Assets |
| *AssetsApi* | [**batchCopyAsset**](docs/AssetsApi.md#batchcopyasset) | **POST** /v2/batch/assets/{destination_id}/copy | Bulk copy assets |
| *AssetsApi* | [**batchDeleteAsset**](docs/AssetsApi.md#batchdeleteasset) | **DELETE** /v2/batch/assets | Bulk delete assets |
| *AssetsApi* | [**copyAsset**](docs/AssetsApi.md#copyasset) | **POST** /v2/assets/{destination_folder}/copy | Copy asset |
| *AssetsApi* | [**createAsset**](docs/AssetsApi.md#createasset) | **POST** /v2/assets/{asset_id}/children | Create an Asset |
| *AssetsApi* | [**createRealtimeUploadParts**](docs/AssetsApi.md#createrealtimeuploadparts) | **POST** /v2/assets/{asset_id}/realtime_upload/parts | Request upload URLs for real-time upload |
| *AssetsApi* | [**deleteAsset**](docs/AssetsApi.md#deleteasset) | **DELETE** /v2/assets/{asset_id} | Delete an Asset |
| *AssetsApi* | [**deviceAssetCreate**](docs/AssetsApi.md#deviceassetcreate) | **POST** /v2/devices/assets | Create C2C asset |
| *AssetsApi* | [**deviceAssetCreateDeprecated**](docs/AssetsApi.md#deviceassetcreatedeprecated) | **POST** /v2/assets | Create C2C asset |
| *AssetsApi* | [**getAsset**](docs/AssetsApi.md#getasset) | **GET** /v2/assets/{asset_id} | Get an Asset |
| *AssetsApi* | [**getAssets**](docs/AssetsApi.md#getassets) | **GET** /v2/assets/{asset_id}/children | Fetch child Assets |
| *AssetsApi* | [**getAudio**](docs/AssetsApi.md#getaudio) | **GET** /v2/assets/{asset_id}/audio | Get audio for an Asset |
| *AssetsApi* | [**getSubtitles**](docs/AssetsApi.md#getsubtitles) | **GET** /v2/assets/{asset_id}/subtitles | Get the subtitles for an Asset |
| *AssetsApi* | [**librarySearchGet**](docs/AssetsApi.md#librarysearchget) | **GET** /v2/search/library | Advanced search for Assets |
| *AssetsApi* | [**librarySearchPost**](docs/AssetsApi.md#librarysearchpost) | **POST** /v2/search/library | Advanced search for Assets |
| *AssetsApi* | [**moveAsset**](docs/AssetsApi.md#moveasset) | **POST** /v2/assets/{destination_folder}/move | Move asset |
| *AssetsApi* | [**unversionAsset**](docs/AssetsApi.md#unversionasset) | **DELETE** /v2/assets/{asset_id}/unversion | Unversion an Asset |
| *AssetsApi* | [**updateAsset**](docs/AssetsApi.md#updateasset) | **PUT** /v2/assets/{asset_id} | Update an Asset |
| *AuditLogsApi* | [**getAccountAuditLogs**](docs/AuditLogsApi.md#getaccountauditlogs) | **GET** /v2/accounts/{account_id}/events | Get audit log entries for an Account |
| *AuditLogsApi* | [**getAuditLogs**](docs/AuditLogsApi.md#getauditlogs) | **GET** /v2/accounts/{account_id}/audit_logs | (Legacy) Get Audit Logs for an Account |
| *AuditLogsApi* | [**getUserAuditLogs**](docs/AuditLogsApi.md#getuserauditlogs) | **GET** /v2/users/{user_id}/events | Get audit log entries for a specified User |
| *AuthorizationApi* | [**authDeviceConfirmDevice**](docs/AuthorizationApi.md#authdeviceconfirmdevice) | **GET** /v2/auth/token | Polling for Device Authorization |
| *AuthorizationApi* | [**authDeviceRefreshToken**](docs/AuthorizationApi.md#authdevicerefreshtoken) | **POST** /v2/auth/token | Refresh Device Token |
| *AuthorizationApi* | [**authDeviceRevokeToken**](docs/AuthorizationApi.md#authdevicerevoketoken) | **POST** /v2/auth/revoke | Revoke Device Authorization |
| *AuthorizationApi* | [**deviceRequestCode**](docs/AuthorizationApi.md#devicerequestcode) | **POST** /v2/device/code | Request device code |
| *CommentsApi* | [**completeComment**](docs/CommentsApi.md#completecomment) | **POST** /v2/comments/{comment_id}/complete | Mark completed |
| *CommentsApi* | [**createComment**](docs/CommentsApi.md#createcomment) | **POST** /v2/assets/{asset_id}/comments | Create a Comment |
| *CommentsApi* | [**createCommentImpressionLike**](docs/CommentsApi.md#createcommentimpressionlike) | **POST** /v2/comments/{comment_id}/like | Create a Like on a Comment |
| *CommentsApi* | [**createReply**](docs/CommentsApi.md#createreply) | **POST** /v2/comments/{comment_id}/replies | Leave a Reply on a Comment |
| *CommentsApi* | [**deleteComment**](docs/CommentsApi.md#deletecomment) | **DELETE** /v2/comments/{comment_id} | Delete a Comment |
| *CommentsApi* | [**deleteCommentImpressionLike**](docs/CommentsApi.md#deletecommentimpressionlike) | **DELETE** /v2/comments/{comment_id}/like | Delete a like from a comment |
| *CommentsApi* | [**getComment**](docs/CommentsApi.md#getcomment) | **GET** /v2/comments/{comment_id} | Get a Comment by ID |
| *CommentsApi* | [**getCommentImpressions**](docs/CommentsApi.md#getcommentimpressions) | **GET** /v2/comments/{comment_id}/impressions | Get impressions |
| *CommentsApi* | [**getComments**](docs/CommentsApi.md#getcomments) | **GET** /v2/assets/{asset_id}/comments | Get all the Comments and Replies from  a Comment thread |
| *CommentsApi* | [**getReplies**](docs/CommentsApi.md#getreplies) | **GET** /v2/comments/{comment_id}/replies | Get comments and replies |
| *CommentsApi* | [**uncompleteComment**](docs/CommentsApi.md#uncompletecomment) | **DELETE** /v2/comments/{comment_id}/complete | Mark a Comment as Uncompleted |
| *CommentsApi* | [**updateComment**](docs/CommentsApi.md#updatecomment) | **PUT** /v2/comments/{comment_id} | Update a Comment |
| *CustomActionsApi* | [**createActionForTeam**](docs/CustomActionsApi.md#createactionforteam) | **POST** /v2/teams/{team_id}/actions | Create a Custom Action |
| *CustomActionsApi* | [**deleteAction**](docs/CustomActionsApi.md#deleteaction) | **DELETE** /v2/actions/{action_id} | Delete a Custom Action |
| *CustomActionsApi* | [**getAction**](docs/CustomActionsApi.md#getaction) | **GET** /v2/actions/{action_id} | Get a Custom Action by ID |
| *CustomActionsApi* | [**getActionsByAccount**](docs/CustomActionsApi.md#getactionsbyaccount) | **GET** /v2/accounts/{account_id}/actions | Get Custom Actions for an Account or Team |
| *CustomActionsApi* | [**getActionsByTeam**](docs/CustomActionsApi.md#getactionsbyteam) | **GET** /v2/teams/{team_id}/actions | Get Custom Actions for a given Team |
| *CustomActionsApi* | [**updateAction**](docs/CustomActionsApi.md#updateaction) | **PUT** /v2/actions/{action_id} | Update a Custom Action |
| *DevicesApi* | [**authDeviceConfirmDevice**](docs/DevicesApi.md#authdeviceconfirmdevice) | **GET** /v2/auth/token | Polling for Device Authorization |
| *DevicesApi* | [**authDeviceRefreshToken**](docs/DevicesApi.md#authdevicerefreshtoken) | **POST** /v2/auth/token | Refresh Device Token |
| *DevicesApi* | [**authDeviceRevokeToken**](docs/DevicesApi.md#authdevicerevoketoken) | **POST** /v2/auth/revoke | Revoke Device Authorization |
| *DevicesApi* | [**connectDeviceChannel**](docs/DevicesApi.md#connectdevicechannel) | **POST** /v2/devices/channels | Connect a new device channel |
| *DevicesApi* | [**deviceAssetCreate**](docs/DevicesApi.md#deviceassetcreate) | **POST** /v2/devices/assets | Create C2C asset |
| *DevicesApi* | [**deviceAssetCreateDeprecated**](docs/DevicesApi.md#deviceassetcreatedeprecated) | **POST** /v2/assets | Create C2C asset |
| *DevicesApi* | [**deviceCreateRealtimeUploadParts**](docs/DevicesApi.md#devicecreaterealtimeuploadparts) | **POST** /v2/devices/assets/{asset_id}/realtime_upload/parts | Request upload URLs for real-time upload |
| *DevicesApi* | [**deviceHeartbeat**](docs/DevicesApi.md#deviceheartbeat) | **POST** /v2/devices/heartbeat | Heartbeat ping |
| *DevicesApi* | [**deviceIdentify**](docs/DevicesApi.md#deviceidentify) | **GET** /v2/devices/me | Device Information |
| *DevicesApi* | [**deviceListAccounts**](docs/DevicesApi.md#devicelistaccounts) | **GET** /v2/devices/accounts | List accounts |
| *DevicesApi* | [**deviceListProjects**](docs/DevicesApi.md#devicelistprojects) | **GET** /v2/devices/accounts/{account_id}/projects | List projects for account |
| *DevicesApi* | [**deviceProjectConnect**](docs/DevicesApi.md#deviceprojectconnect) | **POST** /v2/devices/connect | Connect device |
| *DevicesApi* | [**deviceProjectDisconnect**](docs/DevicesApi.md#deviceprojectdisconnect) | **POST** /v2/devices/disconnect | Disconnect device |
| *DevicesApi* | [**deviceRequestCode**](docs/DevicesApi.md#devicerequestcode) | **POST** /v2/device/code | Request device code |
| *DevicesApi* | [**disconnectAllDeviceChannels**](docs/DevicesApi.md#disconnectalldevicechannels) | **POST** /v2/devices/channels/disconnect | Disconnect all device channels |
| *DevicesApi* | [**disconnectDeviceChannel**](docs/DevicesApi.md#disconnectdevicechannel) | **POST** /v2/devices/channels/{channel_id}/disconnect | Disconnect a specific device channel |
| *DevicesApi* | [**getMe**](docs/DevicesApi.md#getme) | **GET** /v2/me | Get the current authenticated User |
| *DevicesApi* | [**triggerRealtimeLoggingEvent**](docs/DevicesApi.md#triggerrealtimeloggingevent) | **POST** /v2/devices/channels/{channel_id}/inputs/{input_index}/trigger | Trigger a real-time logging event |
| *NotificationsApi* | [**getGroupedNotifications**](docs/NotificationsApi.md#getgroupednotifications) | **GET** /v2/notifications | Get Grouped Notifications |
| *PresentationsApi* | [**createPresentation**](docs/PresentationsApi.md#createpresentation) | **POST** /v2/assets/{asset_id}/presentations | Create a Presentation Link for an asset |
| *PresentationsApi* | [**deletePresentation**](docs/PresentationsApi.md#deletepresentation) | **DELETE** /v2/presentations/{presentation_id} | Delete a Presentation |
| *PresentationsApi* | [**getAssetPresentations**](docs/PresentationsApi.md#getassetpresentations) | **GET** /v2/assets/{asset_id}/presentations | Get Presentation Links for a particular asset |
| *PresentationsApi* | [**getProjectPresentations**](docs/PresentationsApi.md#getprojectpresentations) | **GET** /v2/projects/{project_id}/presentations | Get a paginated list of Presentations |
| *PresentationsApi* | [**getUserPresentations**](docs/PresentationsApi.md#getuserpresentations) | **GET** /v2/presentations | Get global presentation links |
| *PresentationsApi* | [**showPresentation**](docs/PresentationsApi.md#showpresentation) | **GET** /v2/presentations/{presentation_id} | Show a Presentation |
| *PresentationsApi* | [**updatePresentation**](docs/PresentationsApi.md#updatepresentation) | **PUT** /v2/presentations/{presentation_id} | Update a Presentation |
| *PrivateApi* | [**getGroupedNotifications**](docs/PrivateApi.md#getgroupednotifications) | **GET** /v2/notifications | Get Grouped Notifications |
| *PrivateApi* | [**getSubtitles**](docs/PrivateApi.md#getsubtitles) | **GET** /v2/assets/{asset_id}/subtitles | Get the subtitles for an Asset |
| *ProjectsApi* | [**addCollaboratorToProject**](docs/ProjectsApi.md#addcollaboratortoproject) | **POST** /v2/projects/{project_id}/collaborators | Add a Collaborator to a Project |
| *ProjectsApi* | [**batchCreateCollaborators**](docs/ProjectsApi.md#batchcreatecollaborators) | **POST** /v2/batch/projects/{project_id}/collaborators | Batch create Collaborators and PendingCollaborators within a Project |
| *ProjectsApi* | [**batchDeleteCollaborators**](docs/ProjectsApi.md#batchdeletecollaborators) | **DELETE** /v2/batch/projects/{project_id}/collaborators | Batch delete Collaborators and PendingCollaborators for a Project |
| *ProjectsApi* | [**createProject**](docs/ProjectsApi.md#createproject) | **POST** /v2/teams/{team_id}/projects | Create a Project |
| *ProjectsApi* | [**deleteProject**](docs/ProjectsApi.md#deleteproject) | **DELETE** /v2/projects/{project_id} | Delete Project by ID |
| *ProjectsApi* | [**getProject**](docs/ProjectsApi.md#getproject) | **GET** /v2/projects/{project_id} | Get Project by ID |
| *ProjectsApi* | [**getProjectCollaborators**](docs/ProjectsApi.md#getprojectcollaborators) | **GET** /v2/projects/{project_id}/collaborators | Get Project Collaborators |
| *ProjectsApi* | [**getProjectMembership**](docs/ProjectsApi.md#getprojectmembership) | **GET** /v2/projects/{project_id}/membership | Get current User(s) membership for a Project |
| *ProjectsApi* | [**getProjectsByTeam**](docs/ProjectsApi.md#getprojectsbyteam) | **GET** /v2/teams/{team_id}/projects | Get Projects by Team |
| *ProjectsApi* | [**updateProject**](docs/ProjectsApi.md#updateproject) | **PUT** /v2/projects/{project_id} | Update a Project |
| *ReviewLinksApi* | [**reviewLinkCreate**](docs/ReviewLinksApi.md#reviewlinkcreate) | **POST** /v2/projects/{project_id}/review_links | Create a Review Link |
| *ReviewLinksApi* | [**reviewLinkDelete**](docs/ReviewLinksApi.md#reviewlinkdelete) | **DELETE** /v2/review_links/{review_link_id} | Delete a Review Link |
| *ReviewLinksApi* | [**reviewLinkGet**](docs/ReviewLinksApi.md#reviewlinkget) | **GET** /v2/review_links/{review_link_id} | Get a Review Link |
| *ReviewLinksApi* | [**reviewLinkItemCreate**](docs/ReviewLinksApi.md#reviewlinkitemcreate) | **POST** /v2/review_links/{review_link_id}/assets | Add Asset to a Review Link |
| *ReviewLinksApi* | [**reviewLinkItemUpdate**](docs/ReviewLinksApi.md#reviewlinkitemupdate) | **PUT** /v2/review_links/{review_link_id}/assets | Update Assets in a Review Link |
| *ReviewLinksApi* | [**reviewLinkItemsDelete**](docs/ReviewLinksApi.md#reviewlinkitemsdelete) | **DELETE** /v2/review_links/{review_link_id}/items/shared | Remove items from a Review Link |
| *ReviewLinksApi* | [**reviewLinkItemsList**](docs/ReviewLinksApi.md#reviewlinkitemslist) | **GET** /v2/review_links/{review_link_id}/items/shared | Get items in a Review Link |
| *ReviewLinksApi* | [**reviewLinkReviewerDelete**](docs/ReviewLinksApi.md#reviewlinkreviewerdelete) | **DELETE** /v2/review_links/{review_link_id}/reviewers | Remove Reviewers from a Review Link |
| *ReviewLinksApi* | [**reviewLinkReviewerInvite**](docs/ReviewLinksApi.md#reviewlinkreviewerinvite) | **POST** /v2/review_links/{review_link_id}/reviewers | Invite Reviewer to a Review Link |
| *ReviewLinksApi* | [**reviewLinkUpdate**](docs/ReviewLinksApi.md#reviewlinkupdate) | **PUT** /v2/review_links/{review_link_id} | Update a Review Link |
| *ReviewLinksApi* | [**reviewLinksList**](docs/ReviewLinksApi.md#reviewlinkslist) | **GET** /v2/projects/{project_id}/review_links | List Review Links in a project |
| *SystemApi* | [**healthCheck**](docs/SystemApi.md#healthcheck) | **GET** /health | Status check |
| *TeamsApi* | [**addTeamMember**](docs/TeamsApi.md#addteammember) | **POST** /v2/teams/{team_id}/members | Add a Team member |
| *TeamsApi* | [**createTeam**](docs/TeamsApi.md#createteam) | **POST** /v2/accounts/{account_id}/teams | Create a Team for the given Account |
| *TeamsApi* | [**getMembershipByTeam**](docs/TeamsApi.md#getmembershipbyteam) | **GET** /v2/teams/{team_id}/membership | Get user membership for team |
| *TeamsApi* | [**getTeam**](docs/TeamsApi.md#getteam) | **GET** /v2/teams/{team_id} | Get a Team |
| *TeamsApi* | [**getTeamMembers**](docs/TeamsApi.md#getteammembers) | **GET** /v2/teams/{team_id}/members | Get Team Members |
| *TeamsApi* | [**getTeams**](docs/TeamsApi.md#getteams) | **GET** /v2/teams | Get Teams for User |
| *TeamsApi* | [**getTeamsByAccount**](docs/TeamsApi.md#getteamsbyaccount) | **GET** /v2/accounts/{account_id}/teams | Get all Teams on an Account |
| *UsersApi* | [**getMe**](docs/UsersApi.md#getme) | **GET** /v2/me | Get the current authenticated User |
| *UsersApi* | [**getSharedProjects**](docs/UsersApi.md#getsharedprojects) | **GET** /v2/projects/shared | Get Projects where User is a Collaborator |
| *WebhooksApi* | [**createWebhookForTeam**](docs/WebhooksApi.md#createwebhookforteam) | **POST** /v2/teams/{team_id}/hooks | Create team webhook |
| *WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deletewebhook) | **DELETE** /v2/hooks/{hook_id} | Delete webhook |
| *WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getwebhook) | **GET** /v2/hooks/{hook_id} | Get Webhook by ID |
| *WebhooksApi* | [**getWebhooksByAccount**](docs/WebhooksApi.md#getwebhooksbyaccount) | **GET** /v2/accounts/{account_id}/hooks | Get Webhooks for Account |
| *WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updatewebhook) | **PUT** /v2/hooks/{hook_id} | Update webhook |


<a id="documentation-for-models"></a>
## Documentation for Models

 - [dev.androidbroadcast.framesdk.models.Account](docs/Account.md)
 - [dev.androidbroadcast.framesdk.models.AccountMember](docs/AccountMember.md)
 - [dev.androidbroadcast.framesdk.models.AccountMembership](docs/AccountMembership.md)
 - [dev.androidbroadcast.framesdk.models.Action](docs/Action.md)
 - [dev.androidbroadcast.framesdk.models.AddCollaboratorToProjectRequest](docs/AddCollaboratorToProjectRequest.md)
 - [dev.androidbroadcast.framesdk.models.AddTeamMember200Response](docs/AddTeamMember200Response.md)
 - [dev.androidbroadcast.framesdk.models.AddTeamMemberRequest](docs/AddTeamMemberRequest.md)
 - [dev.androidbroadcast.framesdk.models.AddVersionToAssetRequest](docs/AddVersionToAssetRequest.md)
 - [dev.androidbroadcast.framesdk.models.AdminOnlyAction](docs/AdminOnlyAction.md)
 - [dev.androidbroadcast.framesdk.models.AnonymousUser](docs/AnonymousUser.md)
 - [dev.androidbroadcast.framesdk.models.Asset](docs/Asset.md)
 - [dev.androidbroadcast.framesdk.models.AssetAudio](docs/AssetAudio.md)
 - [dev.androidbroadcast.framesdk.models.AssetLabel](docs/AssetLabel.md)
 - [dev.androidbroadcast.framesdk.models.AssetSearch](docs/AssetSearch.md)
 - [dev.androidbroadcast.framesdk.models.AssetSearchGetTeamIdParameter](docs/AssetSearchGetTeamIdParameter.md)
 - [dev.androidbroadcast.framesdk.models.AssetSource](docs/AssetSource.md)
 - [dev.androidbroadcast.framesdk.models.AssetSubtitle](docs/AssetSubtitle.md)
 - [dev.androidbroadcast.framesdk.models.Audit](docs/Audit.md)
 - [dev.androidbroadcast.framesdk.models.AuditActor](docs/AuditActor.md)
 - [dev.androidbroadcast.framesdk.models.AuditEvent](docs/AuditEvent.md)
 - [dev.androidbroadcast.framesdk.models.AuthDeviceConfirmDevice200Response](docs/AuthDeviceConfirmDevice200Response.md)
 - [dev.androidbroadcast.framesdk.models.AuthDeviceConfirmDevice400Response](docs/AuthDeviceConfirmDevice400Response.md)
 - [dev.androidbroadcast.framesdk.models.AvailableFeatures](docs/AvailableFeatures.md)
 - [dev.androidbroadcast.framesdk.models.BatchCopyAsset200Response](docs/BatchCopyAsset200Response.md)
 - [dev.androidbroadcast.framesdk.models.BatchCopyAsset200ResponseSuccesTest](docs/BatchCopyAsset200ResponseSuccesTest.md)
 - [dev.androidbroadcast.framesdk.models.BatchCopyAsset200ResponseSuccess](docs/BatchCopyAsset200ResponseSuccess.md)
 - [dev.androidbroadcast.framesdk.models.BatchCopyAssetRequest](docs/BatchCopyAssetRequest.md)
 - [dev.androidbroadcast.framesdk.models.BatchCopyAssetRequestBatchInner](docs/BatchCopyAssetRequestBatchInner.md)
 - [dev.androidbroadcast.framesdk.models.BatchCreateCollaborators200Response](docs/BatchCreateCollaborators200Response.md)
 - [dev.androidbroadcast.framesdk.models.BatchDeleteAssetRequest](docs/BatchDeleteAssetRequest.md)
 - [dev.androidbroadcast.framesdk.models.BatchDeleteCollaboratorsRequest](docs/BatchDeleteCollaboratorsRequest.md)
 - [dev.androidbroadcast.framesdk.models.BatchDeleteCollaboratorsRequestBatchInner](docs/BatchDeleteCollaboratorsRequestBatchInner.md)
 - [dev.androidbroadcast.framesdk.models.BatchInviteParams](docs/BatchInviteParams.md)
 - [dev.androidbroadcast.framesdk.models.BatchInviteParamsBatchInner](docs/BatchInviteParamsBatchInner.md)
 - [dev.androidbroadcast.framesdk.models.Collaborator](docs/Collaborator.md)
 - [dev.androidbroadcast.framesdk.models.Comment](docs/Comment.md)
 - [dev.androidbroadcast.framesdk.models.CommentImpression](docs/CommentImpression.md)
 - [dev.androidbroadcast.framesdk.models.ConnectDeviceChannelRequest](docs/ConnectDeviceChannelRequest.md)
 - [dev.androidbroadcast.framesdk.models.CopyAssetRequest](docs/CopyAssetRequest.md)
 - [dev.androidbroadcast.framesdk.models.CreateActionForTeamRequest](docs/CreateActionForTeamRequest.md)
 - [dev.androidbroadcast.framesdk.models.CreateAsset200Response](docs/CreateAsset200Response.md)
 - [dev.androidbroadcast.framesdk.models.CreateAssetRequest](docs/CreateAssetRequest.md)
 - [dev.androidbroadcast.framesdk.models.CreateCommentRequest](docs/CreateCommentRequest.md)
 - [dev.androidbroadcast.framesdk.models.CreatePresentationRequest](docs/CreatePresentationRequest.md)
 - [dev.androidbroadcast.framesdk.models.CreateProjectRequest](docs/CreateProjectRequest.md)
 - [dev.androidbroadcast.framesdk.models.CreateRealtimeUploadParts200Response](docs/CreateRealtimeUploadParts200Response.md)
 - [dev.androidbroadcast.framesdk.models.CreateRealtimeUploadPartsRequest](docs/CreateRealtimeUploadPartsRequest.md)
 - [dev.androidbroadcast.framesdk.models.CreateRealtimeUploadPartsRequestPartsInner](docs/CreateRealtimeUploadPartsRequestPartsInner.md)
 - [dev.androidbroadcast.framesdk.models.CreateTeamRequest](docs/CreateTeamRequest.md)
 - [dev.androidbroadcast.framesdk.models.CreateWebhookForTeamRequest](docs/CreateWebhookForTeamRequest.md)
 - [dev.androidbroadcast.framesdk.models.DeviceAssetCreateDeprecated409Response](docs/DeviceAssetCreateDeprecated409Response.md)
 - [dev.androidbroadcast.framesdk.models.DeviceAssetCreateDeprecated409ResponseErrorsInner](docs/DeviceAssetCreateDeprecated409ResponseErrorsInner.md)
 - [dev.androidbroadcast.framesdk.models.DeviceAssetCreateDeprecatedRequest](docs/DeviceAssetCreateDeprecatedRequest.md)
 - [dev.androidbroadcast.framesdk.models.DeviceAssetCreateDeprecatedRequestChannel](docs/DeviceAssetCreateDeprecatedRequestChannel.md)
 - [dev.androidbroadcast.framesdk.models.DeviceAssetCreateDeprecatedRequestFilesize](docs/DeviceAssetCreateDeprecatedRequestFilesize.md)
 - [dev.androidbroadcast.framesdk.models.DeviceAssetCreateDeprecatedRequestParts](docs/DeviceAssetCreateDeprecatedRequestParts.md)
 - [dev.androidbroadcast.framesdk.models.DeviceListAccounts200ResponseInner](docs/DeviceListAccounts200ResponseInner.md)
 - [dev.androidbroadcast.framesdk.models.DeviceListProjects200ResponseInner](docs/DeviceListProjects200ResponseInner.md)
 - [dev.androidbroadcast.framesdk.models.DeviceRequestCode200Response](docs/DeviceRequestCode200Response.md)
 - [dev.androidbroadcast.framesdk.models.EmailBranding](docs/EmailBranding.md)
 - [dev.androidbroadcast.framesdk.models.Events](docs/Events.md)
 - [dev.androidbroadcast.framesdk.models.GetAssetTypeParameter](docs/GetAssetTypeParameter.md)
 - [dev.androidbroadcast.framesdk.models.GetGroupedNotifications200Response](docs/GetGroupedNotifications200Response.md)
 - [dev.androidbroadcast.framesdk.models.GetGroupedNotifications200ResponseLinkToInner](docs/GetGroupedNotifications200ResponseLinkToInner.md)
 - [dev.androidbroadcast.framesdk.models.GetGroupedNotifications200ResponseTextElements](docs/GetGroupedNotifications200ResponseTextElements.md)
 - [dev.androidbroadcast.framesdk.models.GetGroupedNotifications200ResponseTextElementsBodyInner](docs/GetGroupedNotifications200ResponseTextElementsBodyInner.md)
 - [dev.androidbroadcast.framesdk.models.GetGroupedNotifications200ResponseTextElementsHeaderInner](docs/GetGroupedNotifications200ResponseTextElementsHeaderInner.md)
 - [dev.androidbroadcast.framesdk.models.GetMembershipByTeam200Response](docs/GetMembershipByTeam200Response.md)
 - [dev.androidbroadcast.framesdk.models.GetProjectCollaborators201ResponseInner](docs/GetProjectCollaborators201ResponseInner.md)
 - [dev.androidbroadcast.framesdk.models.GetProjectCollaborators201ResponseInnerUser](docs/GetProjectCollaborators201ResponseInnerUser.md)
 - [dev.androidbroadcast.framesdk.models.GetProjectCollaborators201ResponseInnerUserProjectRole](docs/GetProjectCollaborators201ResponseInnerUserProjectRole.md)
 - [dev.androidbroadcast.framesdk.models.GetProjectCollaborators201ResponseInnerUserRoles](docs/GetProjectCollaborators201ResponseInnerUserRoles.md)
 - [dev.androidbroadcast.framesdk.models.HTTPError](docs/HTTPError.md)
 - [dev.androidbroadcast.framesdk.models.HTTPErrorErrorsInner](docs/HTTPErrorErrorsInner.md)
 - [dev.androidbroadcast.framesdk.models.HealthCheck200Response](docs/HealthCheck200Response.md)
 - [dev.androidbroadcast.framesdk.models.Image](docs/Image.md)
 - [dev.androidbroadcast.framesdk.models.LibrarySearch](docs/LibrarySearch.md)
 - [dev.androidbroadcast.framesdk.models.MetadataFlags](docs/MetadataFlags.md)
 - [dev.androidbroadcast.framesdk.models.Plan](docs/Plan.md)
 - [dev.androidbroadcast.framesdk.models.Presentation](docs/Presentation.md)
 - [dev.androidbroadcast.framesdk.models.PresentationItem](docs/PresentationItem.md)
 - [dev.androidbroadcast.framesdk.models.Project](docs/Project.md)
 - [dev.androidbroadcast.framesdk.models.ProjectDevice](docs/ProjectDevice.md)
 - [dev.androidbroadcast.framesdk.models.ProjectDeviceAssetType](docs/ProjectDeviceAssetType.md)
 - [dev.androidbroadcast.framesdk.models.ProjectDeviceAuthorization](docs/ProjectDeviceAuthorization.md)
 - [dev.androidbroadcast.framesdk.models.ProjectDeviceAuthorizationAuthorization](docs/ProjectDeviceAuthorizationAuthorization.md)
 - [dev.androidbroadcast.framesdk.models.ProjectDeviceAuthorizationAuthorizationCreator](docs/ProjectDeviceAuthorizationAuthorizationCreator.md)
 - [dev.androidbroadcast.framesdk.models.ProjectDeviceAuthorizationAuthorizationScopes](docs/ProjectDeviceAuthorizationAuthorizationScopes.md)
 - [dev.androidbroadcast.framesdk.models.ProjectDeviceAuthorizationProject](docs/ProjectDeviceAuthorizationProject.md)
 - [dev.androidbroadcast.framesdk.models.ProjectDeviceChannel](docs/ProjectDeviceChannel.md)
 - [dev.androidbroadcast.framesdk.models.ProjectMembership](docs/ProjectMembership.md)
 - [dev.androidbroadcast.framesdk.models.ProjectPreferences](docs/ProjectPreferences.md)
 - [dev.androidbroadcast.framesdk.models.RealtimeAssetResponse](docs/RealtimeAssetResponse.md)
 - [dev.androidbroadcast.framesdk.models.RequiredTranscodes](docs/RequiredTranscodes.md)
 - [dev.androidbroadcast.framesdk.models.ReviewLink](docs/ReviewLink.md)
 - [dev.androidbroadcast.framesdk.models.ReviewLinkItem](docs/ReviewLinkItem.md)
 - [dev.androidbroadcast.framesdk.models.ReviewLinkItemsDeleteRequest](docs/ReviewLinkItemsDeleteRequest.md)
 - [dev.androidbroadcast.framesdk.models.ReviewLinkReviewerInviteRequest](docs/ReviewLinkReviewerInviteRequest.md)
 - [dev.androidbroadcast.framesdk.models.SMPTETimeRepresentation](docs/SMPTETimeRepresentation.md)
 - [dev.androidbroadcast.framesdk.models.SMPTETimeRepresentationRate](docs/SMPTETimeRepresentationRate.md)
 - [dev.androidbroadcast.framesdk.models.SessionWatermarkBlock](docs/SessionWatermarkBlock.md)
 - [dev.androidbroadcast.framesdk.models.SessionWatermarkDataPoint](docs/SessionWatermarkDataPoint.md)
 - [dev.androidbroadcast.framesdk.models.SessionWatermarkTemplate](docs/SessionWatermarkTemplate.md)
 - [dev.androidbroadcast.framesdk.models.ShareableEntityAccessControl](docs/ShareableEntityAccessControl.md)
 - [dev.androidbroadcast.framesdk.models.Subscription](docs/Subscription.md)
 - [dev.androidbroadcast.framesdk.models.Team](docs/Team.md)
 - [dev.androidbroadcast.framesdk.models.TriggerRealtimeLoggingEventRequest](docs/TriggerRealtimeLoggingEventRequest.md)
 - [dev.androidbroadcast.framesdk.models.UpdatePresentationRequest](docs/UpdatePresentationRequest.md)
 - [dev.androidbroadcast.framesdk.models.User](docs/User.md)
 - [dev.androidbroadcast.framesdk.models.UserPermissions](docs/UserPermissions.md)
 - [dev.androidbroadcast.framesdk.models.UserRoles](docs/UserRoles.md)
 - [dev.androidbroadcast.framesdk.models.Watermark](docs/Watermark.md)
 - [dev.androidbroadcast.framesdk.models.WatermarkImage](docs/WatermarkImage.md)
 - [dev.androidbroadcast.framesdk.models.WatermarkText](docs/WatermarkText.md)
 - [dev.androidbroadcast.framesdk.models.Webhook](docs/Webhook.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="JWT"></a>
### JWT

- **Type**: HTTP Bearer Token authentication (JWT)

<a id="DeveloperToken"></a>
### DeveloperToken

- **Type**: HTTP Bearer Token authentication

<a id="OAuth2"></a>
### OAuth2

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://applications.frame.io/oauth2/auth
- **Scopes**: 
  - presentation.update: modify presentations
  - comment.read: read comments
  - asset.update: modify assets
  - reviewlink.update: modify review links
  - webhook.create: create webhooks
  - account.read: read accounts
  - action.update: modify actions
  - reviewlink.read: read review links
  - presentation.read: read presentations
  - action.create: create actions
  - presentation.create: create presentations
  - auditlog.read: read audit logs
  - team.create: create teams
  - comment.create: create comments
  - team.read: read teams
  - offline: generate refresh tokens
  - reviewlink.delete: delete review links
  - project.update: modify projects
  - project.delete: delete projects
  - webhook.delete: delete webhooks
  - action.delete: delete actions
  - asset.delete: delete assets
  - webhook.read: read webhooks
  - asset.create: create assets
  - comment.delete: delete comments
  - webhook.update: modify webhooks
  - asset.read: read assets
  - comment.update: modify comments
  - project.read: read projects
  - action.read: read actions
  - reviewlink.create: create review links
  - presentation.delete: delete presentations
  - project.create: create projects
  - team.update: modify teams

<a id="OAuth2"></a>
### OAuth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://applications.frame.io/oauth2/auth
- **Scopes**: 
  - presentation.update: modify presentations
  - comment.read: read comments
  - asset.update: modify assets
  - reviewlink.update: modify review links
  - webhook.create: create webhooks
  - account.read: read accounts
  - action.update: modify actions
  - reviewlink.read: read review links
  - presentation.read: read presentations
  - action.create: create actions
  - presentation.create: create presentations
  - auditlog.read: read audit logs
  - team.create: create teams
  - comment.create: create comments
  - team.read: read teams
  - offline: generate refresh tokens
  - reviewlink.delete: delete review links
  - project.update: modify projects
  - project.delete: delete projects
  - webhook.delete: delete webhooks
  - action.delete: delete actions
  - asset.delete: delete assets
  - webhook.read: read webhooks
  - asset.create: create assets
  - comment.delete: delete comments
  - webhook.update: modify webhooks
  - asset.read: read assets
  - comment.update: modify comments
  - project.read: read projects
  - action.read: read actions
  - reviewlink.create: create review links
  - presentation.delete: delete presentations
  - project.create: create projects
  - team.update: modify teams

<a id="C2CDeviceAuth"></a>
### C2CDeviceAuth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://api.frame.io/v2/auth/device/code
- **Scopes**: 
  - offline: Enables refreshing of tokens
  - asset_create: Enables ability to create assets in fixed folder structure

<a id="C2COAuth2"></a>
### C2COAuth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://applications.frame.io/oauth2/auth
- **Scopes**: 
  - offline: Enables refreshing of tokens
  - asset_create: Enables ability to create assets in fixed folder structure
  - device_connect: Enables ability to connect to project as a device



## Author

platform@frame.io
