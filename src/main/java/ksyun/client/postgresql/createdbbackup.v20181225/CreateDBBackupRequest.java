package ksyun.client.postgresql.createdbbackup.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDBBackupRequest
* @Description 请求参数
*/
@Data
public class CreateDBBackupRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**备份名称*/
    @KsYunField(name="DBBackupName")
    private String DBBackupName;

    /**备份描述，控制台页面暂无填写入口，接口支持备份描述写入*/
    @KsYunField(name="Description")
    private String Description;


}