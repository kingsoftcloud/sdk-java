package ksyun.client.waf.modifyalbdomain.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ModifyAlbDomainRequest
 * @Description 请求参数
 */
@Data
public class ModifyAlbDomainRequest {
    /**
     * 描述：域名记录的ID
     */
    @KsYunField(name = "ResourceRecordId")
    private String ResourceRecordId;

    /**
     * 描述：https强制跳转开启状态
     */
    @KsYunField(name = "HttpRewrite")
    private Boolean HttpRewrite;

    /**
     * 描述：http回源开启状态
     */
    @KsYunField(name = "HttpSource")
    private Boolean HttpSource;

    /**
     * 描述：域名使用证书的id
     */
    @KsYunField(name = "CertificateId")
    private String CertificateId;

    /**
     * 描述：域名使用证书的region
     */
    @KsYunField(name = "CertificateRegion")
    private String CertificateRegion;

    /**
     * 描述：负载均衡方式
     */
    @KsYunField(name = "LbMethod")
    private String LbMethod;

    /**
     * 描述：前置代理设置状态
     */
    @KsYunField(name = "HasProxy")
    private Boolean HasProxy;

    /**
     * 描述：域名所属项目的ID
     */
    @KsYunField(name = "ProjectId")
    private Integer ProjectId;

    /**
     * 描述：域名流量标记header字段名称
     */
    @KsYunField(name = "HeaderMark")
    private String HeaderMark;

    /**
     * 描述：域名流量标记header字段值
     */
    @KsYunField(name = "HeaderValue")
    private String HeaderValue;

    /**
     * 描述：健康检测
     */
    @KsYunField(name = "HealthMonitor")
    private String HealthMonitor;

    /**
     * 描述：http协议端口列表
     */
    @KsYunField(name = "HttpPort")
    private List<String> HttpPortList;

    /**
     * 描述：https协议端口列表
     */
    @KsYunField(name = "HttpsPort")
    private List<String> HttpsPortList;

    /**
     * 描述：域名回源信息列表
     */
    @KsYunField(name = "Sources")
    private String Sources;

}