package ksyun.client.cdn.gettopreferdata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetTopReferDataResponse
* @Description GetTopReferData 返回体
*/
@Data
@ToString
public class GetTopReferDataResponse extends BaseResponseModel {

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
    @JsonProperty("Domains")
    private String Domains;

    /***/
    @JsonProperty("LimitN")
    private Integer LimitN;

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
        @JsonProperty("Refer")
        private String Refer;

        /***/
        @JsonProperty("Rank")
        private Integer Rank;

        /***/
        @JsonProperty("Pv")
        private Integer Pv;

        /***/
        @JsonProperty("PvProportion")
        private Double PvProportion;

        /***/
        @JsonProperty("Flow")
        private Integer Flow;

        /***/
        @JsonProperty("FlowProportion")
        private Double FlowProportion;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
