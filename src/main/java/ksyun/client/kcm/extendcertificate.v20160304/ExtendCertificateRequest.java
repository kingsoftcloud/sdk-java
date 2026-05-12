package ksyun.client.kcm.extendcertificate.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ExtendCertificateRequest
* @Description 请求参数
*/
@Data
public class ExtendCertificateRequest{
    /**旧证书ID*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

    /**证书代码*/
    @KsYunField(name="CertificateCode")
    private String CertificateCode;

    /**证书年限，最长续费1年*/
    @KsYunField(name="YearLength")
    private Integer YearLength;

    /**域名数量，最小值为1*/
    @KsYunField(name="DomainCount")
    private Integer DomainCount;

    /**通配符域名数量，最小值为0*/
    @KsYunField(name="WildcardCount")
    private Integer WildcardCount;

    /**计费方式：801 一次性预付费 805 一次性后付费  不填默认值为：805 一次性后付费*/
    @KsYunField(name="BillType")
    private Integer BillType;

}
