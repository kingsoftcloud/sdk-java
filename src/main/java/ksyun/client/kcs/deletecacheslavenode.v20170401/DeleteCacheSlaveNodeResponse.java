package ksyun.client.kcs.deletecacheslavenode.v20170401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteCacheSlaveNodeResponse
* @Description DeleteCacheSlaveNode 返回体
*/
@Data
@ToString
public class DeleteCacheSlaveNodeResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
