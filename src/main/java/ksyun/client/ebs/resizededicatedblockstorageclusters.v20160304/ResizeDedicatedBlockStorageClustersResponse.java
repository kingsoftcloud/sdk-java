package ksyun.client.ebs.resizededicatedblockstorageclusters.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ResizeDedicatedBlockStorageClustersResponse
 * @Description ResizeDedicatedBlockStorageClusters 返回体
 */
@Data
@ToString
public class ResizeDedicatedBlockStorageClustersResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
