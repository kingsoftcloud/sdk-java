package ksyun.client.clickhouse.createinstanceaccount.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateInstanceAccountRequest
 * @Description 请求参数
 */
@Data
public class CreateInstanceAccountRequest {
    /**
     * 账号名称
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 账号密码
     */
    @KsYunField(name = "Password")
    private String Password;

    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 账号描述
     */
    @KsYunField(name = "Description")
    private String Description;

}