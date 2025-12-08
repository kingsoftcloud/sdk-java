package ksyun.client.influxdb.resetaccountpassword.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ResetAccountPasswordRequest
* @Description 请求参数
*/
@Data
public class ResetAccountPasswordRequest{
    /***/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name="AccountName")
    private String AccountName;

    /***/
    @KsYunField(name="AccountPassword")
    private String AccountPassword;

}
