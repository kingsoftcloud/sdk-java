package ksyun.client.waf.describecertificates.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCertificatesRequest
 * @Description 请求参数
 */
@Data
public class DescribeCertificatesRequest {
    /**
     * rs（请求参数）
     */
    @KsYunField(name = "Request")
    private String Request;

}