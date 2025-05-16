package ksyun.client.sqlserver.describedbinstancerestorabletime.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeDBInstanceRestorableTimeRequest
 * @Description 请求参数
 */
@Data
public class DescribeDBInstanceRestorableTimeRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}