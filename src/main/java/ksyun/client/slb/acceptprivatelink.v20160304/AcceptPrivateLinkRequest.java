package ksyun.client.slb.acceptprivatelink.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AcceptPrivateLinkRequest
 * @Description 请求参数
 */
@Data
public class AcceptPrivateLinkRequest {
    /**
     * PrivateLink的ID
     */
    @KsYunField(name = "PrivateLinkId")
    private String PrivateLinkId;


}