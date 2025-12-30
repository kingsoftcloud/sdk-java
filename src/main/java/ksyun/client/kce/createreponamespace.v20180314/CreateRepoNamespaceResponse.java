package ksyun.client.kce.createreponamespace.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateRepoNamespaceResponse
* @Description CreateRepoNamespace 返回体
*/
@Data
@ToString
public class CreateRepoNamespaceResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
