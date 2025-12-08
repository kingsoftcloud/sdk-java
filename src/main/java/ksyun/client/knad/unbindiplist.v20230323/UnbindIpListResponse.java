package ksyun.client.knad.unbindiplist.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UnbindIpListResponse
* @Description UnbindIpList 返回体
*/
@Data
@ToString
public class UnbindIpListResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("EipCount")
    private Integer EipCount;

    /***/
    @JsonProperty("EipSet")
    private List<EipSetDto> EipSet;

    @Data
    @ToString
    public static class EipSetDto {
        /***/
        @JsonProperty("Ip")
        private String Ip;

        /***/
        @JsonProperty("EipId")
        private String EipId;

        /**资源类型*/
        @JsonProperty("InstanceType")
        private String InstanceType;

    }

}
