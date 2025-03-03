package ksyun.client.slb.associatecertificatewithgroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AssociateCertificateWithGroupRequest
 * @Description 请求参数
 */
@Data
public class AssociateCertificateWithGroupRequest {
    /**
     * 证书组的ID
     */
    @KsYunField(name = "AlbListenerCertGroupId")
    private String AlbListenerCertGroupId;

    /**
     * 证书的ID
     */
    @KsYunField(name = "CertificateId")
    private String CertificateId;

}