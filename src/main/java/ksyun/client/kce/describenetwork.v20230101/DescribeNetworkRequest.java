package ksyun.client.kce.describenetwork.v20230101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeNetworkRequest
 * @Description 请求参数
 */
@Data
public class DescribeNetworkRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 集群名称
     */
    @KsYunField(name = "ClusterName")
    private String ClusterName;

}