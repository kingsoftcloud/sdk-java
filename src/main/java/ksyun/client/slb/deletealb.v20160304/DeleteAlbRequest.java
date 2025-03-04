package ksyun.client.slb.deletealb.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteAlbRequest
 * @Description 请求参数
 */
@Data
public class DeleteAlbRequest {
    /**
     * 应用型负载均衡的ID
     */
    @KsYunField(name = "AlbId")
    private String AlbId;

}