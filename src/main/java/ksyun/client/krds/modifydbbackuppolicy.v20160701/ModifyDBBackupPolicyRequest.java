package ksyun.client.krds.modifydbbackuppolicy.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyDBBackupPolicyRequest
 * @Description 请求参数
 */
@Data
public class ModifyDBBackupPolicyRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 备份时间段。	例如：02:00-03:00，范围取值:[00:00-01:00,23:00-24:00],  间隔一小时的整点时刻。
     */
    @KsYunField(name = "PreferredBackupTime")
    private String PreferredBackupTime;

    /**
     * 备份保留天数。取值范围[7,1830]。
     */
    @KsYunField(name = "ExpireAfter")
    private Integer ExpireAfter;

    /**
     * 增量备份策略，单位小时。可选：8，12，24。
     */
    @KsYunField(name = "IncrementalBackupCycle")
    private String IncrementalBackupCycle;

    /**
     * 全量备份策略，单位星期。如"1,3,7"表示选择在星期一、星期三、星期日做备份。
     */
    @KsYunField(name = "FullBackupCycle")
    private String FullBackupCycle;

    /**
     * bing过期时间；
     * 默认：7 单位：天
     */
    @KsYunField(name = "BinlogExpireAfter")
    private Integer BinlogExpireAfter;

    /**
     * 高频备份开关(暂不支持修改)；
     * 默认关闭：false
     * 状态：flase 关闭  true 开启 
     */
    @KsYunField(name = "HighFrequencyBackup")
    private Boolean HighFrequencyBackup;

}