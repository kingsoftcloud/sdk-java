package ksyun.client.kci.describeregions.v20200702;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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