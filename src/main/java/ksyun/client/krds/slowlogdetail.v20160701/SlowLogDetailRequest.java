package ksyun.client.krds.slowlogdetail.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SlowLogDetailRequest
* @Description 请求参数
*/
@Data
public class SlowLogDetailRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**时间区间开始
yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**时间区间结束
yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**排序字段

sqlExecTimeStamp：执行完成时间
currentUser：用户
hostname：客户端ip
queryTime： 执行耗时
lockTime：锁等待时间
rowsExamined：扫描行
rowsSent：返回行*/
    @KsYunField(name="SortBy")
    private String SortBy;

    /**排序规则	
1-正序 2-倒序*/
    @KsYunField(name="SortWay")
    private String SortWay;

    /**多选匹配	
以INSERT、UPDATE、DELETE、SELECT为首进行匹配,支持多选以|隔开，例如：HeadKey: SELECT|IN*/
    @KsYunField(name="HeadKey")
    private String HeadKey;

    /**具体模板*/
    @KsYunField(name="FingerPrint")
    private String FingerPrint;

    /**标识*/
    @KsYunField(name="checksum")
    private String Checksum;

}
