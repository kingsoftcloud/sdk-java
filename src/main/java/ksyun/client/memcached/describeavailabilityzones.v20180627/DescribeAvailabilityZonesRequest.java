package ksyun.client.memcached.describeavailabilityzones.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeAvailabilityZonesRequest
 * @Description 请求参数
 */
@Data
public class DescribeAvailabilityZonesRequest {
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