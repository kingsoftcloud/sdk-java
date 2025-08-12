package ksyun.client.epc.startsoinstance.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname StartSoInstanceRequest
 * @Description 请求参数
 */
@Data
public class StartSoInstanceRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceIds")
    private List<String> InstanceIdsList;

}