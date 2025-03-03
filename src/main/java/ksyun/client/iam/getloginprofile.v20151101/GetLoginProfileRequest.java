package ksyun.client.iam.getloginprofile.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetLoginProfileRequest
 * @Description 请求参数
 */
@Data
public class GetLoginProfileRequest {
    /**
     * 要查询的IAM子用户名称
     */
    @KsYunField(name = "UserName")
    private String UserName;

    /***/
    @KsYunField(name = "NotCheckPassword")
    private Integer NotCheckPassword;


}