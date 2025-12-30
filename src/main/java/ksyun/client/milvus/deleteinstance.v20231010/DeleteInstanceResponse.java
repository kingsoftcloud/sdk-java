package ksyun.client.milvus.deleteinstance.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteInstanceResponse
* @Description DeleteInstance 返回体
*/
@Data
@ToString
public class DeleteInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**本次操作实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**本次操作状态：SUCCESS：成功，FAIL：失败；*/
        @JsonProperty("OperStatus")
        private String OperStatus;

        /**本次操作信息：SUCCESS：成功，失败返回具体失败信息；*/
        @JsonProperty("Msg")
        private String Msg;

    }

}
