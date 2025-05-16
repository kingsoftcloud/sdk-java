package ksyun.client.iam.getprojectinstancelistnew.v20240513;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname GetProjectInstanceListNewResponse
 * @Description GetProjectInstanceListNew 返回体
 */
@Data
@ToString
public class GetProjectInstanceListNewResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
