package ksyun.client.sqlserver.clonesecuritygroup.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CloneSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class CloneSecurityGroupRequest {
    /**
     * 安全组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 安全组名称
     */
    @KsYunField(name = "SecurityGroupName")
    private String SecurityGroupName;

    /**
     * 安全组描述
     */
    @KsYunField(name = "SecurityGroupDescription")
    private String SecurityGroupDescription;

}