package ksyun.client.kci.describecontainergroupcount.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeContainerGroupCountResponse
* @Description DescribeContainerGroupCount 返回体
*/
@Data
@ToString
public class DescribeContainerGroupCountResponse extends BaseResponseModel {
    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ClusterPodCounts")
    private List<ClusterPodCountsDto> ClusterPodCounts;

    @Data
    @ToString
    public static class ClusterPodCountsDto {
        /***/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /***/
        @JsonProperty("Count")
        private Integer Count;

    }

}
