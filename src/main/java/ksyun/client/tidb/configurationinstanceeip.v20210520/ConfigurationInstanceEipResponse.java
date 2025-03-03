package ksyun.client.tidb.configurationinstanceeip.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ConfigurationInstanceEipResponse
 * @Description ConfigurationInstanceEip 返回体
 */
@Data
@ToString
public class ConfigurationInstanceEipResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
