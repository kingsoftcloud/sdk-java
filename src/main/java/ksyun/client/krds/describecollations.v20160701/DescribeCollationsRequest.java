package ksyun.client.krds.describecollations.v20160701;

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