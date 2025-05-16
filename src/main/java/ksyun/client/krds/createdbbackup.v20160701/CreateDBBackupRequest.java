package ksyun.client.krds.createdbbackup.v20160701;

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
public class CreateDBBackupRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 备份名称	2-64个字符，支持字母，数字，以及-_
     */
    @KsYunField(name = "DBBackupName")
    private String DBBackupName;

    /**
     * 备份描述			前端页面暂时没有填写入口，接口支持填写备份描述
     */
    @KsYunField(name = "Description")
    private String Description;

}