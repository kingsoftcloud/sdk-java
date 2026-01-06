package ksyun.client.cdn.setcertificate.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetCertificateRequest
* @Description 请求参数
*/
@Data
public class SetCertificateRequest{
    /**证书对应的唯一ID*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

    /**安全证书名称*/
    @KsYunField(name="CertificateName")
    private String CertificateName;

    /**域名对应的安全证书内容*/
    @KsYunField(name="ServerCertificate")
    private String ServerCertificate;

    /**安全证书对应的私钥内容*/
    @KsYunField(name="PrivateKey")
    private String PrivateKey;

}
