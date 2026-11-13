package ksyun.client.aicp.removephysicalqueueinstances.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RemovePhysicalQueueInstancesResponse
* @Description RemovePhysicalQueueInstances 返回体
*/
@Data
@ToString
public class RemovePhysicalQueueInstancesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**队列ID*/
    @JsonProperty("QueueId")
    private String QueueId;

}
