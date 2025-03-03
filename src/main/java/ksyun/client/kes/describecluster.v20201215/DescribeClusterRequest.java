package ksyun.client.kes.describecluster.v20201215;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeClusterRequest
 * @Description 请求参数
 */
@Data
public class DescribeClusterRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

}