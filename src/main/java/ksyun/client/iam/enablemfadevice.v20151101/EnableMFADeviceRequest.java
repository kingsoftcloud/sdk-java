package ksyun.client.iam.enablemfadevice.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname EnableMFADeviceRequest
* @Description 请求参数
*/
@Data
public class EnableMFADeviceRequest{
    /**AuthenticationCode1*/
    @KsYunField(name="AuthenticationCode1")
    private String AuthenticationCode1;

    /**AuthenticationCode2*/
    @KsYunField(name="AuthenticationCode2")
    private String AuthenticationCode2;

    /**SerialNumber*/
    @KsYunField(name="SerialNumber")
    private String SerialNumber;

    /**UserName*/
    @KsYunField(name="UserName")
    private String UserName;

}
