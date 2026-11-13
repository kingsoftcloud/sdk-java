package ksyun.client.aicp.listsessions.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListSessionsResponse
* @Description ListSessions 返回体
*/
@Data
@ToString
public class ListSessionsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Action")
    private String Action;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Sessions")
        private List<String> Sessions;

        /***/
        @JsonProperty("Total")
        private Integer Total;

        /***/
        @JsonProperty("Page")
        private Integer Page;

        /***/
        @JsonProperty("PageSize")
        private Integer PageSize;

        /***/
        @JsonProperty("DataSource")
        private String DataSource;

        /***/
        @JsonProperty("Degraded")
        private Boolean Degraded;

        /***/
        @JsonProperty("SessionContractVersion")
        private Integer SessionContractVersion;

    }

}
