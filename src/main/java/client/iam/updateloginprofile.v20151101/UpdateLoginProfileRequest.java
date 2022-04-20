package client.iam.updateloginprofile.v20151101;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateLoginProfileRequest
* @Description 请求参数
*/
@Data
public class UpdateLoginProfileRequest{
    /**待更新登录配置的IAM用户名*/
    @KsYunField(name="UserName")
    private String UserName;

    /**新密码*/
    @KsYunField(name="Password")
    private String Password;

    /**可选参数，标识用户下次成功登录后是否需要设置新密码,带参数调用即为true，否则不带参数为false*/
    @KsYunField(name="PasswordResetRequired")
    private Boolean PasswordResetRequired;

    /**可选参数，开启登录操作保护，不带参数不处理，带参数 为true开启，false关闭*/
    @KsYunField(name="OpenLoginProtection")
    private Boolean OpenLoginProtection;

    /**可选参数，开启敏感操作保护，不带参数不处理，带参数 为true开启，false关闭*/
    @KsYunField(name="OpenSecurityProtection")
    private Boolean OpenSecurityProtection;

    /**可选参数，标识用户是否可以查看全部项目,带参数调用即为true，否则不带参数为false*/
    @KsYunField(name="ViewAllProject")
    private Boolean ViewAllProject;


}