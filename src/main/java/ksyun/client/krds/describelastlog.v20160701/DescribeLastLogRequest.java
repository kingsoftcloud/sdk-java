package ksyun.client.krds.describelastlog.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeLastLogRequest
* @Description 请求参数
*/
@Data
public class DescribeLastLogRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**日志类型	大小写敏感，取值范围：SlowLog/ErrorLog/Binlog*/
    @KsYunField(name="DBLogType")
    private String DBLogType;

}
