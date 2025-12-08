package ksyun.client.kcm.createcertificate.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateCertificateRequest
* @Description 请求参数
*/
@Data
public class CreateCertificateRequest{
    /**证书名称*/
    @KsYunField(name="CertificateName")
    private String CertificateName;

    /**私钥*/
    @KsYunField(name="PrivateKey")
    private String PrivateKey;

    /**公钥*/
    @KsYunField(name="PublicKey")
    private String PublicKey;

    /**证书类型，SVR|CA*/
    @KsYunField(name="CertificateType")
    private String CertificateType;

    /**证书来源own|kcm，可以不传，kcm来源的证书必传*/
    @KsYunField(name="Source")
    private String Source;

    /**kcm来源的ssl证书id，kcm来源的证书必传*/
    @KsYunField(name="SslCertificateId")
    private String SslCertificateId;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;

}
