package ksyun.client.krds.createinstancedatabase.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

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
     * 数据库名称。		由小写字母、数字、下划线或中划线组成，以字母开头，以字母或数字结尾，长度为2~64个字符
     */
    @KsYunField(name = "InstanceDatabaseName")
    private String InstanceDatabaseName;

    /**
     * 数据库字符集		非必填，默认为UTF-8：utf8_general_ci （DescribeCollations接口获取)
     */
    @KsYunField(name = "InstanceDatabaseCollation")
    private String InstanceDatabaseCollation;

    /**
     * 数据库描述		必须中文、英文字母开头，可以包含数字、中文、英文、下划线（_）、短横线（-）
     */
    @KsYunField(name = "InstanceDatabaseDescription")
    private String InstanceDatabaseDescription;


}