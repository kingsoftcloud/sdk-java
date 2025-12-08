package ksyun.client.krds.describedbbackuppolicy.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDBBackupPolicyResponse
* @Description DescribeDBBackupPolicy 返回体
*/
@Data
@ToString
public class DescribeDBBackupPolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("BackupConfig")
    private BackupConfigDto BackupConfig;

    @Data
    @ToString
    public static class BackupConfigDto {
        /**备份保留天数；
如7表示自动备份保留7天。*/
        @JsonProperty("ExpireAfter")
        private Integer ExpireAfter;

        /**自动备份起始时间点；
如2300表示23点整开始。有效值为24小时的HHmm数值，如0000、1300、2359等*/
        @JsonProperty("AutobackupAt")
        private Integer AutobackupAt;

        /**增量备份策略，单位小时；
如12表示相隔两次全量备份之间，每12小时进行一次增量备份。若全量备份间隔不超过1天，不准许选择24小时。*/
        @JsonProperty("IncrementalBackupCycle")
        private Integer IncrementalBackupCycle;

        /**备份周期分钟(暂不可调整);
1440表示1440分钟（1日）*/
        @JsonProperty("Duration")
        private Integer Duration;

        /**全量备份策略，单位星期；如"1,3,7"表示用户选择在星期一、星期三、星期日做备份。*/
        @JsonProperty("FullBackupCycle")
        private String FullBackupCycle;

        /**备份配置ID*/
        @JsonProperty("GroupId")
        private String GroupId;

        /**备份商业化：BingLog过期时间*/
        @JsonProperty("BinlogExpireAfter")
        private Integer BinlogExpireAfter;

        /**备份商业化：高频备份开关    状态：false：关闭  true：开启*/
        @JsonProperty("HighFrequencyBackup")
        private Boolean HighFrequencyBackup;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
