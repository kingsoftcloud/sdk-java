package ksyun.client.milvus.unbindsecuritygroupinstances.v20231010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname UnbindSecurityGroupInstancesRequest
 * @Description 请求参数
 */
@Data
public class UnbindSecurityGroupInstancesRequest {
    /**
     * 安区组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 实例列表，支持批量(英文逗号隔开)
     */
    @KsYunField(name = "InstancesIds")
    private String InstancesIds;

}