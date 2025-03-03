package ksyun.client.slb.modifyhostheader.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyHostHeaderRequest
 * @Description 请求参数
 */
@Data
public class ModifyHostHeaderRequest {
    /**
     * 域名的ID
     */
    @KsYunField(name = "HostHeaderId")
    private String HostHeaderId;

    /**
     * 证书的ID
     */
    @KsYunField(name = "CertificateId")
    private String CertificateId;


}