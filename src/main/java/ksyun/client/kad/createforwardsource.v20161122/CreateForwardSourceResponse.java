package ksyun.client.kad.createforwardsource.v20161122;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname CreateForwardSourceResponse
 * @Description CreateForwardSource 返回体
 */
@Data
@ToString
public class CreateForwardSourceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
