package ksyun.client.tidb.bindsecuritygroup.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname BindSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class BindSecurityGroupRequest {
    /**
     * 安全组ID。
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 实例ID列表。多个ID请以英文逗号分隔。
     */
    @KsYunField(name = "InstanceIds")
    private String InstanceIds;

}