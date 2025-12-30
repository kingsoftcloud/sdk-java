package ksyun.client.cdn.getvaliddomainlist.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetValidDomainListResponse
* @Description GetValidDomainList 返回体
*/
@Data
@ToString
public class GetValidDomainListResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Domainlist")
    private List<DomainlistDto> Domainlist;

    @Data
    @ToString
    public static class DomainlistDto {
        /**域名*/
        @JsonProperty("Domain")
        private String Domain;

        /**域名ID*/
        @JsonProperty("DomainId")
        private String DomainId;

        /**域名所属项目ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**该域名的产品类型，取值为file：大文件下载，video：音视频点播，page：图片小文件，live：流媒体直播*/
        @JsonProperty("CdnType")
        private String CdnType;

    }

}
