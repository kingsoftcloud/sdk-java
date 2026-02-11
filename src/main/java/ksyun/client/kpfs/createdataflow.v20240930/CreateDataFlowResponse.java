package ksyun.client.kpfs.createdataflow.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDataFlowResponse
* @Description CreateDataFlow 返回体
*/
@Data
@ToString
public class CreateDataFlowResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**数据流动ID。*/
    @JsonProperty("DataFlowId")
    private String DataFlowId;

}
