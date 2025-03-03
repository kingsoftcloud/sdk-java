package ksyun.client.slb.deletealblistener.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteAlbListenerRequest
 * @Description 请求参数
 */
@Data
public class DeleteAlbListenerRequest {
    /**
     * 应用型监听器的ID
     */
    @KsYunField(name = "AlbListenerId")
    private String AlbListenerId;

}