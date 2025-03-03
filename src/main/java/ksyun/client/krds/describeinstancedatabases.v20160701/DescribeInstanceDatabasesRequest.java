package ksyun.client.krds.describeinstancedatabases.v20160701;

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
     * 数据库名称准确查询
     */
    @KsYunField(name = "InstanceDatabaseName")
    private String InstanceDatabaseName;

    /**
     * 数据库名称模糊查询
     */
    @KsYunField(name = "Keyword")
    private String Keyword;


}