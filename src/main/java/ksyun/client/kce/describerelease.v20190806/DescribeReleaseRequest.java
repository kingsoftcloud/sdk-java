package ksyun.client.kce.describerelease.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeReleaseRequest
 * @Description 请求参数
 */
@Data
public class DescribeReleaseRequest {
    /**
     * 集群 Id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * helm应用筛选条件
     */
    @KsYunField(name = "Filter")
    private String Filter;

}