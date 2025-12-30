package ksyun.client.kce.updateclusterdelprotection.v20231115;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateClusterDelProtectionResponse
* @Description UpdateClusterDelProtection 返回体
*/
@Data
@ToString
public class UpdateClusterDelProtectionResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
