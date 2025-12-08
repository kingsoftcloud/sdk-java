package ksyun.client.postgresql.modifydbinstance.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyDBInstanceRequest
* @Description 请求参数
*/
@Data
public class ModifyDBInstanceRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**自动备份发起时间

格式(hh:mm-hh:mm，如:01:00-02:00)*/
    @KsYunField(name="PreferredBackupTime")
    private String PreferredBackupTime;

    /**实例新名称

不超过256个字节，仅支持中文、大小写字母、数字、减号、下划线和@#*/
    @KsYunField(name="DBInstanceName")
    private String DBInstanceName;

    /**数据库用户密码

8-30个字符，必须包含大小写字母和数字，支持的特殊字符为!@#$%^&*()_=-   注：[不支持 + 号]*/
    @KsYunField(name="MasterUserPassword")
    private String MasterUserPassword;

    /**参数组id

租户的参数组id或者是官方的默认参数组id*/
    @KsYunField(name="DBParameterGroupId")
    private String DBParameterGroupId;

    /**安全组ID*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

}
