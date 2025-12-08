package ksyun.client.sqlserver.updateresourceprotection.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateResourceProtectionResponse
* @Description UpdateResourceProtection 返回体
*/
@Data
@ToString
public class UpdateResourceProtectionResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
