package ksyun.client.slb.dissociatecertificatewithgroup.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DissociateCertificateWithGroupRequest
* @Description 请求参数
*/
@Data
public class DissociateCertificateWithGroupRequest{
    /**证书组的ID*/
    @KsYunField(name="ListenerCertGroupId")
    private String ListenerCertGroupId;

    /**证书的ID*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

}
