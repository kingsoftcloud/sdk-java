package ksyun.client.krds.describedblogfiles.v20160701;

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

    /**日志类型	大小写敏感，取值范围：SlowLog\/ErrorLog\/Binlog*/
    @KsYunField(name="DBLogType")
    private String DBLogType;

    /**偏移量	默认： 0*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**每页结果中包含的最大条数	默认：200，区间 = [10,200]*/
    @KsYunField(name="MaxRecords")
    private Integer MaxRecords;


}