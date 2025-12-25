package ksyun.client.kce.updategrafanawhitelist.v20230306;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateGrafanaWhiteListRequest
* @Description 请求参数
*/
@Data
public class UpdateGrafanaWhiteListRequest{
    /**Grafana所关联的Prometheus的实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**白名单数组，输入公网域名IP或网段，例如：127.0.0.1或127.0.0.1/24*/
    @KsYunField(name = "WhiteList", type = 1)
    private List<String> WhiteListList;

}
