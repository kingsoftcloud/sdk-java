package ksyun.client.kci.describeregions.v20200702;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeRegionsRequest
 * @Description 请求参数
 */
@Data
public class DescribeRegionsRequest {
    /**
     * 请求接口
     */
    @KsYunField(name = "Action")
    private String Action;


}