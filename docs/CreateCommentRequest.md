
# CreateCommentRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **text** | **kotlin.String** | The body of the comment. |  |
| **&#x60;annotation&#x60;** | **kotlin.String** | Serialized list of geometry and/or drawing data.  Learn more [here](https://developer.frame.io/docs/workflows-assets/working-with-annotations) |  [optional] |
| **page** | **kotlin.Int** | Page number for a comment (documents only). |  [optional] |
| **pitch** | **kotlin.Int** | Pitch measurement for the comment (360deg video only). |  [optional] |
| **timestamp** | **kotlin.Double** | Timestamp for the comment, in frames, starting at 0.   Comments can \&quot;global\&quot; to an asset in which you don&#39;t provide the timestamp, or if you&#39;re reviewing a \&quot;document\&quot; like a PDF then you would use &#x60;page&#x60; instead of &#x60;timestamp&#x60; to identify where the comment belongs. |  [optional] |
| **yaw** | **kotlin.Int** | Yaw measurement for the comment (360deg video only). |  [optional] |
| **duration** | **kotlin.Int** | Used to produce range-based comments, this is the duration measured in frames. |  [optional] |
| **&#x60;private&#x60;** | **kotlin.Boolean** | Set to true to make your comment a \&quot;Team-only Comment\&quot; that won&#39;t be visible to anonymous reviewers or Collaborators. |  [optional] |



