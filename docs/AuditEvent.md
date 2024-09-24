
# AuditEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.String** |  |  [optional] |
| **anonymousUserId** | **kotlin.String** |  |  [optional] |
| **client** | **kotlin.String** | The API client the audit event was triggered by. This will not always be populated.  When the API call that produced an event was made via an OAuth app it will look like: &#x60;oauth_app/:uuid&#x60;, and if it was made via a developer token it will look like: &#x60;user_token/:uuid&#x60;, with the UUID being the User ID the token belongs to  Here are some examples:   - &#x60;user_token/57823879-e541-49b0-b902-c43794c4400c&#x60;  - &#x60;oauth_app/80ccf0bb-ae91-49c4-8aec-8f6238c14947&#x60;  - &#x60;web/2024-06-10-18-15&#x60;  - &#x60;pipeline-media-warden/cbd0061f6f190489e8af3137b8707b33f498f53f&#x60;  - &#x60;null&#x60; |  [optional] |
| **eventType** | [**inline**](#EventType) |  |  [optional] |
| **eventDetails** | **kotlin.String** | The details for the event. This varies quite a bit from one type of event to another but there are some examples in the example responses. |  [optional] |
| **id** | **kotlin.Double** | Unique identifier |  [optional] |
| **insertedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **ipAddress** | **kotlin.String** | The IP address associated with this event |  [optional] |
| **projectId** | **kotlin.String** | The Project ID that this action occured in |  [optional] |
| **resourceId** | **kotlin.String** | The ID of the referenced resource |  [optional] |
| **resourceType** | [**inline**](#ResourceType) | The type of the referenced resource |  [optional] |
| **teamId** | **kotlin.String** | Team ID |  [optional] |
| **source** | [**inline**](#Source) | The Source of the action that produced a given audit log entry |  [optional] |
| **userId** | **kotlin.String** | User ID |  [optional] |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |


<a id="EventType"></a>
## Enum: event_type
| Name | Value |
| ---- | ----- |
| eventType | account_locked, account_member_created, account_member_deleted, account_member_updated, account_mfa_enforced, account_fio_version_migrated, account_fio_version_migrated, account_ownership_transferred, account_restored, account_updated, label_updated, collaborator_added, comment_created, email_address_changed, email_confirmed, google_auth_disabled, join_presentation_request_approved, join_project_request_approved, join_review_link_request_approved, join_team_request_approved, login_factor_created, login_factor_validated, account_permissions_granted_to_user, comment_liked, email_change_confirmation_requested, file_uploaded, google_auth_enabled, new_user_email_confirmation_requested, project_permissions_granted_to_account_user_group, project_permissions_granted_to_user, resource_invite_sent, share_viewed, transfer_batch_completed, user_mfa_enforced, workspace_permissions_granted_to_account_user_group, workspace_permissions_granted_to_user, new_device_login, password_changed, password_reset_requested, pending_account_member_created, pending_account_member_deleted, pending_team_member_created, pending_team_member_deleted, project_unarchived, push_tokens_added, push_tokens_deleted, role_added, role_removed, session_revoked, team_created, team_creator_updated, team_deleted, team_lifecycle_policy_updated, team_member_created, team_member_deleted, team_member_reset, team_member_updated, team_updated, user_deactivated, user_login, user_login_attempt, user_reactivated, user_updated, anonymous_user_created, comment_completed, comment_deleted, comment_uncompleted, comment_updated, join_request_accepted, join_request_created, join_request_declined, join_request_deleted, join_request_reset, pending_reviewer_created, pending_reviewer_deleted, presentation_created, presentation_deleted, presentation_updated, project_archived, project_created, project_deleted, project_invite_link_created, project_invite_link_revoked, project_moved, project_restored, project_updated, reviewer_created, reviewer_deleted, review_link_assets_added, review_link_assets_deleted, review_link_created, review_link_deleted, review_link_emailed, review_link_updated, subscription_cancelled, subscription_card_updated, subscription_created, subscription_line_item_created, subscription_line_item_deleted, subscription_restored, subscription_updated, user_signup, action_created, action_deleted, action_updated, oauth_app_created, oauth_app_deleted, oauth_app_updated, oauth_app_enabled, oauth_app_disabled, user_token_created, user_token_deleted, user_token_disabled, user_token_enabled, user_token_updated, webhook_created, webhook_deleted, webhook_updated, asset_copied, asset_created, asset_deleted, asset_moved, asset_restored, assets_unversioned, asset_updated, asset_versioned, high_risk_sign_up, sbwm_template_created, sbwm_template_deleted, sbwm_template_updated, allowed_domain_created, allowed_domain_deleted, collaborator_deleted, media_deleted, asset_metadata_created, media_created, pending_collaborator_created, pending_collaborator_deleted, plan_created, plan_deleted, plan_updated, preference_updated, asset_archived, asset_unarchived, project_archive_completed, project_unarchive_completed, reply_created |


<a id="ResourceType"></a>
## Enum: resource_type
| Name | Value |
| ---- | ----- |
| resourceType | account, account_member, action, anonymous_user, asset, comment_impression, comment, folder, join_request, login_factor, oauth_app, pending_account_member, pending_reviewer, pending_team_member, presentation, project, project_invite_link, reviewer, review_link, reset_token, share, subscription, subscription_line_item, team, team_member, user, user_token, transfer_batch, version_stack, webhook |


<a id="Source"></a>
## Enum: source
| Name | Value |
| ---- | ----- |
| source | device, internal, external, unknown |



