package ksyun.client.postgresql.createinstancedatabase.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateInstanceDatabaseRequest
 * @Description 请求参数
 */
@Data
public class CreateInstanceDatabaseRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 库名称
     */
    @KsYunField(name = "InstanceDatabaseName")
    private String InstanceDatabaseName;

    /**
     * 排序规则
     */
    @KsYunField(name = "InstanceDatabaseCollation")
    private String InstanceDatabaseCollation;

    /**
     * 字符集
     */
    @KsYunField(name = "InstanceDatabaseCharacterSet")
    private String InstanceDatabaseCharacterSet;

    /**
     * 字符分类
     */
    @KsYunField(name = "InstanceDatabaseCharacterSetType")
    private String InstanceDatabaseCharacterSetType;

    /**
     * 描述
     */
    @KsYunField(name = "Description")
    private String Description;

    /**
     * 拥有者
     */
    @KsYunField(name = "InstanceDatabaseOwner")
    private String InstanceDatabaseOwner;

}