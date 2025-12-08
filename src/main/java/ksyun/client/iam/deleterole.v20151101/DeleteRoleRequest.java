package ksyun.client.iam.deleterole.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteRoleRequest
* @Description 请求参数
*/
@Data
public class DeleteRoleRequest{
    /**要删除的角色名称*/
    @KsYunField(name="RoleName")
    private String RoleName;

}
