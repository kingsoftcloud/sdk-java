package ksyun.client.kcm.listcertificates.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ListCertificatesRequest
 * @Description 请求参数
 */
@Data
public class ListCertificatesRequest {
    /**
     * 一个或多个证书ID
     */
    @KsYunField(name = "CertificateId")
    private List<String> CertificateIdList;

    /**
     * 一个或多个项目ID，若缺省则默认值为0
     */
    @KsYunField(name = "ProjectId")
    private List<Integer> ProjectId;

    /**
     * 主域名
     */
    @KsYunField(name = "Filter")
    private List<String> FilterList;

    /**
     * 页码
     */
    @KsYunField(name = "Page")
    private Integer Page;

    /**
     * 默认20
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

}