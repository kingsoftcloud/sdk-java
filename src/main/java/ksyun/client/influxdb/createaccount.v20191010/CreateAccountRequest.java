package ksyun.client.influxdb.createaccount.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateAccountRequest
 * @Description 请求参数
 */
@Data
public class CreateAccountRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "AccountName")
    private String AccountName;

    /***/
    @KsYunField(name = "AccountPassword")
    private String AccountPassword;

}