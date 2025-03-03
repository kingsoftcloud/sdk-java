package ksyun.client.kce.getscaleapiserverconfig.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetScaleAPIServerConfigRequest
 * @Description 请求参数
 */
@Data
public class GetScaleAPIServerConfigRequest {
    /**
     * 集群Id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 节点Ip
     */
    @KsYunField(name = "InstanceIp")
    private String InstanceIp;


}