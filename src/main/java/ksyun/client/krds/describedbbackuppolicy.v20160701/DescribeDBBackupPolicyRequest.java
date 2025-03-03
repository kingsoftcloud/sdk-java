package ksyun.client.krds.describedbbackuppolicy.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDBBackupPolicyRequest
 * @Description 请求参数
 */
@Data
public class DescribeDBBackupPolicyRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}