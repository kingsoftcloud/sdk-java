package ksyun.client.krds.sqlauditreport.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SqlAuditReportRequest
* @Description 请求参数
*/
@Data
public class SqlAuditReportRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**查询间隔		最近1小时：LASTEST_ONE_HOUR<br>最近3小时：LASTEST_THREE_HOUR<br>最近1天：LASTEST_ONE_DAY<br>最近1周：LASTEST_ONE_WEEK<br>自定义查询时间：CUSTOM<br>注意：自定义查询时间的时候必须填写startTime和endTime<br>注意：最近1小时，最近3小时均以5分钟为时间间隔聚合；最近一天以30分钟聚合；最近一周以6小时聚合*/
    @KsYunField(name="TimeRange")
    private String TimeRange;

    /**查询开始时间		例如：2021-09-01 14:42:51*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**查询结束时间		例如：2021-09-01 13:42:51*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**数据库名称*/
    @KsYunField(name="DbName")
    private String DbName;

    /**排序字段		默认执行次数(count)倒序排序：<br>排序字段：<br>count：执行次数<br>countRatio：执行次数比例<br>durationAvg: 平均执行耗时<br>durationRatio: 执行耗时占比*/
    @KsYunField(name="SortBy")
    private String SortBy;

    /**排序方式		默认：1 <br>可填1：倒序(降序)<br>可填0：正序(降序)*/
    @KsYunField(name="SortWay")
    private Integer SortWay;

    /**页码		默认：1*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页条数		默认：15，可填区间:[15，100]*/
    @KsYunField(name="Size")
    private Integer Size;


}