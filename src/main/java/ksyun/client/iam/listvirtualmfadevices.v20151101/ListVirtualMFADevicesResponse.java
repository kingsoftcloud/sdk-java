package ksyun.client.iam.listvirtualmfadevices.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ListVirtualMFADevicesResponse
 * @Description ListVirtualMFADevices 返回体
 */
@Data
@ToString
public class ListVirtualMFADevicesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
