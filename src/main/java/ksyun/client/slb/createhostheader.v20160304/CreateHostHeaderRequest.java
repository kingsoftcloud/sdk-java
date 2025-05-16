package ksyun.client.slb.createhostheader.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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