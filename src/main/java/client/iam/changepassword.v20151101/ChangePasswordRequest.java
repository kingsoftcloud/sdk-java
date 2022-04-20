package client.iam.changepassword.v20151101;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ChangePasswordRequest
* @Description 请求参数
*/
@Data
public class ChangePasswordRequest{
    /**用户的旧登录密码*/
    @KsYunField(name="OldPassword")
    private String OldPassword;

    /**用户的新登录密码*/
    @KsYunField(name="NewPassword")
    private String NewPassword;


}