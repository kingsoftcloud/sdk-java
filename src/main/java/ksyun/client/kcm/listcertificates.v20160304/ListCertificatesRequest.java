package ksyun.client.kcm.listcertificates.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListCertificatesRequest
* @Description 请求参数
*/
@Data
public class ListCertificatesRequest{
    /**一个或多个证书ID*/
    @KsYunField(name="CertificateId")
    private List<String> CertificateIdList;

    /**一个或多个项目ID*/
    @KsYunField(name="ProjectId")
    private Integer[] ProjectId;

    /**主域名*/
    @KsYunField(name="Filter")
    private List<String> FilterList;


}