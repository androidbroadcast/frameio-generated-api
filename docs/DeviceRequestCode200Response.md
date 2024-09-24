
# DeviceRequestCode200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **deviceCode** | **kotlin.String** | The device code should be hidden from the user, and is used to identify this authorization request when polling to see if the user has entered their code successfully. |  |
| **expiresIn** | **kotlin.Double** | The number of seconds until this code expires. |  |
| **interval** | **kotlin.Double** | How long the we should wait between polling requests to see if the user has entered the code. |  |
| **name** | **kotlin.String** | The name of the device we are trying to connect. |  |
| **userCode** | **kotlin.String** | The six-digit code the user will enter into Frame.io to pair the device to a project. |  |



