package ksyun.client.kcs.describecacheparametergroups.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCacheParameterGroupsResponse
* @Description DescribeCacheParameterGroups 返回体
*/
@Data
@ToString
public class DescribeCacheParameterGroupsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("engine")
        private String Engine;

        /***/
        @JsonProperty("created")
        private String Created;

        /***/
        @JsonProperty("updated")
        private String Updated;

    }

}
