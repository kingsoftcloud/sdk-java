package ksyun.client.cdn.getflowdata.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetFlowDataResponse
* @Description GetFlowData 返回体
*/
@Data
@ToString
public class GetFlowDataResponse extends BaseResponseModel {

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

    /**区域，逗号（半角）间隔，枚举类型表见[使用须知](使用须知)*/
    @JsonProperty("Regions")
    private String Regions;

    /**取值为0：多域名多区域数据做合并返回；1：每个域名每个区域的数据分别返回*/
    @JsonProperty("ResultType")
    private Integer ResultType;

    /**统计粒度，取值为 5：5分钟粒度；10：10分钟粒度；20：20分钟粒度；60：1小时粒度；240：4小时粒度；480：8小时粒度；1440：1天粒度；以上粒度流量值均取该粒度时间段的流量总和*/
    @JsonProperty("Granularity")
    private Integer Granularity;

    /**数据类型， 取值为edge:服务数据; origin:回源数据; 支持多类型选择，多个类型用逗号（半角）分隔，缺省为edge*/
    @JsonProperty("DataType")
    private String DataType;

    /**每个时间粒度的流量数据*/
    @JsonProperty("Datas")
    private List<DatasDto> Datas;

    @Data
    @ToString
    public static class DatasDto {
        /**时间点*/
        @JsonProperty("Time")
        private String Time;

        /**服务流量（单位：byte）（所选域名合并值）*/
        @JsonProperty("Flow")
        private Integer Flow;

        /**回源流量（单位：byte）（所选域名合并值）*/
        @JsonProperty("SrcFlow")
        private Integer SrcFlow;

        /**每个域名的详细流量数据(仅当ResultType取值为1时返回此项数据))*/
        @JsonProperty("Domains")
        private List<DatasDomainsDto> Domains;

        @Data
        @ToString
        public static class DatasDomainsDto {
            /**域名ID*/
            @JsonProperty("DomainId")
            private String DomainId;

            /**服务流量（单位：byte）（该域名的服务流量，若选择多个区域，则返回该域名多个区域的数据合并值）*/
            @JsonProperty("Flow")
            private Integer Flow;

            /**回源流量（单位：byte）（该域名的回源流量，若选择多个区域，则返回该域名多个区域的数据合并值）*/
            @JsonProperty("SrcFlow")
            private Integer SrcFlow;

            /**该域名在每个区域的流量详细数据*/
            @JsonProperty("Regions")
            private List<DatasDomainsRegionsDto> Regions;

            @Data
            @ToString
            public static class DatasDomainsRegionsDto {
                /**区域*/
                @JsonProperty("Region")
                private String Region;

                /**服务流量（单位：byte）（该域名在该区域的服务流量数据）*/
                @JsonProperty("Flow")
                private Integer Flow;

                /**回源流量（单位：byte）（该域名在该区域的回源流量数据）*/
                @JsonProperty("SrcFlow")
                private Integer SrcFlow;

            }

        }

    }

}
