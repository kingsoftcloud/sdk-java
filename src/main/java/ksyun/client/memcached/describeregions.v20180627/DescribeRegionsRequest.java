package ksyun.client.memcached.describeregions.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeRegionsRequest
 * @Description 请求参数
 */
@Data
public class DescribeRegionsRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

    /**
     * Version
     */
    @KsYunField(name = "Version")
    private String Version;

}