package ksyun.client.krds.overridedbinstancebypointintime.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname OverrideDBInstanceByPointInTimeRequest
 * @Description 请求参数
 */
@Data
public class OverrideDBInstanceByPointInTimeRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 备份ID			指定备份集恢复必传
     */
    @KsYunField(name = "DBBackupIdentifier")
    private String DBBackupIdentifier;

    /**
     * 恢复的时间点		指定时间点恢复必传  yyyy-MM-dd HH:mm:ss
     */
    @KsYunField(name = "RestorableTime")
    private String RestorableTime;


}