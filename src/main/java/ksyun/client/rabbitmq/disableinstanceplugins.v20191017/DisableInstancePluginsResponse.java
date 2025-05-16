package ksyun.client.rabbitmq.disableinstanceplugins.v20191017;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DisableInstancePluginsResponse
 * @Description DisableInstancePlugins 返回体
 */
@Data
@ToString
public class DisableInstancePluginsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
