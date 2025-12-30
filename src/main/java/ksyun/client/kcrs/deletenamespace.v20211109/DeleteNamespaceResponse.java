package ksyun.client.kcrs.deletenamespace.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteNamespaceResponse
* @Description DeleteNamespace 返回体
*/
@Data
@ToString
public class DeleteNamespaceResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
