package ksyun.client.iam.getvirtualmfadevice.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetVirtualMFADeviceRequest
* @Description 请求参数
*/
@Data
public class GetVirtualMFADeviceRequest{
    /**UserName*/
    @KsYunField(name="UserName")
    private String UserName;


}