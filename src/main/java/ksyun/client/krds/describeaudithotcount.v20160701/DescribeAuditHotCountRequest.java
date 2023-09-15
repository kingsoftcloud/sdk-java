package ksyun.client.krds.describeaudithotcount.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAuditHotCountRequest
* @Description 请求参数
*/
@Data
public class DescribeAuditHotCountRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**查询间隔		最近1小时：LASTEST_ONE_HOUR<br>最近3小时：LASTEST_THREE_HOUR<br>最近1天：LASTEST_ONE_DAY<br>最近1周：LASTEST_ONE_WEEK<br>自定义查询时间：CUSTOM<br>注意：自定义查询时间的时候必须填写startTime和endTime<br>注意：最近1小时，最近3小时均以5分钟为时间间隔聚合；最近一天以30分钟聚合；最近一周以6小时聚合*/
    @KsYunField(name="TimeRange")
    private String TimeRange;

    /**查询开始时间*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**查询结束时间*/
    @KsYunField(name="EndTime")
    private String EndTime;


}