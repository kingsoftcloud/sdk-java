package ksyun.client.krds.slowloglinechart.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname SlowLogLineChartRequest
 * @Description 请求参数
 */
@Data
public class SlowLogLineChartRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 开始时间	yyyy-MM-dd HH:mm:ss
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 结束时间	yyyy-MM-dd HH:mm:ss
     */
    @KsYunField(name = "EndTime")
    private String EndTime;

}