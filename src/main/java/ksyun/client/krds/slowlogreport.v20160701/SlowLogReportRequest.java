package ksyun.client.krds.slowlogreport.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SlowLogReportRequest
* @Description 请求参数
*/
@Data
public class SlowLogReportRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**时间区间开始		yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**时间区间结束		yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**queryCount/ 查询条数
queryTimeAvg/ 查询平均时间
queryTimeMax/ 查询最大时间
lockTimeAvg/ 平均等待时间
lockTimeMax/ 最大等待时间
rowsExaminedAvg/ 平均扫描行
rowsExaminedMax/ 最大扫描行
rowsSentAvg/ 平均返回行
rowsSentMax 最大返回行
processingTime 处理时间(不传排序字段和方式默认处理时间倒序)*/
    @KsYunField(name="SortBy")
    private String SortBy;

    /**排序规则
ASC 正序(升序)
DESC 倒序(倒列)*/
    @KsYunField(name="SortWay")
    private String SortWay;

    /**以INSERT、UPDATE、DELETE、SELECT为首进行匹配*/
    @KsYunField(name="HeadKey")
    private String HeadKey;

    /**偏移量*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**每页结果中包含的最大条数
默认：0，区间 [10,10000]*/
    @KsYunField(name="MaxRecords")
    private Integer MaxRecords;

}
