package ksyun.client.epc.modifyhyperthreading.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyHyperThreadingRequest
* @Description 请求参数
*/
@Data
public class ModifyHyperThreadingRequest{
    /**裸金属服务器资源ID*/
    @KsYunField(name="HostId")
    private String HostId;

    /**超线程状态，start|stop*/
    @KsYunField(name="HyperThreadingStatus")
    private String HyperThreadingStatus;

}
