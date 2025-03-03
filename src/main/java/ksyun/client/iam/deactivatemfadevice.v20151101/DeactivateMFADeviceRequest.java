package ksyun.client.iam.deactivatemfadevice.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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