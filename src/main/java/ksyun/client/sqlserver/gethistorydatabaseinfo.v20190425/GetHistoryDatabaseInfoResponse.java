package ksyun.client.sqlserver.gethistorydatabaseinfo.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetHistoryDatabaseInfoResponse
 * @Description GetHistoryDatabaseInfo 返回体
 */
@Data
@ToString
public class GetHistoryDatabaseInfoResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
