package ksyun.client.kec.addvmintodataguard.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname AddVmIntoDataGuardRequest
 * @Description 请求参数
 */
@Data
public class AddVmIntoDataGuardRequest {
    /**
     * 容灾分组ID
     */
    @KsYunField(name = "DataGuardId")
    private String DataGuardId;

    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private List<String> InstanceIdList;


}