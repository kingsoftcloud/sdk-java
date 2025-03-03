package ksyun.client.waf.deleteipv6protection.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteIpv6ProtectionResponse
 * @Description DeleteIpv6Protection 返回体
 */
@Data
@ToString
public class DeleteIpv6ProtectionResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
