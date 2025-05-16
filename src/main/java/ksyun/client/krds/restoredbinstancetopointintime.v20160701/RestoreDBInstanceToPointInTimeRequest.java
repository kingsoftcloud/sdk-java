package ksyun.client.krds.restoredbinstancetopointintime.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname RestoreDBInstanceToPointInTimeRequest
 * @Description 请求参数
 */
@Data
public class RestoreDBInstanceToPointInTimeRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 恢复到时间点		例如：2021-09-09 00:00:00
     */
    @KsYunField(name = "RestorableTime")
    private String RestorableTime;

}