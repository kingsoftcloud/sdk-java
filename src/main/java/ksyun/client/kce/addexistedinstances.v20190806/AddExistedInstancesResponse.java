package ksyun.client.kce.addexistedinstances.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname AddExistedInstancesResponse
 * @Description AddExistedInstances 返回体
 */
@Data
@ToString
public class AddExistedInstancesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
