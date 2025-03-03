package ksyun.client.kec.terminateinstances.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname TerminateInstancesRequest
 * @Description 请求参数
 */
@Data
public class TerminateInstancesRequest {
    /**
     * 待销毁实例ID列表，N的范围为1-100
     */
    @KsYunField(name = "InstanceId")
    private List<String> InstanceIdList;

    /**
     * 强制销毁
     */
    @KsYunField(name = "ForceDelete")
    private Boolean ForceDelete;

}