package ksyun.client.sqlserver.describeinstancedatabases.v20190425;

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

    /**
     * 模糊查询
     */
    @KsYunField(name = "Keyword")
    private String Keyword;

}