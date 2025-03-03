package ksyun.client.sqlserver.modifysecuritygroup.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifySecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class ModifySecurityGroupRequest {
    /**
     * 安全组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 安全组名称
     * <p>
     * ```json
     * 描述和名称至少填写一项
     * ```
     */
    @KsYunField(name = "SecurityGroupName")
    private String SecurityGroupName;

    /**
     * 安全组描述
     * ```json
     * 描述和名称至少填写一项
     * ```
     */
    @KsYunField(name = "SecurityGroupDescription")
    private String SecurityGroupDescription;

}