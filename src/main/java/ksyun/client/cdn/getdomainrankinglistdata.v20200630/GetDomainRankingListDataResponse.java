package ksyun.client.cdn.getdomainrankinglistdata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDomainRankingListDataResponse
* @Description GetDomainRankingListData 返回体
*/
@Data
@ToString
public class GetDomainRankingListDataResponse extends BaseResponseModel {
    /***/
    @JsonProperty("StartTime")
    private String StartTime;

    /***/
    @JsonProperty("EndTime")
    private String EndTime;

    /***/
    @JsonProperty("CdnType")
    private String CdnType;

    /***/
    @JsonProperty("SortBy")
    private String SortBy;

    /***/
    @JsonProperty("Datas")
    private List<DatasDto> Datas;

    @Data
    @ToString
    public static class DatasDto {
        /***/
        @JsonProperty("Domain")
        private String Domain;

        /***/
        @JsonProperty("Rank")
        private Integer Rank;

        /***/
        @JsonProperty("Flow")
        private Integer Flow;

        /***/
        @JsonProperty("FlowProportion")
        private Double FlowProportion;

        /***/
        @JsonProperty("Bw")
        private Integer Bw;

        /***/
        @JsonProperty("PeakTime")
        private String PeakTime;

        /***/
        @JsonProperty("Pv")
        private Integer Pv;

        /***/
        @JsonProperty("PvProportion")
        private Double PvProportion;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
