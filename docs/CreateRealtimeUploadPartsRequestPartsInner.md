
# CreateRealtimeUploadPartsRequestPartsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **number** | **kotlin.Int** | The part number/index, starting at 1. Part numbers may be skipped, and may be uploaded in any order, but will be used to concatinate the final file in sequentual order.   Cannot be greater than 10,000 (the maximum number of parts that AWS allows). |  |
| **propertySize** | **kotlin.Int** | The size of the part in bytes. If the size does not abide by the [AWS Multi-Part upload restrictions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/qfacts.html), an error will be returned.  For instance, must be greater than or equal to 5 MiB, (5,242,880 bytes) is &#x60;is_final&#x60; is not t&#x60;true&#x60;. |  |
| **isFinal** | **kotlin.Boolean** | Whether this is the final part of the file. |  |



