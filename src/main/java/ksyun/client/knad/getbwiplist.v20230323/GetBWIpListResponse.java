package ksyun.client.knad.getbwiplist.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetBWIpListResponse
* @Description GetBWIpList 返回体
*/
@Data
@ToString
public class GetBWIpListResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("IpList")
    private List<IpListDto> IpList;

    @Data
    @ToString
    public static class IpListDto {
        /***/
        @JsonProperty("id")
        private String Id;

        /***/
        @JsonProperty("ip")
        private String Ip;

    }

    /***/
    @JsonProperty("total")
    private Integer Total;

}
