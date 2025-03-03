package ksyun.client.iam.deleteuser.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteUserRequest
 * @Description 请求参数
 */
@Data
public class DeleteUserRequest {
    /**
     * UserName
     */
    @KsYunField(name = "UserName")
    private String UserName;

}