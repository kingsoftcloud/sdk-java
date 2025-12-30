package ksyun.client.kcrs.createnamespace.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateNamespaceResponse
* @Description CreateNamespace 返回体
*/
@Data
@ToString
public class CreateNamespaceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
