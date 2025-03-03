package ksyun.client.influxdb.describeaccountprivileges.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeAccountPrivilegesRequest
 * @Description 请求参数
 */
@Data
public class DescribeAccountPrivilegesRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "AccountName")
    private String AccountName;

}