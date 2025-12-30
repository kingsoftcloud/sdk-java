package ksyun.client.kce.updatenodepooldelprotection.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateNodePoolDelProtectionResponse
* @Description UpdateNodePoolDelProtection 返回体
*/
@Data
@ToString
public class UpdateNodePoolDelProtectionResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
