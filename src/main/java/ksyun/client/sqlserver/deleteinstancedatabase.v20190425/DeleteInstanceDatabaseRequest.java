package ksyun.client.sqlserver.deleteinstancedatabase.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteInstanceDatabaseRequest
 * @Description 请求参数
 */
@Data
public class DeleteInstanceDatabaseRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 数据库名称
     */
    @KsYunField(name = "InstanceDatabaseName")
    private String InstanceDatabaseName;

}