package ksyun.client.mongodb.resetpasswordmongodbinstance.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ResetPasswordMongoDBInstanceRequest
* @Description 请求参数
*/
@Data
public class ResetPasswordMongoDBInstanceRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**实例修改后的密码。8-30个字符，必须包含大小写字母和数字，支持特殊字符字符为!@#$%^&*()_+=-*/
    @KsYunField(name="InstancePassword")
    private String InstancePassword;

}
