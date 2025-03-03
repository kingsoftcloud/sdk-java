package ksyun.client.iam.createuser.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateUserRequest
 * @Description 请求参数
 */
@Data
public class CreateUserRequest {
    /**
     * 待创建的IAM用户的用户名
     */
    @KsYunField(name = "UserName")
    private String UserName;

    /**
     * 待创建的IAM用户的真实姓名
     */
    @KsYunField(name = "RealName")
    private String RealName;

    /**
     * 手机号码
     */
    @KsYunField(name = "Phone")
    private String Phone;

    /**
     * 邮箱
     */
    @KsYunField(name = "Email")
    private String Email;

    /**
     * 备注
     */
    @KsYunField(name = "Remark")
    private String Remark;

    /**
     * 用户密码
     */
    @KsYunField(name = "Password")
    private String Password;

    /**
     * 登录是否重置密码
     */
    @KsYunField(name = "PasswordResetRequired")
    private Integer PasswordResetRequired;

    /**
     * 是否开启登录保护
     */
    @KsYunField(name = "OpenLoginProtection")
    private Integer OpenLoginProtection;

    /**
     * 是否开启操作保护
     */
    @KsYunField(name = "OpenSecurityProtection")
    private Integer OpenSecurityProtection;

    /**
     * 子用户查看所有项目
     */
    @KsYunField(name = "ViewAllProject")
    private Integer ViewAllProject;


}