package ksyun.client.krds.describedbinstancerestorabletime.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

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