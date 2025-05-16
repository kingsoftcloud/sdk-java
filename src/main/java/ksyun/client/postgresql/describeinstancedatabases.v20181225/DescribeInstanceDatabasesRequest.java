package ksyun.client.postgresql.describeinstancedatabases.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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