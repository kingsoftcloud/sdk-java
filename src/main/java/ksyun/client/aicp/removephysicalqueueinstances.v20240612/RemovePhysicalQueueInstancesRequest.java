package ksyun.client.aicp.removephysicalqueueinstances.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemovePhysicalQueueInstancesRequest
* @Description 请求参数
*/
@Data
public class RemovePhysicalQueueInstancesRequest{
    /**队列ID*/
    @KsYunField(name="QueueId")
    private String QueueId;

    /**待移除的实例ID列表，至少一个；重复 ID 自动去重*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;

}
