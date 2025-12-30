package ksyun.client.sqlserver.finishimporttask.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname FinishImportTaskResponse
* @Description FinishImportTask 返回体
*/
@Data
@ToString
public class FinishImportTaskResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
