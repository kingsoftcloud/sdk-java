package ksyun.client.kfw.deletebatchhostbook.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteBatchHostbookResponse
* @Description DeleteBatchHostbook 返回体
*/
@Data
@ToString
public class DeleteBatchHostbookResponse extends BaseResponseModel {

    /**请求的唯一标识符，用于追踪和调试API调用。每次API调用都会生成一个唯一的RequestId，格式为UUID。可用于问题排查和日志关联。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
