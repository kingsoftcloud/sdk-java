package ksyun.client.ked.clouddeskcreate.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CloudDeskcreateResponse
* @Description CloudDeskcreate 返回体
*/
@Data
@ToString
public class CloudDeskcreateResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**创建的实例id*/
        @JsonProperty("instanceId")
        private List<String> InstanceId;

    }

}
