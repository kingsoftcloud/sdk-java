package ksyun.client.mongodb.deallocateeip.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeallocateEipRequest
 * @Description 请求参数
 */
@Data
public class DeallocateEipRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}