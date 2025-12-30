package ksyun.client.kce2.modifycluster.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyClusterResponse
* @Description ModifyCluster 返回体
*/
@Data
@ToString
public class ModifyClusterResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回数据*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**被修改的集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

    }

}
