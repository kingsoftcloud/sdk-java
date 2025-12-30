package ksyun.client.cdn.setipprotectionconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetIpProtectionConfigResponse
* @Description SetIpProtectionConfig 返回体
*/
@Data
@ToString
public class SetIpProtectionConfigResponse extends BaseResponseModel {

    /**SetIpProtectionConfigResponse*/
    @JsonProperty("SetIpProtectionConfigResponse")
    private String SetIpProtectionConfigResponse;

}
