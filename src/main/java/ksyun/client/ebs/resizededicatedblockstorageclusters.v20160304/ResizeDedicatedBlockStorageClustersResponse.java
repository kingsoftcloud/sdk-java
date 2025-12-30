package ksyun.client.ebs.resizededicatedblockstorageclusters.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ResizeDedicatedBlockStorageClustersResponse
* @Description ResizeDedicatedBlockStorageClusters 返回体
*/
@Data
@ToString
public class ResizeDedicatedBlockStorageClustersResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
