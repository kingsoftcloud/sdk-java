package ksyun.client.ked.userspasswordreset.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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