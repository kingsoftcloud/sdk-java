package ksyun.client.influxdb.describevalidregions.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeValidRegionsRequest
 * @Description 请求参数
 */
@Data
public class DescribeValidRegionsRequest {
    /**
     * action
     */
    @KsYunField(name = "Action")
    private String Action;

}