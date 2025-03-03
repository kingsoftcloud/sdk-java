package ksyun.client.slb.modifycertificatewithgroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyCertificateWithGroupRequest
 * @Description 请求参数
 */
@Data
public class ModifyCertificateWithGroupRequest {
    /**
     * 证书组的ID
     */
    @KsYunField(name = "AlbListenerCertGroupId")
    private String AlbListenerCertGroupId;

    /**
     * 旧证书的ID
     */
    @KsYunField(name = "OldCertificateId")
    private String OldCertificateId;

    /**
     * 新证书的ID
     */
    @KsYunField(name = "CertificateId")
    private String CertificateId;


}