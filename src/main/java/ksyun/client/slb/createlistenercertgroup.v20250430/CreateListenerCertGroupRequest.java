package ksyun.client.slb.createlistenercertgroup.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateListenerCertGroupRequest
* @Description 请求参数
*/
@Data
public class CreateListenerCertGroupRequest{
    /**应用型负载均衡监听器的ID*/
    @KsYunField(name="ListenerId")
    private String ListenerId;

}
