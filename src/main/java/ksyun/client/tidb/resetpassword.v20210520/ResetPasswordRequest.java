package ksyun.client.tidb.resetpassword.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ResetPasswordRequest
 * @Description 请求参数
 */
@Data
public class ResetPasswordRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 实例管理员账户新密码。
     * 正则规则:'^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9!@#$%^&*()_+=-]{8,30}$'
     */
    @KsYunField(name = "AdminPassword")
    private String AdminPassword;

}