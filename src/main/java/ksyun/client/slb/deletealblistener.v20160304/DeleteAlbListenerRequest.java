package ksyun.client.slb.deletealblistener.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAlbListenerRequest
* @Description 请求参数
*/
@Data
public class DeleteAlbListenerRequest{
    /**应用型监听器的ID*/
    @KsYunField(name="AlbListenerId")
    private String AlbListenerId;

}