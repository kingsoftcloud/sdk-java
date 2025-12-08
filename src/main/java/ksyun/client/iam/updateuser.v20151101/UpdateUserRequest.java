package ksyun.client.iam.updateuser.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateUserRequest
* @Description 请求参数
*/
@Data
public class UpdateUserRequest{
    /**需要修改的IAM子用户名*/
    @KsYunField(name="UserName")
    private String UserName;

    /**新的IAM用户名，如果未传入则说明不改变*/
    @KsYunField(name="NewUserName")
    private String NewUserName;

    /**新的IAM用户真实姓名，如果未传入则说明不改变*/
    @KsYunField(name="NewRealName")
    private String NewRealName;

    /**新的IAM用户Email，如果未传入则说明不改变*/
    @KsYunField(name="NewEmail")
    private String NewEmail;

    /**新的IAM用户手机，如果未传入则说明不改变*/
    @KsYunField(name="NewPhone")
    private String NewPhone;

    /***/
    @KsYunField(name="IsInternational")
    private Integer IsInternational;

    /***/
    @KsYunField(name="NewRemark")
    private String NewRemark;

}
