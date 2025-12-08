package ksyun.client.influxdb.revokeaccountprivilege.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RevokeAccountPrivilegeRequest
* @Description 请求参数
*/
@Data
public class RevokeAccountPrivilegeRequest{
    /***/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name="AccountName")
    private String AccountName;

    /***/
    @KsYunField(name="DatabaseName")
    private String DatabaseName;

}
