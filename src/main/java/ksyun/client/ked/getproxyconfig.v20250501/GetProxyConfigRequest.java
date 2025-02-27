package ksyun.client.ked.getproxyconfig.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetProxyConfigRequest
* @Description 请求参数
*/
@Data
public class GetProxyConfigRequest{
    /**云电脑 id*/
    @KsYunField(name="instanceId")
    private String InstanceId;


}