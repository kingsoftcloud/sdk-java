package ksyun.client.kcrs.deletenamespace.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DeleteNamespaceResponse
 * @Description DeleteNamespace 返回体
 */
@Data
@ToString
public class DeleteNamespaceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
