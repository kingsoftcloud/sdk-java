package ksyun.client.kpfs.createdataflowstrategy.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname CreateDataFlowStrategyResponse
* @Description CreateDataFlowStrategy 返回体
*/
@Data
@ToString
public class CreateDataFlowStrategyResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
