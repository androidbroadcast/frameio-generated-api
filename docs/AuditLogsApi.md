# AuditLogsApi

All URIs are relative to *https://api.frame.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAccountAuditLogs**](AuditLogsApi.md#getAccountAuditLogs) | **GET** /v2/accounts/{account_id}/events | Get audit log entries for an Account |
| [**getAuditLogs**](AuditLogsApi.md#getAuditLogs) | **GET** /v2/accounts/{account_id}/audit_logs | (Legacy) Get Audit Logs for an Account |
| [**getUserAuditLogs**](AuditLogsApi.md#getUserAuditLogs) | **GET** /v2/users/{user_id}/events | Get audit log entries for a specified User |


<a id="getAccountAuditLogs"></a>
# **getAccountAuditLogs**
> kotlin.collections.List&lt;AuditEvent&gt; getAccountAuditLogs(accountId, filtersStartDate, filtersEndDate, filtersResourceType, filtersEventType, filtersTeamId, filtersProjectId, filtersResourceId, filtersUserId, filtersIpAddress, page, pageSize)

Get audit log entries for an Account

Fetch audit logs with some filtering capabilities via query params

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AuditLogsApi()
val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Account ID
val filtersStartDate : kotlinx.datetime.LocalDate = Mon Jun 03 03:00:00 MSK 2024 // kotlinx.datetime.LocalDate | Start ISO Date
val filtersEndDate : kotlinx.datetime.LocalDate = Tue Jun 18 03:00:00 MSK 2024 // kotlinx.datetime.LocalDate | End ISO Date
val filtersResourceType : kotlin.String = filtersResourceType_example // kotlin.String | Filter by Resource Type
val filtersEventType : kotlin.String = filtersEventType_example // kotlin.String | Filter by Type of Activity
val filtersTeamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter by Team ID
val filtersProjectId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter by Project ID
val filtersResourceId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter by resource ID (Asset ID, Project ID, User ID)
val filtersUserId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter by User ID
val filtersIpAddress : kotlin.String = filtersIpAddress_example // kotlin.String | Filter by IP Address  This supports both IPv4 (`1.1.1.1`) and IPv6 (`2001:db8:3333:4444:5555:6666:7777:8888`)
val page : kotlin.Int = 56 // kotlin.Int | Page number
val pageSize : kotlin.Int = 56 // kotlin.Int | Records per page
try {
    val result : kotlin.collections.List<AuditEvent> = apiInstance.getAccountAuditLogs(accountId, filtersStartDate, filtersEndDate, filtersResourceType, filtersEventType, filtersTeamId, filtersProjectId, filtersResourceId, filtersUserId, filtersIpAddress, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuditLogsApi#getAccountAuditLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuditLogsApi#getAccountAuditLogs")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **kotlin.String**| Account ID | |
| **filtersStartDate** | **kotlinx.datetime.LocalDate**| Start ISO Date | [optional] |
| **filtersEndDate** | **kotlinx.datetime.LocalDate**| End ISO Date | [optional] |
| **filtersResourceType** | **kotlin.String**| Filter by Resource Type | [optional] [enum: asset, review_link, presentation, collaborator, pending_collaborator, comment, review_link_item, account, account_member, pending_account_member, subscription, subscription_line_item, team, team_member, pending_team_member, user, action, oauth_app, user_token, webhook, file, folder, version_stack, like, read] |
| **filtersEventType** | **kotlin.String**| Filter by Type of Activity | [optional] [enum: account_locked, account_member_created, account_member_deleted, account_member_updated, account_mfa_enforced, account_fio_version_migrated, account_fio_version_migrated, account_ownership_transferred, account_restored, account_updated, label_updated, collaborator_added, comment_created, join_presentation_request_approved, join_project_request_approved, join_review_link_request_approved, join_team_request_approved, account_permissions_granted_to_user, comment_liked, file_uploaded, project_permissions_granted_to_account_user_group, project_permissions_granted_to_user, resource_invite_sent, share_viewed, transfer_batch_completed, user_mfa_enforced, workspace_permissions_granted_to_account_user_group, workspace_permissions_granted_to_user, new_device_login, password_changed, password_reset_requested, pending_account_member_created, pending_account_member_deleted, pending_team_member_created, pending_team_member_deleted, project_unarchived, push_tokens_added, push_tokens_deleted, role_added, role_removed, session_revoked, team_created, team_creator_updated, team_deleted, team_lifecycle_policy_updated, team_member_created, team_member_deleted, team_member_reset, team_member_updated, team_updated, anonymous_user_created, comment_completed, comment_deleted, comment_uncompleted, comment_updated, join_request_accepted, join_request_created, join_request_declined, join_request_deleted, join_request_reset, pending_reviewer_created, pending_reviewer_deleted, presentation_created, presentation_deleted, presentation_updated, project_archived, project_created, project_deleted, project_invite_link_created, project_invite_link_revoked, project_moved, project_restored, project_updated, reviewer_created, reviewer_deleted, review_link_assets_added, review_link_assets_deleted, review_link_created, review_link_deleted, review_link_emailed, review_link_updated, subscription_cancelled, subscription_card_updated, subscription_created, subscription_line_item_created, subscription_line_item_deleted, subscription_restored, subscription_updated, action_created, action_deleted, action_updated, webhook_created, webhook_deleted, webhook_updated, asset_copied, asset_created, asset_deleted, asset_moved, asset_restored, assets_unversioned, asset_updated, asset_versioned, high_risk_sign_up, sbwm_template_created, sbwm_template_deleted, sbwm_template_updated, allowed_domain_created, allowed_domain_deleted, collaborator_deleted, media_deleted, asset_metadata_created, media_created, pending_collaborator_created, pending_collaborator_deleted, plan_created, plan_deleted, plan_updated, preference_updated, asset_archived, asset_unarchived, project_archive_completed, project_unarchive_completed, reply_created] |
| **filtersTeamId** | **kotlin.String**| Filter by Team ID | [optional] |
| **filtersProjectId** | **kotlin.String**| Filter by Project ID | [optional] |
| **filtersResourceId** | **kotlin.String**| Filter by resource ID (Asset ID, Project ID, User ID) | [optional] |
| **filtersUserId** | **kotlin.String**| Filter by User ID | [optional] |
| **filtersIpAddress** | **kotlin.String**| Filter by IP Address  This supports both IPv4 (&#x60;1.1.1.1&#x60;) and IPv6 (&#x60;2001:db8:3333:4444:5555:6666:7777:8888&#x60;) | [optional] |
| **page** | **kotlin.Int**| Page number | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Records per page | [optional] [default to 50] |

### Return type

[**kotlin.collections.List&lt;AuditEvent&gt;**](AuditEvent.md)

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

<a id="getAuditLogs"></a>
# **getAuditLogs**
> kotlin.collections.List&lt;Audit&gt; getAuditLogs(accountId, filterItemId, filterInsertedAtOp, filterInsertedAtValue, filterItemType, filterAction, filterActorId, filterTeamId, filterIpAddress, page, pageSize)

(Legacy) Get Audit Logs for an Account

Fetch audit logs with some filtering capabilities via query params

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AuditLogsApi()
val accountId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Account ID
val filterItemId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter by Item ID (Asset ID, Project ID, User ID)
val filterInsertedAtOp : kotlin.String = gt // kotlin.String | Filter by log datetime using logical operators
val filterInsertedAtValue : kotlinx.datetime.Instant = 2021-08-03T00:00Z // kotlinx.datetime.Instant | ISO Datetime
val filterItemType : kotlin.String = filterItemType_example // kotlin.String | Filter by Item Type
val filterAction : kotlin.String = filterAction_example // kotlin.String | Filter by Action
val filterActorId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter by Actor ID
val filterTeamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter by Team ID
val filterIpAddress : kotlin.String = filterIpAddress_example // kotlin.String | Filter by IP Address  This supports both IPv4 (`1.1.1.1`) and IPv6 (`2001:db8:3333:4444:5555:6666:7777:8888`)
val page : kotlin.Int = 56 // kotlin.Int | Page number
val pageSize : kotlin.Int = 56 // kotlin.Int | Records per page
try {
    val result : kotlin.collections.List<Audit> = apiInstance.getAuditLogs(accountId, filterItemId, filterInsertedAtOp, filterInsertedAtValue, filterItemType, filterAction, filterActorId, filterTeamId, filterIpAddress, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuditLogsApi#getAuditLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuditLogsApi#getAuditLogs")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **kotlin.String**| Account ID | |
| **filterItemId** | **kotlin.String**| Filter by Item ID (Asset ID, Project ID, User ID) | [optional] |
| **filterInsertedAtOp** | **kotlin.String**| Filter by log datetime using logical operators | [optional] [enum: eq, gt, lt, gte, lte] |
| **filterInsertedAtValue** | **kotlinx.datetime.Instant**| ISO Datetime | [optional] |
| **filterItemType** | **kotlin.String**| Filter by Item Type | [optional] [enum: asset, review_link, presentation, collaborator, pending_collaborator, comment, review_link_item, account, account_member, pending_account_member, subscription, subscription_line_item, team, team_member, pending_team_member, user, action, oauth_app, user_token, webhook, file, folder, version_stack, like, read] |
| **filterAction** | **kotlin.String**| Filter by Action | [optional] [enum: AssetDeleted, PresentationUpdated, AssetMoved, AssetVersioned, AccountDelinquent, CollaboratorDeleted, PushTokensAdded, AccountPendingUserRemoved, JoinRequestAccepted, SubscriptionRestored, EmailChanged, AccountMemberDeleted, AccountMemberUpdated, RoleAdded, ApplicationCreated, CommentCreated, AssetUpdated, CommentUpdated, CommentDeleted, AssetArchived, ProjectUpdated, TeamUpdated, ReviewLinkEmailed, SBWMTemplateDeleted, PendingTeamMemberCreated, PasswordResetRequested, ProjectInviteLinkCreated, AccountPendingCollaboratorsRemoved, GoogleAuthDisabled, TeamDeleted, ActionDeleted, ProjectCreated, PresentationCreated, AssetCopied, PreferenceUpdated, AccountCollaboratorsRemoved, PendingCollaboratorDeleted, ProjectMoved, ReviewerDeleted, PendingTeamMemberDeleted, ActionUpdated, AssetCreated, ReviewLinkUpdated, CollaboratorCreated, AssetsUnversioned, EmailConfirmed, TeamCreated, AccountUpdated, AccountRestored, JoinRequestCreated, SubscriptionCardUpdated, AccountLocked, TeamMemberUpdated, JoinRequestReset, WebhookDeleted, ProjectInviteLinksRevoked, WebhookCreated, SubscriptionLineItemDeleted, ApplicationUpdated, MetadataCreated, UserLoginAttempt, ReviewLinkAssetsAdded, ProjectDeleted, ProjectArchiveCompleted, AccountMemberCreated, OauthAppCreated, SessionRevoked, SubscriptionLineItemCreated, UserTokenDeleted, PendingReviewerDeleted, ActionCreated, TeamMemberReset, LoginFactorCreated, JoinRequestDeleted, UserTokenDisabled, AssetUnarchived, AssetLabelUpdated, SubscriptionCreated, PendingReviewerCreated, TeamMemberRemoved, PushTokensDeleted, ProjectUnarchived, SubscriptionCancelled, ProjectUnarchiveCompleted, ProjectRestored, WebhookUpdated, ApplicationDeleted, AssetHardDeleted, OauthAppDeleted, AccountMFAEnforced, AccountOwnershipTransferred, CommentCompleted, ReviewerCreated, UserLogin, SubscriptionUpdated, AssetRestored, CommentUncompleted, ProjectArchived, JoinRequestDeclined, PendingAccountMemberCreated, SBWMTemplateCreated, TeamCreatorUpdated, TeamLifecyclePolicyUpdated, SBWMTemplateUpdated, LoginFactorValidated, ReviewLinkCreated, TeamMemberCreated, ReplyCreated, UserUpdated, PendingCollaboratorCreated, AnonymousUserCreated, PasswordChange, ReviewLinkDeleted, AccountUserRemoved, UserTokenCreated, PresentationDeleted, UserTokenUpdated, OauthAppUpdated, UserTokenEnabled] |
| **filterActorId** | **kotlin.String**| Filter by Actor ID | [optional] |
| **filterTeamId** | **kotlin.String**| Filter by Team ID | [optional] |
| **filterIpAddress** | **kotlin.String**| Filter by IP Address  This supports both IPv4 (&#x60;1.1.1.1&#x60;) and IPv6 (&#x60;2001:db8:3333:4444:5555:6666:7777:8888&#x60;) | [optional] |
| **page** | **kotlin.Int**| Page number | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Records per page | [optional] [default to 50] |

### Return type

[**kotlin.collections.List&lt;Audit&gt;**](Audit.md)

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

<a id="getUserAuditLogs"></a>
# **getUserAuditLogs**
> kotlin.collections.List&lt;AuditEvent&gt; getUserAuditLogs(userId, filtersStartDate, filtersEndDate, filtersResourceType, filtersEventType, filtersTeamId, filtersProjectId, filtersResourceId, filtersUserId, filtersIpAddress, page, pageSize)

Get audit log entries for a specified User

Fetch audit logs for a given user with some filtering capabilities via query params. It works best to think of this as an _activity_ log for the specified user

### Example
```kotlin
// Import classes:
//import dev.androidbroadcast.framesdk.infrastructure.*
//import dev.androidbroadcast.framesdk.models.*

val apiInstance = AuditLogsApi()
val userId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | User ID
val filtersStartDate : kotlinx.datetime.LocalDate = Mon Jun 03 03:00:00 MSK 2024 // kotlinx.datetime.LocalDate | Start ISO Date
val filtersEndDate : kotlinx.datetime.LocalDate = Tue Jun 18 03:00:00 MSK 2024 // kotlinx.datetime.LocalDate | End ISO Date
val filtersResourceType : kotlin.String = filtersResourceType_example // kotlin.String | Filter by Resource Type
val filtersEventType : kotlin.String = filtersEventType_example // kotlin.String | Filter by Type of Activity
val filtersTeamId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter by Team ID
val filtersProjectId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter by Project ID
val filtersResourceId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter by resource ID (Asset ID, Project ID, User ID)
val filtersUserId : kotlin.String = 38400000-8cf0-11bd-b23e-10b96e4ef00d // kotlin.String | Filter by User ID
val filtersIpAddress : kotlin.String = filtersIpAddress_example // kotlin.String | Filter by IP Address
val page : kotlin.Int = 56 // kotlin.Int | Page number
val pageSize : kotlin.Int = 56 // kotlin.Int | Records per page
try {
    val result : kotlin.collections.List<AuditEvent> = apiInstance.getUserAuditLogs(userId, filtersStartDate, filtersEndDate, filtersResourceType, filtersEventType, filtersTeamId, filtersProjectId, filtersResourceId, filtersUserId, filtersIpAddress, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuditLogsApi#getUserAuditLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuditLogsApi#getUserAuditLogs")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**| User ID | |
| **filtersStartDate** | **kotlinx.datetime.LocalDate**| Start ISO Date | [optional] |
| **filtersEndDate** | **kotlinx.datetime.LocalDate**| End ISO Date | [optional] |
| **filtersResourceType** | **kotlin.String**| Filter by Resource Type | [optional] [enum: asset, review_link, presentation, collaborator, pending_collaborator, comment, review_link_item, account, account_member, pending_account_member, subscription, subscription_line_item, team, team_member, pending_team_member, user, action, oauth_app, user_token, webhook, file, folder, version_stack, like, read] |
| **filtersEventType** | **kotlin.String**| Filter by Type of Activity | [optional] [enum: email_address_changed, email_change_confirmation_requested, email_confirmed, google_auth_disabled, google_auth_enabled, login_factor_created, login_factor_validated, new_device_login, new_user_email_confirmation_requested, oauth_app_created, oauth_app_deleted, password_changed, password_reset_requested, push_tokens_added, push_tokens_deleted, role_added, role_removed, session_revoked, user_deactivated, user_login, user_login_attempt, user_mfa_enforced, user_reactivated, user_signup, user_token_created, user_token_deleted, user_token_disabled, user_token_enabled, user_token_updated, user_updated] |
| **filtersTeamId** | **kotlin.String**| Filter by Team ID | [optional] |
| **filtersProjectId** | **kotlin.String**| Filter by Project ID | [optional] |
| **filtersResourceId** | **kotlin.String**| Filter by resource ID (Asset ID, Project ID, User ID) | [optional] |
| **filtersUserId** | **kotlin.String**| Filter by User ID | [optional] |
| **filtersIpAddress** | **kotlin.String**| Filter by IP Address | [optional] |
| **page** | **kotlin.Int**| Page number | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Records per page | [optional] [default to 50] |

### Return type

[**kotlin.collections.List&lt;AuditEvent&gt;**](AuditEvent.md)

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

