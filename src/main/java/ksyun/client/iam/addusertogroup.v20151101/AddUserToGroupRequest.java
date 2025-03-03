package ksyun.client.iam.addusertogroup.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AddUserToGroupRequest
 * @Description 请求参数
 */
@Data
public class AddUserToGroupRequest {
    /**
     * 用户组名称
     */
    @KsYunField(name = "GroupName")
    private String GroupName;

    /**
     * 要添加的IAM子用户名称
     */
    @KsYunField(name = "UserName")
    private String UserName;


}