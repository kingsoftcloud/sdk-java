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
     * 工程名称
     */
    @KsYunField(name = "ProjectName")
    private String ProjectName;


}