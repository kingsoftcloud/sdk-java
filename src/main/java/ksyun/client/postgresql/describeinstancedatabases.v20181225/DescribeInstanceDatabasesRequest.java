package ksyun.client.postgresql.describeinstancedatabases.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceDatabasesRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceDatabasesRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}