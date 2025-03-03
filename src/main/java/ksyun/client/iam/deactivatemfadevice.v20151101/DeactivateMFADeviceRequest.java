package ksyun.client.iam.deactivatemfadevice.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeactivateMFADeviceRequest
 * @Description 请求参数
 */
@Data
public class DeactivateMFADeviceRequest {
    /**
     * krn
     */
    @KsYunField(name = "SerialNumber")
    private String SerialNumber;

    /**
     * UserName
     */
    @KsYunField(name = "UserName")
    private String UserName;


}