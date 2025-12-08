package ksyun.client.postgresql.modifydbbackuppolicy.v20181225;

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
public class ModifyDBBackupPolicyRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**备份时间段

例如：02:00-03:00，范围取值:[00:00-01:00,23:00-24:00], 间隔一小时的整点时刻*/
    @KsYunField(name="PreferredBackupTime")
    private String PreferredBackupTime;

}
