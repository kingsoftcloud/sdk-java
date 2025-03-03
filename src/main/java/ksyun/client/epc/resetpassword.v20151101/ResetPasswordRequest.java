package ksyun.client.epc.resetpassword.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ResetPasswordRequest
 * @Description 请求参数
 */
@Data
public class ResetPasswordRequest {
    /**
     * 裸金属服务器资源ID
     */
    @KsYunField(name = "HostId")
    private String HostId;

    /**
     * 云物理主机的root密码
     */
    @KsYunField(name = "Password")
    private String Password;


}