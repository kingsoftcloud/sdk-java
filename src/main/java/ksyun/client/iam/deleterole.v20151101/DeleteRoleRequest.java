package ksyun.client.iam.deleterole.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteRoleRequest
 * @Description 请求参数
 */
@Data
public class DeleteRoleRequest {
    /**
     * 要删除的角色名称
     */
    @KsYunField(name = "RoleName")
    private String RoleName;


}