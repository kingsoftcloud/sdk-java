package ksyun.client.kec.removevmfromdataguard.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemoveVmFromDataGuardRequest
* @Description 请求参数
*/
@Data
public class RemoveVmFromDataGuardRequest{
    /**待修改的容灾分组ID*/
    @KsYunField(name="DataGuardId")
    private String DataGuardId;

    /**待移除的实例ID*/
    @KsYunField(name="InstanceId",type=1)
    private List<String> InstanceIdList;

}
