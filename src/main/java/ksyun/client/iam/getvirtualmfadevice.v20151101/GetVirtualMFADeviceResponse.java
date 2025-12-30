package ksyun.client.iam.getvirtualmfadevice.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetVirtualMFADeviceResponse
* @Description GetVirtualMFADevice 返回体
*/
@Data
@ToString
public class GetVirtualMFADeviceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**设备信息*/
    @JsonProperty("VirtualMFADevice")
    private VirtualMFADeviceDto VirtualMFADevice;

    @Data
    @ToString
    public static class VirtualMFADeviceDto {
        /**krn*/
        @JsonProperty("SerialNumber")
        private String SerialNumber;

        /**启用时间*/
        @JsonProperty("EnableDate")
        private String EnableDate;

    }

}
