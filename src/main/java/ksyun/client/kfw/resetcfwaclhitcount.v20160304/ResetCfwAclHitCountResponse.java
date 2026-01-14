package ksyun.client.kfw.resetcfwaclhitcount.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ResetCfwAclHitCountResponse
* @Description ResetCfwAclHitCount 返回体
*/
@Data
@ToString
public class ResetCfwAclHitCountResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
