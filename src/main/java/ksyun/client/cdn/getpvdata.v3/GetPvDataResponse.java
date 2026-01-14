package ksyun.client.cdn.getpvdata.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetPvDataResponse
* @Description GetPvData 返回体
*/
@Data
@ToString
public class GetPvDataResponse extends BaseResponseModel {

    /**开始时间*/
    @JsonProperty("StartTime")
    private String StartTime;

    /**结束时间*/
    @JsonProperty("EndTime")
    private String EndTime;

    /**产品类型*/
    @JsonProperty("CdnType")
    private String CdnType;

    /**域名ID列表，逗号（半角）间隔*/
    @JsonProperty("DomainIds")
    private String DomainIds;

    /**区域，逗号（半角）间隔（枚举类型表见[使用须知](https://docs.ksyun.com/documents/196#36)）*/
    @JsonProperty("Regions")
    private String Regions;

    /**取值为0：多域名多区域数据做合并返回；1：每个域名每个区域的数据分别返回*/
    @JsonProperty("ResultType")
    private Long ResultType;

    /**统计粒度，取值为 5：5分钟粒度；10：10分钟粒度；20：20分钟粒度；60：1小时粒度；240：4小时粒度；480：8小时粒度；1440：1天粒度；以上粒度的请求数均取该粒度时间段的请求数总和*/
    @JsonProperty("Granularity")
    private Long Granularity;

    /**数据类型， 取值为edge:服务数据; origin:回源数据; 支持多类型选择，多个类型用逗号（半角）分隔，缺省为edge*/
    @JsonProperty("DataType")
    private String DataType;

    /**每个时间粒度的请求数数据*/
    @JsonProperty("Datas")
    private List<DatasDto> Datas;

    @Data
    @ToString
    public static class DatasDto {
        /**时间点*/
        @JsonProperty("Time")
        private String Time;

        /**服务请求数（单位：次）（所选域名合并值）*/
        @JsonProperty("Pv")
        private Long Pv;

        /**回源请求数（单位：次）（所选域名合并值）*/
        @JsonProperty("SrcPv")
        private Long SrcPv;

        /**每个域名的详细请求数数据(仅当ResultType取值为1时返回此项数据))*/
        @JsonProperty("Domains")
        private List<DatasDomainsDto> Domains;

        @Data
        @ToString
        public static class DatasDomainsDto {
            /**域名ID*/
            @JsonProperty("DomainId")
            private String DomainId;

            /**服务请求数（单位：次）（该域名的服务请求数，若选择多个区域，则返回该域名多个区域的数据合并值）*/
            @JsonProperty("Pv")
            private Long Pv;

            /**该域名在每个区域的请求数详细数据*/
            @JsonProperty("Regions")
            private List<DatasDomainsRegionsDto> Regions;

            @Data
            @ToString
            public static class DatasDomainsRegionsDto {
                /**区域*/
                @JsonProperty("Region")
                private String Region;

                /**服务请求数（单位：次）（该域名在该区域的服务请求数数据）*/
                @JsonProperty("Pv")
                private Long Pv;

                /**回源请求数（单位：次）（该域名在该区域的回源请求数数据）*/
                @JsonProperty("SrcPv")
                private Long SrcPv;

            }

            /**回源请求数（单位：次）（该域名的回源请求数，若选择多个区域，则返回该域名多个区域的数据合并值）*/
            @JsonProperty("SrcPv")
            private Long SrcPv;

        }

    }

}
