package ksyun.client.sqlserver.describecollations.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCollationsRequest
 * @Description 请求参数
 */
@Data
public class DescribeCollationsRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}