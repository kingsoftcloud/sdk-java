package ksyun.client.iam.deactivatemfadevice.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeactivateMFADeviceResponse
* @Description DeactivateMFADevice 返回体
*/
@Data
@ToString
public class DeactivateMFADeviceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
