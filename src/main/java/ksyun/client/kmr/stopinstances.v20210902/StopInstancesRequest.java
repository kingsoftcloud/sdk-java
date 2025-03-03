package ksyun.client.kmr.stopinstances.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname StopInstancesRequest
 * @Description 请求参数
 */
@Data
public class StopInstancesRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 主机实例ID
     */
    @KsYunField(name = "InstanceIds", type = 2)
    private List<String> InstanceIdsList;

}