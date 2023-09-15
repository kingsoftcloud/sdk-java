package ksyun.client.waf.describecertificates.v20200707;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeCertificatesRequest
* @Description 请求参数
*/
@Data
public class DescribeCertificatesRequest{
    /**rs（请求参数）*/
    @KsYunField(name="Request")
    private String Request;


}