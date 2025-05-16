package ksyun.client.tidb.checktaskname.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname CheckTaskNameResponse
 * @Description CheckTaskName 返回体
 */
@Data
@ToString
public class CheckTaskNameResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
