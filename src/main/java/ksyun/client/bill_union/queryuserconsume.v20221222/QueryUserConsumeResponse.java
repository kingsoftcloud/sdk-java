package ksyun.client.bill_union.queryuserconsume.v20221222;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname QueryUserConsumeResponse
 * @Description QueryUserConsume 返回体
 */
@Data
@ToString
public class QueryUserConsumeResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
