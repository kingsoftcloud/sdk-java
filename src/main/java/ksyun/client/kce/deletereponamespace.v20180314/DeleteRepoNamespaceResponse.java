package ksyun.client.kce.deletereponamespace.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteRepoNamespaceResponse
 * @Description DeleteRepoNamespace 返回体
 */
@Data
@ToString
public class DeleteRepoNamespaceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
