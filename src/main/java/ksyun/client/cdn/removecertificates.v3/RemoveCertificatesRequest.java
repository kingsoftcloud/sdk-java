package ksyun.client.cdn.removecertificates.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemoveCertificatesRequest
* @Description 请求参数
*/
@Data
public class RemoveCertificatesRequest{
    /**多个SSL安全证书ID,ID之间用英文半角“,”相隔*/
    @KsYunField(name="CertificateIds")
    private String CertificateIds;

}
