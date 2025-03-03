package ksyun.client.tidb.describeaccounts.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeAccountsRequest
 * @Description 请求参数
 */
@Data
public class DescribeAccountsRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}