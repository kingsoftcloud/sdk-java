package ksyun.client.milvus.bindsecuritygroupinstances.v20231010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname BindSecurityGroupInstancesRequest
* @Description 请求参数
*/
@Data
public class BindSecurityGroupInstancesRequest{
    /**安全组ID*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**实例列表，支持批量(英文逗号隔开)*/
    @KsYunField(name="InstancesIds")
    private String InstancesIds;

}
