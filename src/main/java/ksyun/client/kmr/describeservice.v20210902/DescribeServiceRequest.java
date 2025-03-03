package ksyun.client.kmr.describeservice.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeServiceRequest
 * @Description 请求参数
 */
@Data
public class DescribeServiceRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;


}