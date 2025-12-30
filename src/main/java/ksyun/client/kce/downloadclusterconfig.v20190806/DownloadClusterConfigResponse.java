package ksyun.client.kce.downloadclusterconfig.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DownloadClusterConfigResponse
* @Description DownloadClusterConfig 返回体
*/
@Data
@ToString
public class DownloadClusterConfigResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**是否开启apiserver访问
true：已开启
false：未开启*/
    @JsonProperty("Expose")
    private Boolean Expose;

    /**集群访问凭证
若Expose为false，该字段返回为空。*/
    @JsonProperty("ClusterConfig")
    private String ClusterConfig;

}
