package ksyun.client.krds.slowlogdetail.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname SlowLogDetailResponse
 * @Description SlowLogDetail 返回体
 */
@Data
@ToString
public class SlowLogDetailResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
