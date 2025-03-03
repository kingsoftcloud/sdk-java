package ksyun.client.tidb.unbindsecuritygroup.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UnbindSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class UnbindSecurityGroupRequest {
    /**
     * 安全组ID。
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 实例ID列表。多个ID以英文逗号分隔。
     */
    @KsYunField(name = "InstanceIds")
    private String InstanceIds;


}