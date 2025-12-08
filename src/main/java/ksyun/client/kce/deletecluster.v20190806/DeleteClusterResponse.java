package ksyun.client.kce.deletecluster.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteClusterResponse
* @Description DeleteCluster 返回体
*/
@Data
@ToString
public class DeleteClusterResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
