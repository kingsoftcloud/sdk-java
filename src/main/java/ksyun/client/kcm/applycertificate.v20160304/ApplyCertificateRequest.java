package ksyun.client.kcm.applycertificate.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ApplyCertificateRequest
 * @Description 请求参数
 */
@Data
public class ApplyCertificateRequest {
    /**
     * 证书绑定主域名
     */
    @KsYunField(name = "MainDomain")
    private String MainDomain;

    /**
     * 证书代码，详见[CertificateCode可选值](https://docs.ksyun.com/documents/37638)
     */
    @KsYunField(name = "CertificateCode")
    private String CertificateCode;

    /**
     * 证书年限，默认值为1
     */
    @KsYunField(name = "YearLength")
    private Integer YearLength;

    /**
     * 域名数量，最小值为1
     */
    @KsYunField(name = "DomainCount")
    private Integer DomainCount;

    /**
     * 通配符域名数量，最小值为0
     */
    @KsYunField(name = "WildcardCount")
    private Integer WildcardCount;

    /**
     * 生成订单时产生的商品ID
     */
    @KsYunField(name = "ProductId")
    private String ProductId;

    /**
     * 产生的子订单ID
     */
    @KsYunField(name = "SubOrderId")
    private String SubOrderId;

    /**
     * 资源所属项目ID
     */
    @KsYunField(name = "ProjectId")
    private Integer ProjectId;

}