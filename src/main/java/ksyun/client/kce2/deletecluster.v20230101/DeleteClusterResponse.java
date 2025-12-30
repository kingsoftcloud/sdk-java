package ksyun.client.kce2.deletecluster.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteClusterResponse
* @Description DeleteCluster 返回体
*/
@Data
@ToString
public class DeleteClusterResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("Request")
    private String Request;

    /**返回数据*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**被删除的集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

    }

}
