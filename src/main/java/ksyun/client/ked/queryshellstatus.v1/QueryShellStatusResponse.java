package ksyun.client.ked.queryshellstatus.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryShellStatusResponse
* @Description QueryShellStatus 返回体
*/
@Data
@ToString
public class QueryShellStatusResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**任务id*/
        @JsonProperty("plan_uuid")
        private Integer Plan_uuid;

        /**3执行失败
4执行完成*/
        @JsonProperty("status")
        private Integer Status;

        /**脚本名称*/
        @JsonProperty("name")
        private String Name;

        /**脚本版本号*/
        @JsonProperty("version")
        private String Version;

        /***/
        @JsonProperty("msg")
        private String Msg;

    }

}
