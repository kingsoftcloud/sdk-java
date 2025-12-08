package ksyun.client.ket.startloop.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartLoopResponse
* @Description StartLoop 返回体
*/
@Data
@ToString
public class StartLoopResponse extends BaseResponseModel {
    /**错误码*/
    @JsonProperty("ErrNum")
    private Integer ErrNum;

    /**错误信息*/
    @JsonProperty("ErrMsg")
    private String ErrMsg;

    /**轮播转码任务信息*/
    @JsonProperty("List")
    private List<ListDto> List;

    @Data
    @ToString
    public static class ListDto {
        /**轮播转码单个任务ID*/
        @JsonProperty("TaskID")
        private String TaskID;

        /***/
        @JsonProperty("Format")
        private Integer Format;

    }

}
