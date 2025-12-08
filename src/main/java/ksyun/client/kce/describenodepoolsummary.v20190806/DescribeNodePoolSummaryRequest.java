package ksyun.client.kce.describenodepoolsummary.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNodePoolSummaryRequest
* @Description 请求参数
*/
@Data
public class DescribeNodePoolSummaryRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

}
