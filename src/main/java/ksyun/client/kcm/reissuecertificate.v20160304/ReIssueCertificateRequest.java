package ksyun.client.kcm.reissuecertificate.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ReIssueCertificateRequest
* @Description 请求参数
*/
@Data
public class ReIssueCertificateRequest{
    /**证书id*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

    /**是否重新生成csr。
值：new：重新生成csr。不传则用老的csr*/
    @KsYunField(name="CsrSource")
    private String CsrSource;

}
