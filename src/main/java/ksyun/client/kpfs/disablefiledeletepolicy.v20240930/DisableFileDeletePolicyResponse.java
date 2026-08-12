package ksyun.client.kpfs.disablefiledeletepolicy.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DisableFileDeletePolicyResponse
* @Description DisableFileDeletePolicy 返回体
*/
@Data
@ToString
public class DisableFileDeletePolicyResponse extends BaseResponseModel {

    /**唯一请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
