package ksyun.client.kcf.getlogdate.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname GetLogDateResponse
 * @Description GetLogDate 返回体
 */
@Data
@ToString
public class GetLogDateResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
