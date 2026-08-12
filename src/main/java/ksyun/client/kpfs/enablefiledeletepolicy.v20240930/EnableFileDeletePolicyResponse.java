package ksyun.client.kpfs.enablefiledeletepolicy.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EnableFileDeletePolicyResponse
* @Description EnableFileDeletePolicy 返回体
*/
@Data
@ToString
public class EnableFileDeletePolicyResponse extends BaseResponseModel {

    /**唯一请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
