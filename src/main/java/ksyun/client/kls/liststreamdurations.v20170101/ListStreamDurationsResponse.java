package ksyun.client.kls.liststreamdurations.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ListStreamDurationsResponse
 * @Description ListStreamDurations 返回体
 */
@Data
@ToString
public class ListStreamDurationsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
