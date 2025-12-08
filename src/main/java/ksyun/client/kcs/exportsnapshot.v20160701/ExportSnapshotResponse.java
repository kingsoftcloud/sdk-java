package ksyun.client.kcs.exportsnapshot.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ExportSnapshotResponse
* @Description ExportSnapshot 返回体
*/
@Data
@ToString
public class ExportSnapshotResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
