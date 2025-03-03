package ksyun.client.iam.deletegroup.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteGroupRequest
 * @Description 请求参数
 */
@Data
public class DeleteGroupRequest {
    /**
     * 用户组名称
     */
    @KsYunField(name = "GroupName")
    private String GroupName;

}