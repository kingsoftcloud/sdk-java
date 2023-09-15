package ksyun.client.kcs.addcacheslavenode.v20170401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname AddCacheSlaveNodeResponse
* @Description AddCacheSlaveNode 返回体
*/
@Data
@ToString
public class AddCacheSlaveNodeResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
