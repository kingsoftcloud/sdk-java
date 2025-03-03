package ksyun.client.slb.createhostheader.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateHostHeaderRequest
 * @Description 请求参数
 */
@Data
public class CreateHostHeaderRequest {
    /**
     * 监听器的ID
     */
    @KsYunField(name = "ListenerId")
    private String ListenerId;

    /**
     * 证书的ID
     */
    @KsYunField(name = "CertificateId")
    private String CertificateId;

    /**
     * 域名
     */
    @KsYunField(name = "HostHeader")
    private String HostHeader;

}