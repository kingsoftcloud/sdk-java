package ksyun.client.slb.deletelistener.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteListenerRequest
* @Description 请求参数
*/
@Data
public class DeleteListenerRequest{
    /**监听器的ID*/
    @KsYunField(name="ListenerId")
    private String ListenerId;

}
