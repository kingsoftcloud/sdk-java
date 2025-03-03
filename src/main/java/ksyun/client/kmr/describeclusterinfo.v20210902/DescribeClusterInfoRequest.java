package ksyun.client.kmr.describeclusterinfo.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeClusterInfoRequest
 * @Description 请求参数
 */
@Data
public class DescribeClusterInfoRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;


}