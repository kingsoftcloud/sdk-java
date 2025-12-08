package ksyun.client.slb.deletelisteners.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteListenersRequest
* @Description 请求参数
*/
@Data
public class DeleteListenersRequest{
    /**监听器的ID*/
    @KsYunField(name="ListenerId")
    private String ListenerId;

}
