package ksyun.client.postgresql.deleteinstancedatabase.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DeleteInstanceDatabaseResponse
 * @Description DeleteInstanceDatabase 返回体
 */
@Data
@ToString
public class DeleteInstanceDatabaseResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
