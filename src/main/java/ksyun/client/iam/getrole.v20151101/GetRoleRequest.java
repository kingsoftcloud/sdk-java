package ksyun.client.iam.getrole.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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