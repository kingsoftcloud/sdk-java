package ksyun.client.ked.getproxyconfig.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetProxyConfigRequest
 * @Description 请求参数
 */
@Data
public class GetProxyConfigRequest {
    /**
     * 云电脑 id
     */
    @KsYunField(name = "instanceId")
    private String InstanceId;


}