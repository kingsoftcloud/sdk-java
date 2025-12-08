package ksyun.client.kcs.addcacheslavenode.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddCacheSlaveNodeResponse
* @Description AddCacheSlaveNode 返回体
*/
@Data
@ToString
public class AddCacheSlaveNodeResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("NodeId")
        private String NodeId;

    }

}
