package ksyun.client.cdn.getcdndomains.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetCdnDomainsResponse
* @Description GetCdnDomains 返回体
*/
@Data
@ToString
public class GetCdnDomainsResponse extends BaseResponseModel {

    /**页码*/
    @JsonProperty("PageNumber")
    private Long PageNumber;

    /**单页大小*/
    @JsonProperty("PageSize")
    private Long PageSize;

    /**总条数*/
    @JsonProperty("TotalCount")
    private Long TotalCount;

    /**Domain列表*/
    @JsonProperty("Domains")
    private List<DomainsDto> Domains;

    @Data
    @ToString
    public static class DomainsDto {
        /**	
加速域名名称*/
        @JsonProperty("DomainName")
        private String DomainName;

        /**域名ID*/
        @JsonProperty("DomainId")
        private String DomainId;

        /**加速域名对应的CNAME域名*/
        @JsonProperty("Cname")
        private String Cname;

        /**产品类型：file：大文件下载，video：音视频点播，page：图片小文件，live：流媒体直播*/
        @JsonProperty("CdnType")
        private String CdnType;

        /**加速业务子类型，业务子类型是为了细分业务，默认不填写，目前作为已废弃的历史遗留字段Projectld*/
        @JsonProperty("CdnSubType")
        private String CdnSubType;

        /**ICP备案号*/
        @JsonProperty("IcpRegistration")
        private String IcpRegistration;

        /**加速域名状态，具体枚举类型表见使用须知*/
        @JsonProperty("DomainStatus")
        private String DomainStatus;

        /**加速域名创建时间*/
        @JsonProperty("CreatedTime")
        private String CreatedTime;

        /**加速域名最近修改时间*/
        @JsonProperty("ModifiedTime")
        private String ModifiedTime;

        /**审核失败原因，正常情况下为空*/
        @JsonProperty("Description")
        private String Description;

        /**域名所属项目ID*/
        @JsonProperty("Projectld")
        private Integer Projectld;

        /**域名所属项目名称*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**域名的服务区域*/
        @JsonProperty("Region")
        private String Region;

    }

}
