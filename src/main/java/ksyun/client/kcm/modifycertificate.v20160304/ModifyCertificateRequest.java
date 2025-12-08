package ksyun.client.kcm.modifycertificate.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyCertificateRequest
* @Description 请求参数
*/
@Data
public class ModifyCertificateRequest{
    /**证书ID*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

    /**证书名称*/
    @KsYunField(name="CertificateName")
    private String CertificateName;

    /**私钥*/
    @KsYunField(name="PrivateKey")
    private String PrivateKey;

    /**公钥*/
    @KsYunField(name="PublicKey")
    private String PublicKey;

}
