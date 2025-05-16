package ksyun.client.slb.associatecertificatewithgroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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