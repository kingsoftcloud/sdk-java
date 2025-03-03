package ksyun.client.epc.activatehotstandbyepc.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ActivateHotStandbyEpcRequest
 * @Description 请求参数
 */
@Data
public class ActivateHotStandbyEpcRequest {
    /**
     * 待激活热备机实例ID
     */
    @KsYunField(name = "HostId")
    private String HostId;

}