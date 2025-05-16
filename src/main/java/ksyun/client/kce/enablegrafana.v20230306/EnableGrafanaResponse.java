package ksyun.client.kce.enablegrafana.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname EnableGrafanaResponse
 * @Description EnableGrafana 返回体
 */
@Data
@ToString
public class EnableGrafanaResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
