package ksyun.client.kce.createreponamespace.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateRepoNamespaceResponse
 * @Description CreateRepoNamespace 返回体
 */
@Data
@ToString
public class CreateRepoNamespaceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
