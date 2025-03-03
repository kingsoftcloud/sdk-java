package ksyun.client.kec.stopinstances.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname StopInstancesRequest
 * @Description 请求参数
 */
@Data
public class StopInstancesRequest {
    /**
     * 待关闭实例ID列表，N的范围为1-100
     */
    @KsYunField(name = "InstanceId")
    private List<String> InstanceIdList;

    /**
     * 强制关闭
     */
    @KsYunField(name = "ForceStop")
    private Boolean ForceStop;

    /**
     * 关闭模式
     * KeepCharging （默认参数）  保留并收费<br>StopCharging    关机不收费
     */
    @KsYunField(name = "StoppedMode")
    private String StoppedMode;

}