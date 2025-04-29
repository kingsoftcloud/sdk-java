package ksyun.client.slb.createalblistenercertgroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateAlbListenerCertGroupRequest
* @Description 请求参数
*/
@Data
public class CreateAlbListenerCertGroupRequest{
    /**应用型负载均衡监听器的ID*/
    @KsYunField(name="AlbListenerId")
    private String AlbListenerId;

}