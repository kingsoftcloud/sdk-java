package ksyun.client.waf.describecertificates.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeCertificatesResponse
 * @Description DescribeCertificates 返回体
 */
@Data
@ToString
public class DescribeCertificatesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
