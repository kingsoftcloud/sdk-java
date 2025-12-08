package ksyun.client.krds.auditstatistic.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AuditStatisticRequest
* @Description 请求参数
*/
@Data
public class AuditStatisticRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**统计开始时间*/
    @KsYunField(name="AuditStatisticBeginTime")
    private String AuditStatisticBeginTime;

    /**统计结束时间*/
    @KsYunField(name="AuditStatisticEndTime")
    private String AuditStatisticEndTime;

}
