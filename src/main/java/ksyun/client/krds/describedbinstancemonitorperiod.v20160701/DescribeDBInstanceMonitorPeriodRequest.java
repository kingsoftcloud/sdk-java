package ksyun.client.krds.describedbinstancemonitorperiod.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDBInstanceMonitorPeriodRequest
 * @Description 请求参数
 */
@Data
public class DescribeDBInstanceMonitorPeriodRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}