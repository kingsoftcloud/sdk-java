package ksyun.client.kmr.startinstances.v20210902;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StartInstancesRequest
* @Description 请求参数
*/
@Data
public class StartInstancesRequest{
    /**集群ID
*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**主机实例ID
*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;

}