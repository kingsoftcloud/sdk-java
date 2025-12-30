package ksyun.client.kec.deletededicatedcluster.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDedicatedClusterResponse
* @Description DeleteDedicatedCluster 返回体
*/
@Data
@ToString
public class DeleteDedicatedClusterResponse extends BaseResponseModel {

    /***/
    @JsonProperty("DedicatedClustersSet")
    private List<DedicatedClustersSetDto> DedicatedClustersSet;

    @Data
    @ToString
    public static class DedicatedClustersSetDto {
        /***/
        @JsonProperty("DedicatedClusterId")
        private String DedicatedClusterId;

        /***/
        @JsonProperty("Return")
        private String ReturnField;

        /***/
        @JsonProperty("Message")
        private String Message;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
