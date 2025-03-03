package ksyun.client.eip.modifyaddress.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyAddressRequest
 * @Description 请求参数
 */
@Data
public class ModifyAddressRequest {
    /**
     * 弹性IP的ID
     */
    @KsYunField(name = "AllocationId")
    private String AllocationId;

    /**
     * 弹性IP的带宽
     */
    @KsYunField(name = "BandWidth")
    private Integer BandWidth;

}