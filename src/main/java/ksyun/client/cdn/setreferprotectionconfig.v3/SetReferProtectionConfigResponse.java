package ksyun.client.cdn.setreferprotectionconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetReferProtectionConfigResponse
* @Description SetReferProtectionConfig 返回体
*/
@Data
@ToString
public class SetReferProtectionConfigResponse extends BaseResponseModel {

    /**SetReferProtectionConfigResponse*/
    @JsonProperty("SetReferProtectionConfigResponse")
    private String SetReferProtectionConfigResponse;

}
