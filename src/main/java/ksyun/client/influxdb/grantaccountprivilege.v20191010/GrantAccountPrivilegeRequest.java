package ksyun.client.influxdb.grantaccountprivilege.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GrantAccountPrivilegeRequest
 * @Description 请求参数
 */
@Data
public class GrantAccountPrivilegeRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "AccountName")
    private String AccountName;

    /***/
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

    /***/
    @KsYunField(name = "AccountPrivilege")
    private String AccountPrivilege;

}