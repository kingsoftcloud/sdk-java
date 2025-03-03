package ksyun.client.kec.removevmfromdataguard.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname RemoveVmFromDataGuardRequest
 * @Description 请求参数
 */
@Data
public class RemoveVmFromDataGuardRequest {
    /**
     * 待修改的容灾分组ID
     */
    @KsYunField(name = "DataGuardId")
    private String DataGuardId;

    /**
     * 待移除的实例ID
     */
    @KsYunField(name = "InstanceId")
    private List<String> InstanceIdList;

}