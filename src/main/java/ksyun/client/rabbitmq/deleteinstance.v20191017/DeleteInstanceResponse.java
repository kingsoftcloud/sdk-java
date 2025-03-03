package ksyun.client.rabbitmq.deleteinstance.v20191017;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteInstanceResponse
 * @Description DeleteInstance 返回体
 */
@Data
@ToString
public class DeleteInstanceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
