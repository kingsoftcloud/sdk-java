package ksyun.client.kec.addvmintodataguard.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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