package ksyun.client.kmr.stopinstances.v20210902;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StopInstancesRequest
* @Description 请求参数
*/
@Data
public class StopInstancesRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**主机实例ID*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;

}
