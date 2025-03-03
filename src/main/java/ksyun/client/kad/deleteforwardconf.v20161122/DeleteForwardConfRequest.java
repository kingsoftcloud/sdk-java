package ksyun.client.kad.deleteforwardconf.v20161122;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteForwardConfRequest
 * @Description 请求参数
 */
@Data
public class DeleteForwardConfRequest {
    /**
     * 四层转发配置ID
     */
    @KsYunField(name = "ForwardConfId")
    private String ForwardConfId;


}