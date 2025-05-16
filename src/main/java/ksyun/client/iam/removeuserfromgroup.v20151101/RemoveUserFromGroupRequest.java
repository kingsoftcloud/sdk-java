package ksyun.client.iam.removeuserfromgroup.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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