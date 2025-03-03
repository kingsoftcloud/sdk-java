package ksyun.client.tidb.rebindsecuritygroup.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RebindSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class RebindSecurityGroupRequest {
    /**
     * 安全组ID。
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}