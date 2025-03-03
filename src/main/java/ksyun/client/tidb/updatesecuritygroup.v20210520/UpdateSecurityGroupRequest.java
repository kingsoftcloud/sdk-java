package ksyun.client.tidb.updatesecuritygroup.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class UpdateSecurityGroupRequest {
    /**
     * 安全组名称。
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 安全组新名称。请注意：SecurityGroupName和Description参数必填其一。
     */
    @KsYunField(name = "SecurityGroupName")
    private String SecurityGroupName;

    /**
     * 安全组新描述。请注意：SecurityGroupName和Description参数必填其一。
     */
    @KsYunField(name = "Description")
    private String Description;

}