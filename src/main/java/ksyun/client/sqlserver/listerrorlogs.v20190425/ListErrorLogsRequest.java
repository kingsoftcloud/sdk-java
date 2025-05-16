package ksyun.client.sqlserver.listerrorlogs.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListErrorLogsRequest
 * @Description 请求参数
 */
@Data
public class ListErrorLogsRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 开始时间
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 结束时间
     */
    @KsYunField(name = "EndTime")
    private String EndTime;

    /**
     * 偏移量
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

    /**
     * 每页结果中包含的最大条数
     * <p>
     * ```json
     * Marker,MaxRecords类似数据库limit分页
     * ```
     */
    @KsYunField(name = "MaxRecords")
    private Integer MaxRecords;

}