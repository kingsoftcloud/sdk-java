package ksyun.client.kcm.getcertificatedetail.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetCertificateDetailRequest
 * @Description 请求参数
 */
@Data
public class GetCertificateDetailRequest {
    /**
     * 证书ID
     */
    @KsYunField(name = "CertificateId")
    private String CertificateId;

}