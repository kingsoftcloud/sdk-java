package ksyun.client.kcm.describecertificates.v20160304;

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
    /***/
    @KsYunField(name="CertificateId",type=2)
    private List<String> CertificateIdList;

}
