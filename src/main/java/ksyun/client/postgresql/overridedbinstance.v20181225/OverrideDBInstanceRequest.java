package ksyun.client.postgresql.overridedbinstance.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname OverrideDBInstanceRequest
* @Description 请求参数
*/
@Data
public class OverrideDBInstanceRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**备份ID*/
    @KsYunField(name="DBBackupIdentifier")
    private String DBBackupIdentifier;


}