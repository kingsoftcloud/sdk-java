package ksyun.client.cdn.setsetoriginadvancedconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetSetOriginAdvancedConfigResponse
* @Description SetSetOriginAdvancedConfig 返回体
*/
@Data
@ToString
public class SetSetOriginAdvancedConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("SetOriginAdvancedConfigResponse")
    private String SetOriginAdvancedConfigResponse;

}
