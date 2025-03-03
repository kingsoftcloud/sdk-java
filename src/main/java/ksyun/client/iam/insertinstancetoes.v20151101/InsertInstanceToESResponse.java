package ksyun.client.iam.insertinstancetoes.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname InsertInstanceToESResponse
 * @Description InsertInstanceToES 返回体
 */
@Data
@ToString
public class InsertInstanceToESResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
