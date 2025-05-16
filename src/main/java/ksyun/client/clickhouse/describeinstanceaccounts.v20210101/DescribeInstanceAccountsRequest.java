package ksyun.client.clickhouse.describeinstanceaccounts.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeInstanceAccountsRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceAccountsRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}