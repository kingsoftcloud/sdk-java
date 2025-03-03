package ksyun.client.ked.userspasswordreset.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UserspasswordresetRequest
 * @Description 请求参数
 */
@Data
public class UserspasswordresetRequest {
    /**
     * 主键 id
     */
    @KsYunField(name = "id")
    private Integer Id;

    /**
     * base64 加密后的密码
     */
    @KsYunField(name = "password")
    private String Password;


}