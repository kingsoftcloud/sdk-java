package ksyun.client.waf.createipv6protection.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateIpv6ProtectionResponse
* @Description CreateIpv6Protection 返回体
*/
@Data
@ToString
public class CreateIpv6ProtectionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
