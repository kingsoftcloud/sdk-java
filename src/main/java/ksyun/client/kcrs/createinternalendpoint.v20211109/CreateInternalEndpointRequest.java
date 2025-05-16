package ksyun.client.kcrs.createinternalendpoint.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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