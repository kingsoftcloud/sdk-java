package ksyun.client.slb.deregisterinstancesfromlistener.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeregisterInstancesFromListenerRequest
* @Description 请求参数
*/
@Data
public class DeregisterInstancesFromListenerRequest{
    /**绑定服务器组的注册ID*/
    @KsYunField(name="RegisterId")
    private String RegisterId;


}