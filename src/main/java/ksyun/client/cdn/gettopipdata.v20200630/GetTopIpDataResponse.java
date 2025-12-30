package ksyun.client.cdn.gettopipdata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetTopIpDataResponse
* @Description GetTopIpData 返回体
*/
@Data
@ToString
public class GetTopIpDataResponse extends BaseResponseModel {

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
    @JsonProperty("LimitN")
    private Integer LimitN;

    /***/
    @JsonProperty("Datas")
    private List<DatasDto> Datas;

    @Data
    @ToString
    public static class DatasDto {
        /***/
        @JsonProperty("Ip")
        private String Ip;

        /***/
        @JsonProperty("Pv")
        private Integer Pv;

        /***/
        @JsonProperty("Flow")
        private Integer Flow;

    }

    /***/
    @JsonProperty("Domains")
    private String Domains;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("SortBy")
    private String SortBy;

}
