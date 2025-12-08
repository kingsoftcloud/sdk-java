package ksyun.client.eip.getlines.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetLinesResponse
* @Description GetLines 返回体
*/
@Data
@ToString
public class GetLinesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**线路列表*/
    @JsonProperty("LineSet")
    private List<LineSetDto> LineSet;

    @Data
    @ToString
    public static class LineSetDto {
        /**线路ID*/
        @JsonProperty("LineId")
        private String LineId;

        /**线路类型*/
        @JsonProperty("LineType")
        private String LineType;

        /**线路名称*/
        @JsonProperty("LineName")
        private String LineName;

        /**IP版本*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**供应商*/
        @JsonProperty("Isp")
        private String Isp;

    }

}
