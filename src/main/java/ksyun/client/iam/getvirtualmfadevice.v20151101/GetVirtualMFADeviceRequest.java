package ksyun.client.iam.getvirtualmfadevice.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetVirtualMFADeviceRequest
 * @Description 请求参数
 */
@Data
public class GetVirtualMFADeviceRequest {
    /**
     * UserName
     */
    @KsYunField(name = "UserName")
    private String UserName;


}