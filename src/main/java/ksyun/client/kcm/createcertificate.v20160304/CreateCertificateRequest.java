package ksyun.client.kcm.createcertificate.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateCertificateRequest
 * @Description 请求参数
 */
@Data
public class CreateCertificateRequest {
    /***/
    @KsYunField(name = "CertificateName")
    private String CertificateName;

    /**
     * CertificateType不传或者是SVR时
     * 必传该字段
     */
    @KsYunField(name = "PrivateKey")
    private String PrivateKey;

    /***/
    @KsYunField(name = "PublicKey")
    private String PublicKey;

    /**
     * SVR|CA
     * 服务端证书|客户端CA证书
     * 默认是服务端证书
     */
    @KsYunField(name = "CertificateType")
    private String CertificateType;

}