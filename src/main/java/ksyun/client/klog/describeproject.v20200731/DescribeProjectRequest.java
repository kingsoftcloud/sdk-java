package ksyun.client.klog.describeproject.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeProjectRequest
 * @Description 请求参数
 */
@Data
public class DescribeProjectRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}