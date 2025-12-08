package ksyun.client.postgresql.describedblogfiles.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDBLogFilesRequest
* @Description 请求参数
*/
@Data
public class DescribeDBLogFilesRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**日志类型

##### 取值范围：Log/SlowLog/ErrorLog/Binlog*/
    @KsYunField(name="DBLogType")
    private String DBLogType;

    /**日志开始记录时间
##### 按照yyyy-MM-dd HH:mm:ss格式*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**日志结束记录时间
##### 按照yyyy-MM-dd HH:mm:ss格式*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**最大文件大小
##### 过滤文件大小大于MaxFileSize的文件，单位：字节*/
    @KsYunField(name="MaxFileSize")
    private Integer MaxFileSize;

    /**偏移量*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**每页结果中包含的最大条数
##### 默认：200，区间 = [10,200]*/
    @KsYunField(name="MaxRecords")
    private Integer MaxRecords;

}
