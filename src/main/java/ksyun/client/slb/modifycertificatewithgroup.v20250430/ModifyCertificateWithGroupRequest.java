package ksyun.client.slb.modifycertificatewithgroup.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyCertificateWithGroupRequest
* @Description 请求参数
*/
@Data
public class ModifyCertificateWithGroupRequest{
    /**证书组的ID*/
    @KsYunField(name="ListenerCertGroupId")
    private String ListenerCertGroupId;

    /**旧证书的ID*/
    @KsYunField(name="OldCertificateId")
    private String OldCertificateId;

    /**新证书的ID*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

}
