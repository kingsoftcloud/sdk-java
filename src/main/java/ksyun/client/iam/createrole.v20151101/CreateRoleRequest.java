package ksyun.client.iam.createrole.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateRoleRequest
 * @Description 请求参数
 */
@Data
public class CreateRoleRequest {
    /**
     * 角色名称
     */
    @KsYunField(name = "RoleName")
    private String RoleName;

    /**
     * 信任账号列表(多个账号之间使用半角逗号(,)分隔，最多可以有20个账号)
     */
    @KsYunField(name = "TrustAccounts")
    private String TrustAccounts;

    /**
     * 角色描述
     */
    @KsYunField(name = "Description")
    private String Description;


}