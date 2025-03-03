package ksyun.client.sqlserver.finishimporttask.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname FinishImportTaskResponse
 * @Description FinishImportTask 返回体
 */
@Data
@ToString
public class FinishImportTaskResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
