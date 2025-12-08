package ksyun.client.aicp.describenotebooklog.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeNotebookLogResponse
* @Description DescribeNotebookLog 返回体
*/
@Data
@ToString
public class DescribeNotebookLogResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
