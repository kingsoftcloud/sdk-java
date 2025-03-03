package ksyun.client.epc.modifyhyperthreading.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyHyperThreadingRequest
 * @Description 请求参数
 */
@Data
public class ModifyHyperThreadingRequest {
    /**
     * 裸金属服务器资源ID
     */
    @KsYunField(name = "HostId")
    private String HostId;

    /**
     * 超线程状态，start|stop
     */
    @KsYunField(name = "HyperThreadingStatus")
    private String HyperThreadingStatus;


}