package ksyun.client.iam.updaterole.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateRoleRequest
 * @Description 请求参数
 */
@Data
public class UpdateRoleRequest {
    /**
     * 角色名称
     */
    @KsYunField(name = "RoleName")
    private String RoleName;

    /**
     * 新角色描述
     */
    @KsYunField(name = "NewDescription")
    private String NewDescription;

}