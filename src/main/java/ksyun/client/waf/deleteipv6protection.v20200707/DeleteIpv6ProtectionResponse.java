package ksyun.client.waf.deleteipv6protection.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteIpv6ProtectionResponse
* @Description DeleteIpv6Protection 返回体
*/
@Data
@ToString
public class DeleteIpv6ProtectionResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
