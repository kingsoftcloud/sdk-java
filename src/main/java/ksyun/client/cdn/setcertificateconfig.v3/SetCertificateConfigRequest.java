package ksyun.client.cdn.setcertificateconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetCertificateConfigRequest
* @Description 请求参数
*/
@Data
public class SetCertificateConfigRequest{
    /**开启、关闭设置服务证书，取值：on：开启，off：关闭，默认为off。当选择开启时，以下为必填 ；当选择关闭时，联动关闭 HTTP 2.0 和强制跳转*/
    @KsYunField(name="Enable")
    private String Enable;

    /**域名ID，支持按逗号分隔输入多条Id*/
    @KsYunField(name="DomainIds")
    private String DomainIds;

    /**金山云生成的安全证书唯一性ID；若输入证书ID，则CertificateName、ServerCertificate、PrivateKey可不填写；若无证书ID，则CertificateName、ServerCertificate、PrivateKey为必填
注: CertificateId有值时，忽略CertificateName、ServerCertificate和Privatekey的值。*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

    /**安全证书名称*/
    @KsYunField(name="CertificateName")
    private String CertificateName;

    /**域名对应的安全证书内容*/
    @KsYunField(name="ServerCertificate")
    private String ServerCertificate;

    /**安全证书对应的私钥内容*/
    @KsYunField(name="PrivateKey")
    private String PrivateKey;

}
