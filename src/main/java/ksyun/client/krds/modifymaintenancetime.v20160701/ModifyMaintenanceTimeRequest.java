package ksyun.client.krds.modifymaintenancetime.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyMaintenanceTimeRequest
 * @Description 请求参数
 */
@Data
public class ModifyMaintenanceTimeRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 时间窗口开始时间
     * <p>
     * ```json
     * 支持时间区间：[00-23]:[00-59]
     * ```
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 时间间隔
     * <p>
     * ```json
     * 注意：设计为在如上开始时间后多久的时间内可以操作，故此字段代表的为小时；
     * <p>
     * 支持间隔区间：[0.5-3.0]
     * <p>
     * 默认区间：0.5
     * 间隔单位：小时
     * ```
     */
    @KsYunField(name = "Duration")
    private Double Duration;

}