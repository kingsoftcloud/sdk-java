package ksyun.client.kec.createsnapshot.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSnapshotResponse
* @Description CreateSnapshot 返回体
*/
@Data
@ToString
public class CreateSnapshotResponse extends BaseResponseModel {

    /**生成的快照ID*/
    @JsonProperty("SnapshotId")
    private String SnapshotId;

    /**指定文件系统实例ID*/
    @JsonProperty("FileSystemId")
    private String FileSystemId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
