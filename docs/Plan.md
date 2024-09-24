
# Plan

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **archivedStorageLimit** | **kotlin.Int** |  |  [optional] |
| **autoscaling** | **kotlin.Boolean** |  |  [optional] |
| **availableFeatures** | [**AvailableFeatures**](AvailableFeatures.md) |  |  [optional] |
| **collaboratorLimit** | **kotlin.Int** |  |  [optional] |
| **cost** | **kotlin.Int** |  |  [optional] |
| **defaultPlan** | **kotlin.Boolean** |  |  [optional] |
| **deletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **enterprise** | **kotlin.Boolean** |  |  [optional] |
| **fileLimit** | **kotlin.Int** |  |  [optional] |
| **id** | **kotlin.String** |  |  [optional] |
| **insertedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **lifetimeFileLimit** | **kotlin.Int** |  |  [optional] |
| **memberLimit** | **kotlin.Int** |  |  [optional] |
| **name** | **kotlin.String** |  |  [optional] |
| **paymentMethod** | [**inline**](#PaymentMethod) |  |  [optional] |
| **period** | [**inline**](#Period) |  |  [optional] |
| **projectLimit** | **kotlin.Int** |  |  [optional] |
| **storageLimit** | **kotlin.Int** |  |  [optional] |
| **teamLimit** | **kotlin.Int** |  |  [optional] |
| **tier** | [**inline**](#Tier) |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] |
| **userLimit** | **kotlin.Int** |  |  [optional] |
| **userMax** | **kotlin.Int** |  |  [optional] |
| **version** | **kotlin.Int** |  |  [optional] |


<a id="PaymentMethod"></a>
## Enum: payment_method
| Name | Value |
| ---- | ----- |
| paymentMethod | stripe, check |


<a id="Period"></a>
## Enum: period
| Name | Value |
| ---- | ----- |
| period | monthly, yearly, semiannually |


<a id="Tier"></a>
## Enum: tier
| Name | Value |
| ---- | ----- |
| tier | free, starter, pro, team, business, enterprise |



