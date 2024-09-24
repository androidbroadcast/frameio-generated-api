
# SMPTETimeRepresentationRate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **playback** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Playback speed of the framerate, represented as a &#x60;[numerator, denominator]&#x60; pair in an array. Optionally, this field also accepts fractions in string format, &#x60;\&quot;numerator/denominator\&quot;&#x60;. NTSC framerates like 23.98 should be sent as they&#39;re fully qualified rational value: &#x60;[24000, 1001]&#x60;. |  [optional] |
| **ntsc** | [**inline**](#Ntsc) | The NTSC standard of the timecode. Can be &#x60;\&quot;non_drop\&quot;&#x60; or &#x60;null&#x60;. If &#x60;null&#x60;, playback must represent a whole-number value, such as &#x60;[24, 1]&#x60;. If &#x60;\&quot;non_drop\&quot;&#x60;, playback must represent a valid NTSC framerate, such as &#x60;[24000, 1001]&#x60;. |  [optional] |


<a id="Ntsc"></a>
## Enum: ntsc
| Name | Value |
| ---- | ----- |
| ntsc | ntsc |



