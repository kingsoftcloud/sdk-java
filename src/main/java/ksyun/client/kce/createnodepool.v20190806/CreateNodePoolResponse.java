package ksyun.client.kce.createnodepool.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateNodePoolResponse
* @Description CreateNodePool 返回体
*/
@Data
@ToString
public class CreateNodePoolResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**节点池id*/
    @JsonProperty("NodePoolId")
    private String NodePoolId;

}
