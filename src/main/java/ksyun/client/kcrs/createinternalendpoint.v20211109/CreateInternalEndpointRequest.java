package ksyun.client.kcrs.createinternalendpoint.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateInternalEndpointRequest
 * @Description 请求参数
 */
@Data
public class CreateInternalEndpointRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * vpc id
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 所在vpc的终端子网id
     */
    @KsYunField(name = "ReserveSubnetId")
    private String ReserveSubnetId;

}