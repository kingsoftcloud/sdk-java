package ksyun.client.krds.deleteinstancedatabaseaction.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteInstanceDatabaseActionRequest
* @Description 请求参数
*/
@Data
public class DeleteInstanceDatabaseActionRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**数据库名称		支持批量删除，以为 “ , ”分隔开*/
    @KsYunField(name="InstanceDatabaseName")
    private String InstanceDatabaseName;


}