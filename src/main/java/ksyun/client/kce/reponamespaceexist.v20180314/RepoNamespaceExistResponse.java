package ksyun.client.kce.reponamespaceexist.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RepoNamespaceExistResponse
* @Description RepoNamespaceExist 返回体
*/
@Data
@ToString
public class RepoNamespaceExistResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**命名空间是否存在*/
    @JsonProperty("Exist")
    private Boolean Exist;

}
