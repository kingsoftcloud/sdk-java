package ksyun.client.iam.enablemfadevice.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EnableMFADeviceResponse
* @Description EnableMFADevice 返回体
*/
@Data
@ToString
public class EnableMFADeviceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
