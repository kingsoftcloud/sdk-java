package ksyun.client.iam.updateroletrustaccounts.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname UpdateRoleTrustAccountsRequest
 * @Description 请求参数
 */
@Data
public class UpdateRoleTrustAccountsRequest {
    /**
     * 角色名称
     */
    @KsYunField(name = "RoleName")
    private String RoleName;

    /**
     * 信任账号列表(多个账号之间使用半角逗号(,)分隔，最多可以有20个账号)
     */
    @KsYunField(name = "NewTrustAccounts")
    private String NewTrustAccounts;


}