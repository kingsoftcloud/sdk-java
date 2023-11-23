package ksyun.client.kce.describegrafanawhitelist.v20230306;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeGrafanaWhiteListRequest
* @Description 请求参数
*/
@Data
public class DescribeGrafanaWhiteListRequest{
    /**Grafana所关联的Prometheus的实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}