package ksyun.client.krds.describeproxyinstance.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeProxyInstanceRequest
 * @Description 请求参数
 */
@Data
public class DescribeProxyInstanceRequest {
    /**
     * 代理实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}