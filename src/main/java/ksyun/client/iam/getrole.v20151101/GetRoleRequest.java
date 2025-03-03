package ksyun.client.iam.getrole.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetRoleRequest
 * @Description 请求参数
 */
@Data
public class GetRoleRequest {
    /**
     * 要查询的角色名称
     */
    @KsYunField(name = "RoleName")
    private String RoleName;


}