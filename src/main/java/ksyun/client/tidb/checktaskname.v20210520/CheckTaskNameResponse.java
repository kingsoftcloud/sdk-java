package ksyun.client.tidb.checktaskname.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CheckTaskNameResponse
* @Description CheckTaskName 返回体
*/
@Data
@ToString
public class CheckTaskNameResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /**任务名称列表(任务名不重复)*/
    @JsonProperty("Data")
    private List<String> Data;

}
