package ksyun.client.iam.removeuserfromgroup.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RemoveUserFromGroupRequest
 * @Description 请求参数
 */
@Data
public class RemoveUserFromGroupRequest {
    /**
     * 用户组名称
     */
    @KsYunField(name = "GroupName")
    private String GroupName;

    /**
     * 待移除的子用户名称
     */
    @KsYunField(name = "UserName")
    private String UserName;

}