package ksyun.client.vpc.createpathtask.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreatePathTaskResponse
* @Description CreatePathTask 返回体
*/
@Data
@ToString
public class CreatePathTaskResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**路径分析任务ID*/
    @JsonProperty("PathTaskId")
    private String PathTaskId;

}
