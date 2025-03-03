package ksyun.client.kmr.getinstancedetail.v20231231;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetInstanceDetailRequest
 * @Description 请求参数
 */
@Data
public class GetInstanceDetailRequest {
    /**
     * 实例ID，用于唯一标识一个实例
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}