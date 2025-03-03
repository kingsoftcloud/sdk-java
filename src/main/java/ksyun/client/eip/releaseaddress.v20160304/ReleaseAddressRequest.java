package ksyun.client.eip.releaseaddress.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ReleaseAddressRequest
 * @Description 请求参数
 */
@Data
public class ReleaseAddressRequest {
    /**
     * 弹性IP的ID
     */
    @KsYunField(name = "AllocationId")
    private String AllocationId;


}