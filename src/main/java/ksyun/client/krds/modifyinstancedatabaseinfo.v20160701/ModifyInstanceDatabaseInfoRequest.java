package ksyun.client.krds.modifyinstancedatabaseinfo.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyInstanceDatabaseInfoRequest
* @Description 请求参数
*/
@Data
public class ModifyInstanceDatabaseInfoRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**数据库名称*/
    @KsYunField(name="InstanceDatabaseName")
    private String InstanceDatabaseName;

    /**数据库描述		不传为置空数据库描述*/
    @KsYunField(name="InstanceDatabaseDescription")
    private String InstanceDatabaseDescription;

}
