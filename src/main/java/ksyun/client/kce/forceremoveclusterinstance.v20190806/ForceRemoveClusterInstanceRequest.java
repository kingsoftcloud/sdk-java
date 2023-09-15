package ksyun.client.kce.forceremoveclusterinstance.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ForceRemoveClusterInstanceRequest
* @Description 请求参数
*/
@Data
public class ForceRemoveClusterInstanceRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**需要强制移除的节点id列表*/
    @KsYunField(name="InstanceId")
    private List<String> InstanceIdList;


}