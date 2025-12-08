package ksyun.client.kce.updateclusterdelprotection.v20231115;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname UpdateClusterDelProtectionResponse
* @Description UpdateClusterDelProtection 返回体
*/
@Data
@ToString
public class UpdateClusterDelProtectionResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
