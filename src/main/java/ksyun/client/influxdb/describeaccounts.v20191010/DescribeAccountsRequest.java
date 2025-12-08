package ksyun.client.influxdb.describeaccounts.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAccountsRequest
* @Description 请求参数
*/
@Data
public class DescribeAccountsRequest{
    /***/
    @KsYunField(name="InstanceId")
    private String InstanceId;

}
