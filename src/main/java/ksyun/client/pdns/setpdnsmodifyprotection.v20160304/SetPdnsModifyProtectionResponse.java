package ksyun.client.pdns.setpdnsmodifyprotection.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetPdnsModifyProtectionResponse
* @Description SetPdnsModifyProtection 返回体
*/
@Data
@ToString
public class SetPdnsModifyProtectionResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
