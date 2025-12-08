package ksyun.client.influxdb.describevalidregions.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeValidRegionsRequest
* @Description 请求参数
*/
@Data
public class DescribeValidRegionsRequest{
    /**action*/
    @KsYunField(name="Action")
    private String Action;

}
