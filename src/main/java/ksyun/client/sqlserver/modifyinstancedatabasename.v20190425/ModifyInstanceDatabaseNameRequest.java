package ksyun.client.sqlserver.modifyinstancedatabasename.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyInstanceDatabaseNameRequest
* @Description 请求参数
*/
@Data
public class ModifyInstanceDatabaseNameRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**数据库名称*/
    @KsYunField(name="InstanceDatabaseName")
    private String InstanceDatabaseName;

    /**数据库名称--新*/
    @KsYunField(name="InstanceDatabaseNameNew")
    private String InstanceDatabaseNameNew;

}
